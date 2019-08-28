package com.stackroute.squad.domain;

import lombok.*;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SubDomain
{
    @Id
    private long id;
    private String subDomainName;
    @Relationship(type = "has", direction = Relationship.INCOMING)
    private Domain domain;
}
