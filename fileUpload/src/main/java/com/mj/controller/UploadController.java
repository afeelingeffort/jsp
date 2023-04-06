package com.mj.controller;

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
@MultipartConfig
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UploadController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part filePart = request.getPart("file");
		
		InputStream fileContent = filePart.getInputStream();
		OutputStream outputStream = null;
		
		try {
			UUID uuid = UUID.randomUUID();
			String fileName = uuid + "_" + filePart.getSubmittedFileName();
			
			String saveDirectory = "C:/fileUpload";
			File dir = new File(saveDirectory);
			
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			File file = new File("C:/fileUpload/", fileName);
			
			outputStream = new FileOutputStream(file);
			
			byte[] buffer = new byte[1024];
			int length;
			
			while((length = fileContent.read(buffer))!= -1) {
				outputStream.write(buffer, 0, length);
			}
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			fileContent.close();
			if(outputStream != null) {
				outputStream.flush();
				outputStream.close();
			}
			
			response.sendRedirect("/fileUpload/upload.jsp");
		}
	}

}
