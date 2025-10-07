package com.hub.skillhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hub.skillhub.model.Skill; // import Skill entity

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
