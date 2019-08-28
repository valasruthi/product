package com.stackroute.squad.services;

import com.stackroute.squad.domain.IdeaHamster;

import java.util.Collection;

public interface IHServiceInterface
{
    public IdeaHamster saveIdeaHamster(IdeaHamster ideaHamster);
    public Iterable<IdeaHamster> getAllIdea();

}
