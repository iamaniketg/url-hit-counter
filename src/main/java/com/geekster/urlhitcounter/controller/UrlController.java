package com.geekster.urlhitcounter.controller;

import com.geekster.urlhitcounter.model.UrlModel;
import com.geekster.urlhitcounter.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitors-count/")
public class UrlController {
//    @Autowired
    private UrlService urlService;
    public UrlController(UrlService urlService){
        this.urlService = urlService;
    }
    @GetMapping("/username/{username}/count")
    public UrlModel getCount(@PathVariable String username){
     return urlService.getVisits(username);
    }
}
