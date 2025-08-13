package com.example.providerapi.controller;

import com.example.providerapi.model.ProviderInfo;
import com.example.providerapi.service.ProviderInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {

    private final ProviderInfoService providerInfoService;

    public ProviderController(ProviderInfoService providerInfoService) {
        this.providerInfoService = providerInfoService;
    }

    @GetMapping("/getProviderInfo")
    public List<ProviderInfo> getProviderInfo() {
        return providerInfoService.getProviderInfo();
    }
}
