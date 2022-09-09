package com.SpringRestDemo.demo.DBC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SpringRestDemo.demo.Entity.File;

@Repository
public interface FileDBC extends JpaRepository<File, String>{

}
