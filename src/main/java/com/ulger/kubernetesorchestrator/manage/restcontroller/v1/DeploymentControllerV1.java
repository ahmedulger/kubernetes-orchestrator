package com.ulger.kubernetesorchestrator.manage.restcontroller.v1;

import com.ulger.kubernetesorchestrator.api.deployment.Deployment;
import com.ulger.kubernetesorchestrator.api.deployment.DeploymentOperatonsService;
import com.ulger.kubernetesorchestrator.api.deployment.DeploymentViewService;
import com.ulger.kubernetesorchestrator.api.deployment.SimpleDeployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value = "/deployment/v1")
public class DeploymentControllerV1 {

    private DeploymentViewService deploymentViewService;
    private DeploymentOperatonsService deploymentOperatonsService;

    @Autowired
    public DeploymentControllerV1(DeploymentViewService deploymentViewService, DeploymentOperatonsService deploymentOperatonsService) {
        this.deploymentViewService = deploymentViewService;
        this.deploymentOperatonsService = deploymentOperatonsService;
    }

    @GetMapping
    public Collection<Deployment> listDeployments() {

        Set<Deployment> deploymentSet = new HashSet<>();
        deploymentSet.add(new SimpleDeployment("id1", "status", 1));
        deploymentSet.add(new SimpleDeployment("id2", "status", 1));

        return deploymentSet;
    }

    @GetMapping("/start")
    public void startNewDeployment() {

    }

    @GetMapping("/{deploymentId}")
    public Deployment getDeploymentDetail(@PathVariable("deploymentId") String deploymentId) {
        return null;
    }

    @GetMapping("/{deploymentId}/stop")
    public void stopDeployment(@PathVariable("deploymentId") String deploymentId) {

    }
}