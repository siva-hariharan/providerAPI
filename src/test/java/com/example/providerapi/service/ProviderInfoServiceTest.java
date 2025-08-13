package com.example.providerapi.service;

import com.example.providerapi.model.ProviderInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProviderInfoServiceTest {

    @Autowired
    private ProviderInfoService providerInfoService;

    @Test
    void shouldReturnTenProviders() {
        List<ProviderInfo> providers = providerInfoService.getProviderInfo();
        assertEquals(10, providers.size());
    }
}
