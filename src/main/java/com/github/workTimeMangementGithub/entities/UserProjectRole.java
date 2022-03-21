package com.github.workTimeMangementGithub.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class UserProjectRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long projectId;
    @Enumerated(EnumType.STRING)
    private UserPermissionType userPermission;
    @Enumerated(EnumType.STRING)
    private UserRoleType userRole;

}
