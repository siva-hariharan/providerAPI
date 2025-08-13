package com.example.providerapi.model;

public class ProviderInfo {
    private final String providerId;
    private final String name;
    private final String address;

    public ProviderInfo(String providerId, String name, String address) {
        this.providerId = providerId;
        this.name = name;
        this.address = address;
    }

    public String getProviderId() {
        return providerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
