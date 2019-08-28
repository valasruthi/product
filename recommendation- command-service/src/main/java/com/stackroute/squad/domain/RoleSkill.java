package com.stackroute.squad.domain;


import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleSkill
{
    @Id
    private long id;
    private List<String> skillName;
//    @Relationship(type = "has_skill", direction = Relationship.INCOMING)
//    private List<ServiceProvider> serviceProviderList;
}
