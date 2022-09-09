package com.SpringRestDemo.demo.Controller;

import com.SpringRestDemo.demo.Entity.Album;
import com.SpringRestDemo.demo.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/")
    public String home() {
        return "<HTML><BODY>" +
                "<h2>Spring Media</h2><p>Welcome to Spring Media!</p>" +
                "</br> <a href=\"http://localhost:8080/albums\">See all albums</a>" +
                "</br> <a href=\"http://localhost:8080/album?a=0\">See album</a></BODY></HTML>";
    }

    @GetMapping("/albums")
    public List<Album> getAlbums() {

        return albumService.getAlbums();
    }

    @GetMapping("/album")
    public Album getAlbums(@RequestParam(value="a", defaultValue="all") String id) {

        return albumService.getAlbumById(Integer.parseInt(id));
    }

    @PostMapping("/albums")
    public Album addAlbum(@RequestBody Album album) {

        return this.albumService.addAlbum(album);
    }

    @PutMapping("/albums")
    public Album updateAlbum(@RequestBody Album album) {

        return this.albumService.updateAlbum(album);
    }

    @DeleteMapping("/album")
    public String deleteAlbum(@RequestParam(value="a") String id) {

        return this.albumService.deleteAlbum(Integer.parseInt(id));
    }
}
