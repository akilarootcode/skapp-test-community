package com.skapp.community.people.service.impl;

import com.skapp.community.common.service.AdminService;
import com.skapp.community.people.service.AdminServiceEnterprise;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceEnterpriseImpl implements AdminServiceEnterprise{

    @NonNull
    private final AdminService adminService;

}
