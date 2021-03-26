package com.zl.jenkins.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDockerController {



    @GetMapping("/jenkinsDocker")
    public String test(){
        return "this is a jenkins  Docker Test";
    }
}
