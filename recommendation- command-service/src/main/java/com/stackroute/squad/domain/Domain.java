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
public class Domain
{
    @Id
    private long domainId;
    private String domainName;


//    @Relationship(type = "has", direction = Relationship.INCOMING)
//    private List<SubDomain> subDomainList;
}
