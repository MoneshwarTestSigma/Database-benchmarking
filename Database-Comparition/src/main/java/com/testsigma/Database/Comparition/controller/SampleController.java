package com.testsigma.Database.Comparition.controller;

import com.testsigma.Database.Comparition.model.SampleEntity;
import com.testsigma.Database.Comparition.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/test")
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @GetMapping("/entities")
    public List<SampleEntity> getAllEntities() {
        return sampleService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }
}
