package com.example.urlhitcounter.controller;

import com.example.urlhitcounter.model.Visit;
import com.example.urlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;


    @GetMapping("/{username}/count")
    public Visit getCount(@PathVariable String username) {
        Visit visit=urlHitService.getVisits(username);
        return visit;
    }

}