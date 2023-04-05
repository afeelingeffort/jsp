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

@WebServlet("/uploadProc")
@MultipartConfig
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
		// form태그 name file을 갖고 옴.
		Part filePart = request.getPart("file");
		System.out.println("파일 확인 : " + filePart.getContentType()); // 마임 타입
		System.out.println("파일 확인(바이트 기반) : " + filePart.getSize()); // 바이트 기반 파일 크기
		System.out.println("파일 확인(파일 이름) : " + filePart.getSubmittedFileName()); // 파일 이름

		// 입력 스트림 준비
		InputStream fileContent = filePart.getInputStream();
		// 출력 스트림 준비 : 내 서버 컴퓨터에 File 객체 만들어서 저장할 계획
		OutputStream outputStream = null;

		try {
			// 랜덤한 문자열을 여기서 생성
			UUID uuid = UUID.randomUUID();
			System.out.println("uuid : " + uuid);
			// uuid : 8c5ff259-676b-420e-9d6b-a6a35e5e483f
			String fileName = uuid + "_" + filePart.getSubmittedFileName();

			// 1단계 : 파일을 저장할 폴더를 미리 만들어두기
			// C드라이버에 jsp_upload 폴더 만들기
			// 파일 객체를 만드는데 fileName을 만들어라
			File file = new File("C:/jsp_upload/", fileName);

			// 파일 출력 스트림 생성
			outputStream = new FileOutputStream(file);

			// 입력 스트림에서 바이트 단위로 읽어오면서 출력 스트림에 쓰기
			byte[] buffer = new byte[1024];
			int length;

			while ((length = fileContent.read(buffer)) != -1) {
				outputStream.write(buffer, 0, length);
			}

			System.out.println("File upload success");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fileContent.close();
			if(outputStream != null) {
				outputStream.flush();
				outputStream.close();
			}
			// web.xml에 선언해놔서 프로젝트명만 써도 됨.
			response.sendRedirect("/demo11");
		}

	}

}
