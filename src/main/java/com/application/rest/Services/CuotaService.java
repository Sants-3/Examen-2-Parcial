package com.application.rest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.rest.Repositories.CuotaRepository;

@Service
public class CuotaService {

    @Autowired
    CuotaRepository cuotaRepository;
}
