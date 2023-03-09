package com.uow.expensetrackingbudgetingapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VersionController {

    @Value("${app.version}")
    private String version;

    @Value("${app.name}")
    private String appName;

    @GetMapping("/version")
    public Map<String, String> getVersion() {
        Map<String, String> versionMap = new HashMap<>();
        versionMap.put("app", appName);
        versionMap.put("version", version);
        return versionMap;
    }

}
