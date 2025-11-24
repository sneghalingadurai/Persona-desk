package com.persona.desk.controller;

import com.persona.desk.entity.Profile;
import com.persona.desk.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user-profile-service")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }


    @GetMapping("/home")
    public String home(){
        return "Hello , I am PersonaDesk";
    }

    @GetMapping("/profile/{id}")
    public String getProfile(@PathVariable(name = "id") int userId){
        Optional<Profile> profile = profileService.getUserProfileData(userId);
        if(profile.isPresent()){
            Profile prof = profile.get();
            return "Hi "+ prof.getName() + ", your user name is " + prof.getUsername();
        }else{
            return "Profile Not found";
        }
    }

    @PostMapping("/addProfile")
    public Profile addUser(@RequestBody Profile profile){
        return profileService.addUser(profile);
    }

    @PostMapping("/updateProfile")
    public Profile updateProfile(@RequestBody Profile profile){
        return profileService.updateUserDetails(profile);
    }

    @DeleteMapping("/deleteProfile/{id}")
    public String deleteProfile(@PathVariable int id){
        return profileService.deleteProfile(id);
    }

}
