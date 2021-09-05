package com.ulger.kubernetesorchestrator.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/deployments")
public class DeploymentViewController {

    @GetMapping
    public ModelAndView render() {
        return new ModelAndView("deployments.html");
    }
}