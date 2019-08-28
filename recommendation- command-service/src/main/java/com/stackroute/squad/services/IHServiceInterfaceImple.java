package com.stackroute.squad.services;

import com.stackroute.squad.domain.IdeaHamster;
import com.stackroute.squad.repository.IHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class IHServiceInterfaceImple implements IHServiceInterface
{
    private IHRepository ihRepository;

    @Autowired
    public IHServiceInterfaceImple(IHRepository ihRepository)
    {
        this.ihRepository=ihRepository;
    }

    @Override
    public IdeaHamster saveIdeaHamster(IdeaHamster ideaHamster) {
        IdeaHamster ideaHamster1=ihRepository.save(ideaHamster);
        return ideaHamster1;
    }

    @Override
    public Iterable<IdeaHamster> getAllIdea()
    {
        Iterable<IdeaHamster> ideaHamster=ihRepository.findAll();
        return ideaHamster;
    }
}
