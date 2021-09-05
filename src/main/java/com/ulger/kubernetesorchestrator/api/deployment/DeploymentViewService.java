package com.ulger.kubernetesorchestrator.api.deployment;

import java.util.Set;

/**
 * List deployments in different statuses on kubernetes
 */
public interface DeploymentViewService {

    /**
     * List currently working deployments on cluster
     * @return List of deployments
     */
    Set<Deployment> getAvailableDeployments();

    /**
     * Gives deployment details
     *
     * @param deploymentId
     * @return Deployment details
     */
    Deployment getDeploymentDetail(String deploymentId);
}