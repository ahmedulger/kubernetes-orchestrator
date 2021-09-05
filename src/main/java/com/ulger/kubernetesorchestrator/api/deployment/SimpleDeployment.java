package com.ulger.kubernetesorchestrator.api.deployment;

public class SimpleDeployment implements Deployment {

    private String id;
    private String status;
    private long createdDateInUtc;

    public SimpleDeployment(String id, String status, long createdDateInUtc) {
        this.id = id;
        this.status = status;
        this.createdDateInUtc = createdDateInUtc;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public long getCreatedDateInUtc() {
        return createdDateInUtc;
    }
}