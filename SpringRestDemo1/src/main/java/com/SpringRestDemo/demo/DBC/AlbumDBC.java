package com.SpringRestDemo.demo.DBC;

import com.SpringRestDemo.demo.Entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumDBC extends JpaRepository<Album, Integer> {


}
