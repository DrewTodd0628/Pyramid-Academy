package com.SpringRestDemo.demo.Service;

import com.SpringRestDemo.demo.DBC.AlbumDBC;
import com.SpringRestDemo.demo.Entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImpl implements AlbumService{

    @Autowired
    AlbumDBC albumDBC;
    @Override
    public List<Album> getAlbums() {

        return albumDBC.findAll();
    }

    @Override
    public Album getAlbumById(int albumID) {

        Optional<Album> albumOpt = albumDBC.findById(albumID);
        Album album = null;

        if (albumOpt.isPresent()) {
            album = albumOpt.get();
        } else {
            throw new RuntimeException("Couldn't find album with ID: " + albumID);
        }
        return album;
    }

    @Override
    public Album addAlbum(Album album) {
        return albumDBC.save(album);
    }

    @Override
    public Album updateAlbum(Album album) {
        return albumDBC.save(album);
    }

    @Override
    public String deleteAlbum(int albumID) {

        albumDBC.deleteById(albumID);
        return "Deleted album with ID: " + albumID;
    }
}
