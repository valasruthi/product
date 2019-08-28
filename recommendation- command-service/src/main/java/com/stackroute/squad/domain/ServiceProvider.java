package com.stackroute.squad.domain;


import lombok.*;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ServiceProvider
{
    @Id
    private long id;
    private String name;
    private long mobile;
    private String emailId;
    private String domain;
    private String previousProject;
    private double cost;
    private String from;
    private String to;

    @Relationship(type = "has_role", direction = Relationship.OUTGOING)
    private List<Roles> rolesList ;
    @Relationship(type = "has_skills", direction = Relationship.OUTGOING)
    private List<RoleSkill> roleSkillList;


}
