package com.sinocat.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinocat.entity.Image;
import com.sinocat.service.MogoService;

@Controller
public class MogoController {
	
	@Autowired
	private MogoService mogoService;
	
	@ResponseBody
	@RequestMapping("/findImages.action")
	public List<Image> findImages(HttpServletRequest request){
		List<Image> images=getImages(request);
		return images;
	}
	
	public List<Image> getImages(HttpServletRequest request){
		delPath();
		String UPLOADED_FOLDER = getPath(request);
		UPLOADED_FOLDER +="//picture//";
		File file = new File(UPLOADED_FOLDER);
		if(!file.exists()) {//如果文件夹不存在
			file.mkdir();//创建文件夹
		}
		System.out.println(UPLOADED_FOLDER);
		List<Image> images = mogoService.findImages();
		for(int i=0;i<images.size();i++) {
			Image image=images.get(i);
			Path path = Paths.get(UPLOADED_FOLDER+image.getFileName());
			byte[] bytes = image.getImge();
			try {
				Files.write(path, bytes);
				image.setImge(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return images;
	}
	
    public String getPath(HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath("/");
        path = path.replaceAll("\\\\", "/");
        return path;
    }
    
    public void delPath() {
		// TODO Auto-generated method stub
		String filePath = "f:\\111\\";
		System.out.println("开始删除文件");
		File file = new File(filePath);
//		deleteFile(file);
		deleteAllFilesOfDir(file);
		System.out.println("删除成功！！");
	}
    
    public static void deleteAllFilesOfDir(File path) {
		if (!path.exists())
			return;
		if (path.isFile()) {
			path.delete();
			return;
		}
		File[] files = path.listFiles();
		for (int i = 0; i < files.length; i++) {
			deleteAllFilesOfDir(files[i]);
		}
		path.delete();
	}
}
