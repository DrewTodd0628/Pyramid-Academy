package com.SpringRestDemo.demo.Service;

import com.SpringRestDemo.demo.Entity.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Base64;
import java.util.List;


// Build HTML for webpage
@Service
public class PageService {

    @Autowired
    private FileService fileService;

    public String buildPage(File file) {

        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style=\"margin:0px;\"><div id=\"header\" style=\"background:#80ea6e;height:60px;\" ><p id=\"title\" style=\"position:absolute;left:20px;color:#fff;font-family:system-ui;font-size:30px;margin-top:8px;font-weight:600;\" >Spring Media</p></div>");
        sb.append(buildImage(file));
        sb.append("</body></html>");

        return sb.toString();
    }

    public String buildPage(List<File> fileList) {

        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style=\"margin:0px;\"><div id=\"header\" style=\"background:#80ea6e;height:60px;\" ><p id=\"title\" style=\"position:absolute;left:20px;color:#fff;font-family:system-ui;font-size:30px;margin-top:8px;font-weight:600;margin-bottom:5px;\" >Spring Media</p></div>");

        for (File file:fileList) {
            sb.append(buildImage(file));
        }

        sb.append("</body></html>");

        return sb.toString();
    }

    public String buildImage(File file) {

        byte[] data = file.getData();
        String dataBase64 = Base64.getEncoder().encodeToString(data);

        return "<img src=\"data:image/png;base64," + dataBase64 + "\" style=\"border-radius: 10px;margin: 5px\">";
    }
}
