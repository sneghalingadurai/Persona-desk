package com.persona.desk.service;

import com.persona.desk.entity.Profile;
import com.persona.desk.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    private final ProfileRepository profileRepo;

    ProfileService(ProfileRepository repo){
        this.profileRepo = repo;
    }

    public Optional<Profile> getUserProfileData(int id){
        return profileRepo.findById(id);
    }

    public Profile addUser(Profile profile) {
        return profileRepo.save(profile);
    }

    public Profile updateUserDetails(Profile profile) {
        return profileRepo.save(profile);
    }

    public String deleteProfile(int id) {
        Optional<Profile> profile = profileRepo.findById(id);
        if(profile.isPresent()){
            profileRepo.deleteByGmail(profile.get().getGmail());
            return "Deleted Successfully";
        }
        return "";
    }
}
