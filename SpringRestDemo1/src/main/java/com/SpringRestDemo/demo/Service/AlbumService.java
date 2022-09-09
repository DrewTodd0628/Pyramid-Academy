package com.SpringRestDemo.demo.Service;

import com.SpringRestDemo.demo.Entity.Album;

import java.util.List;

public interface AlbumService {

    List<Album> getAlbums();
    Album getAlbumById(int albumID);
    Album addAlbum(Album album);
    Album updateAlbum(Album album);
    String deleteAlbum(int albumID);
}
