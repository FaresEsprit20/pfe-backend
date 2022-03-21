package com.github.workTimeMangementGithub.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Story extends Issue {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Epic epic;

	@OneToOne
	private Sprint sprint;

	@OneToMany(mappedBy = "story")
	private List<Task> tasks = new ArrayList<Task>();
	
}
