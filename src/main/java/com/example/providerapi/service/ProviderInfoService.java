package com.example.providerapi.service;

import com.example.providerapi.model.ProviderInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProviderInfoService {

    private final List<ProviderInfo> providers = IntStream.rangeClosed(1, 10)
            .mapToObj(i -> new ProviderInfo("P" + i, "Provider " + i, "Address " + i))
            .collect(Collectors.toList());

    public List<ProviderInfo> getProviderInfo() {
        return providers;
    }
}
