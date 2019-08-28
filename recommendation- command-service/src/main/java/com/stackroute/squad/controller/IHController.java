package com.stackroute.squad.controller;

import com.stackroute.squad.domain.IdeaHamster;
import com.stackroute.squad.services.IHServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/")
public class IHController
{

    private IHServiceInterface ihServiceInterface;
    public IHController()
    {

    }
    @Autowired
    public IHController(IHServiceInterface ihServiceInterface)
    {
        this.ihServiceInterface=ihServiceInterface;
    }
    @PostMapping("ih")
    public ResponseEntity<?> saveIH(@RequestBody IdeaHamster ideaHamster)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        ideaHamster.setPostedOn(dateobj);
        IdeaHamster ideaHamster1=ihServiceInterface.saveIdeaHamster(ideaHamster);
        return new ResponseEntity<>(ideaHamster1, HttpStatus.CREATED);
    }
    @GetMapping("getAll")
    public ResponseEntity<?> getAllIH()
    {
        Iterable<IdeaHamster> ideaHamsters=ihServiceInterface.getAllIdea();
        return new ResponseEntity<>(ideaHamsters,HttpStatus.FOUND);
    }
}
