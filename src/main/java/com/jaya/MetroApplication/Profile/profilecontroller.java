package com.jaya.MetroApplication.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class Profilecontroller {
    @Autowired
    private Profileservice profileservice;

    @PostMapping("/save")
    public ProfileDto SaveControllerProfile(@RequestBody ProfileDto p){
return profileservice.saveService(p);
    }

//     @GetMapping("/all")
//     public List<ProfileDto> getAllControllerProfile(ProfileDto profileDto){
// return profileservice.getServiceprofile();

//     }
}
