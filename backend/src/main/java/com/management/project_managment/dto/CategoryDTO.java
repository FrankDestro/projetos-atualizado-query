package com.management.project_managment.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private String description;

}
