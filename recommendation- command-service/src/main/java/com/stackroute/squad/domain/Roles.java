package com.stackroute.squad.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Roles
{
    @Id
    private long id;
    private String roleName;
    private int noOfPeople;
    private int experience;

//    @JsonIgnoreProperties("roles")
//    @Relationship(type = "has_role", direction = Relationship.INCOMING)
//    private List<HasRole> hasRoleList;


//    @JsonIgnoreProperties
//    @Relationship(type = "has_role", direction = Relationship.INCOMING)
//    private List<ServiceProvider> serviceProviderList;

}


