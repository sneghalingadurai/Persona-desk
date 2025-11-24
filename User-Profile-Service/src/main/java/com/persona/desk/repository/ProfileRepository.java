package com.persona.desk.repository;

import com.persona.desk.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    @Transactional
    void deleteByGmail(String gmail);
}
