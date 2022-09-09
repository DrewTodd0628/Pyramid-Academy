package com.SpringRestDemo.demo.Controller;

import java.io.IOException;
import com.SpringRestDemo.demo.Service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.SpringRestDemo.demo.Service.FileService;

@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private FileService fileService;
    @Autowired
    private PageService pageService;

    @GetMapping("/{id}")
    public String getFile(@PathVariable String id) {
        return pageService.buildPage(fileService.getFileByID(id));
    }

    @GetMapping
    public String getFileList(){
        return pageService.buildPage(fileService.getFiles());
    }

    @PostMapping
    public String uploadFile(@RequestParam("file") MultipartFile  file) throws IOException {
        return fileService.save(file);
    }

}