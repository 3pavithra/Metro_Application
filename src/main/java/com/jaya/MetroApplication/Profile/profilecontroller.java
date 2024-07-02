package com.jaya.MetroApplication.Profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class Profilecontroller {
    @Autowired
    private Profileservice profileservice;

    @PostMapping("/save")
    public ProfileDto SaveControllerProfile(ProfileDto profileDto){
return profileservice.SaveServiceprofile(profileDto);
    }

    @GetMapping("/all")
    public List<ProfileDto> getAllControllerProfile(ProfileDto profileDto){
return profileservice.getServiceprofile();

    }
}
