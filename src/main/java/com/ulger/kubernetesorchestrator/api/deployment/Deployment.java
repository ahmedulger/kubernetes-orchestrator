package com.ulger.kubernetesorchestrator.api.deployment;

public interface Deployment {

    String getId();

    String getStatus();

    long getCreatedDateInUtc();
}