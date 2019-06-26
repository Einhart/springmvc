package com.woniu.i_upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("upload")
public class UploadController {
	
	@RequestMapping("upload")
	public String upload(@RequestParam CommonsMultipartFile photo, HttpServletRequest request) {
		try {
			String of = photo.getOriginalFilename();
			int dot = of.lastIndexOf(".");
			//获取照片后缀
			String ext = of.substring(dot);
			String newName = UUID.randomUUID().toString().replace("-", "")+ext;
			//获取应用在服务器上的真实路径
			String path = request.getServletContext().getRealPath("/images");
			File file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
			//存盘
			photo.transferTo(new File(file, newName));
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
