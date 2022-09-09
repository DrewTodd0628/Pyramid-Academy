package com.SpringRestDemo.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name ="tbl_files")
public class File {

	@Id
	private String id;
	private String name;
	private String type;
	@Lob
	private byte[] data;
	
	public File() {
	}
	public File(String id, String name, String type, byte[] data) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.data = data;
	}
}
