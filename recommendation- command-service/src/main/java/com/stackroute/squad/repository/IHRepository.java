package com.stackroute.squad.repository;

import com.stackroute.squad.domain.IdeaHamster;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;

@Repository
public interface IHRepository extends Neo4jRepository<IdeaHamster,Long>
{
//Collection<IdeaHamster> getAllIdea();
}
