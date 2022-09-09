package com.SpringRestDemo.demo.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileResponse {

	private String id;
	private String type;
	private String name;

	public FileResponse() {
	}
	public FileResponse(String id, String type, String name) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
	}

}
