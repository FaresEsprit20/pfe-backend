package com.github.workTimeMangementGithub.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Epic extends Issue {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Sprint sprint;

	@OneToMany(mappedBy = "epic")
	private List<Story> stories = new ArrayList<Story>();


	@ManyToOne
	private ProductBacklog productBacklog;
}
