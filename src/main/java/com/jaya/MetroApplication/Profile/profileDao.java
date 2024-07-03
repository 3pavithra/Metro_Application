package com.jaya.MetroApplication.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileDao {
@Autowired
private ProfileRepo repo;
    
    public ProfileDto savedao(ProfileDto p){
        return repo.save(p);
    }
}