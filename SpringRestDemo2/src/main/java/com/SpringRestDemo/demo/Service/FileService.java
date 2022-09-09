package com.SpringRestDemo.demo.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.SpringRestDemo.demo.DBC.FileDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.SpringRestDemo.demo.Entity.File;

@Service
public class FileService {

	@Autowired
	private FileDBC fileDBC;


	public String save(MultipartFile file) throws IOException {
		String fileName = file.getOriginalFilename();
		File fileDB = new File(UUID.randomUUID().toString(), fileName, file.getContentType(), file.getBytes());
		fileDBC.save(fileDB);
		return  "Saved to server.";
	}

	public File getFileByID(String id) {

		Optional<File> fileOptional = fileDBC.findById(id);

		if(fileOptional.isPresent()) {
			return fileOptional.get();
		}
		return null;
	}

	public List<File> getFiles(){
		return fileDBC.findAll();
	}


}
