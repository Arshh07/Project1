package com.hub.skillhub.service;

import com.hub.skillhub.model.Skill;
import com.hub.skillhub.repository.SkillRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SkillService {

    private final SkillRepository repo;

    public SkillService(SkillRepository repo) {
        this.repo = repo;
    }

    public List<Skill> findAll() {
        return repo.findAll();
    }

    public Skill save(Skill skill) {
        return repo.save(skill);
    }
}
