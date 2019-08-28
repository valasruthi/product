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
public class Idea
{
    @Id
    private long id;
    private String title;
    private String description;
    private String duration;
    private double cost;
    private String status;
    @Relationship(type = "belongs_to", direction = Relationship.OUTGOING)
    private List<SubDomain> subDomainList;
    @Relationship(type = "requires", direction = Relationship.OUTGOING)
    private List<Roles> rolesList;
    @Relationship(type = "needs", direction = Relationship.OUTGOING)
    private List<RoleSkill> roleSkillList;
    @Relationship(type = "worked_on", direction = Relationship.INCOMING)
    private List<ServiceProvider> serviceProviderList;

}


//@Relationship(type = "ACTOR", direction = Relationship.INCOMING)