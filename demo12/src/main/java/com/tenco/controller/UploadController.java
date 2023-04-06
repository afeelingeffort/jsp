package com.tenco.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig // 선언하기
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UploadController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 파일 업로드 처리
		// .getPart("name속성")
		Part filePart = request.getPart("file");
		System.out.println("컨텐츠 확인 : " + filePart.getContentType()); // 컨텐츠 확인 : image/png
		System.out.println("바이트 기준 : " + filePart.getSize()); // 바이트 기준 : 420284
		System.out.println("파일 이름 : " + filePart.getSubmittedFileName()); // 파일 이름 : Screenshot_21.png

		// 스트림 준비 filePart에 스트림을 연결하기
		InputStream fileContent = filePart.getInputStream();

		// 출력 스트림 준비 (우리 서버 컴퓨터에 출력할 예정)
		OutputStream outputStream = null;

		try {
			// 사용자 파일명 중복 방지
			UUID uuid = UUID.randomUUID();
			// db에서 구분하기 위해
			// 서버에서 저장되는 파일 이름 : uuid + "_" + filePart.getSubmittedFileName();
			// 원본 파일 이름 : filePart.getSubmittedFileName();
			String fileName = uuid + "_" + filePart.getSubmittedFileName();

			// 폴더를 코드상으로 직접 생성해보기 : 2단계
			String saveDirectory = "C:/demo12";
			File dir = new File(saveDirectory);

			// 파일이 있으면 true, 없으면 flase
			if (!dir.exists()) {
				dir.mkdirs();
			}

			// 미리 폴더를 만들어두자. : 1단계
			File file = new File("C:/demo12/", fileName);

			// 출력 스트림 사용
			outputStream = new FileOutputStream(file);

			// 빨리 읽어오기 위해
			byte[] buffer = new byte[1024];
			int length;

			// 한 번에 1024바이트 만큼 받아서 length에 담음.
			// fileContent.read(buffer) <- inputStream 읽음.
			while ((length = fileContent.read(buffer)) != -1) {
				// 1024 크기 바이트 읽었음.
				// 0번째부터 length까지 읽어라.
				outputStream.write(buffer, 0, length);
			}
			// 파일 생성 완료!
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fileContent.close();
			if (outputStream != null) {
				outputStream.flush();
				outputStream.close();
			}
			
			response.sendRedirect("/demo12/home.jsp");
		}
		
	}

}
