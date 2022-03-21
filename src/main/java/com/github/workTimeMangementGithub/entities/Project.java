package com.github.workTimeMangementGithub.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Project implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true)
	private Long id;
	@Column(unique = true)
	private Long projectNumber;
	@Column(length = 20)
	private String name;
	@Column(length = 100, nullable = true)
	private String body;
	@Enumerated(EnumType.STRING)
	private StateType state = StateType.open;
	@Column(nullable = true)
	private boolean visibility;

	@ManyToOne
	private GithubRepository githubRepository;

	@OneToMany(mappedBy = "project")
	private List<ColumnP> columnPs = new ArrayList<>();
	@ManyToMany
	private List<Team> teams = new ArrayList<>();




}
