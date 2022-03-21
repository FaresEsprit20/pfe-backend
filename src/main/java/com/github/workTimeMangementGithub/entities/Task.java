package com.github.workTimeMangementGithub.entities;



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
public class Task extends Issue{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long estimation;
	@Enumerated(EnumType.STRING)
	private ComplexityType complexity;
	@Enumerated(EnumType.STRING)
	private PriorityType priority;
	@OneToOne
	private Sprint sprint;
	@ManyToOne
	private Story story;
	
}
