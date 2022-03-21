package com.github.workTimeMangementGithub.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class Issue implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(unique = true)
    private Long id;

    @Column(unique = true)
    private Long issueNumber;

    @Enumerated(EnumType.STRING)
    private IssueType type;

    private String title;

    @Column(nullable = true)
    private String body;

    @Enumerated(EnumType.STRING)
    private IssueStatus status = IssueStatus.TO_DO;

    @Enumerated(EnumType.STRING)
    private StateType state = StateType.open;

    @Enumerated(EnumType.STRING)
    private PriorityType priority;

    @Enumerated(EnumType.STRING)
    private ComplexityType complexity;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    @OneToOne
    private Card card;

    @ManyToOne
    private GithubRepository githubRepository;

    @Column(nullable = true)
    private String issueOwner;

    @OneToMany(mappedBy = "issue")
    private List<Attachement> attachements = new ArrayList<>();

    @ManyToMany
    private List<Label> labels = new ArrayList<>();
    @ManyToMany
    private List<User> assignees = new ArrayList<>();


}
