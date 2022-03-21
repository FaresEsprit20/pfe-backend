package com.github.workTimeMangementGithub.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Card implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(unique = true)
	private Long id;
	private Long content_id;
	private String content_type ="Issue";
	@OneToOne
	private Issue issue;

	@ManyToOne
	private ColumnP columnP;	

}
