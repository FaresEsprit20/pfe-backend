package com.github.workTimeMangementGithub.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Team implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;
	@Column(length = 20)
	private String name;
	@Column(nullable = true, length = 50)
	private String slug;
	@Column(length = 100, nullable = true)
	private String description;
	@ManyToMany
	List<Project> projects;
	@ManyToMany
	private List<User> users = new ArrayList<>();
	
	
	
}
