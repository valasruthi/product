package com.stackroute.squad.domain;

import lombok.*;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;
import java.util.List;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class IdeaHamster
{
    @Id
    private long id;
    private String name;
    private long mobile;
    private String emailId;
//    private String status;
    private Date postedOn;
    @Relationship(type = "posted", direction = Relationship.OUTGOING)
    private List<Idea> ideas;
}
