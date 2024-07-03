package com.jaya.MetroApplication.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * profileservice
 */
@Service
public class Profileservice {
@Autowired
private ProfileDao dao;

    public ProfileDto saveService(ProfileDto p){
        return dao.savedao(p);
    }
}