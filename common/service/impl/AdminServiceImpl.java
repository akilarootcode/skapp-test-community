package com.skapp.community.common.service.impl;

import com.skapp.community.common.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    public String testCommunityService() {
        return "test";
    }
}
