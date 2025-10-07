package com.hub.skillhub.controller;

import com.hub.skillhub.model.Job;
import com.hub.skillhub.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jobs")
public class JobController {
    private final JobService service;
    public JobController(JobService service) { this.service = service; }

    @GetMapping public String listJobs(Model model) {
        model.addAttribute("jobs", service.findAll());
        return "jobs";
    }

    @GetMapping("/post")
    public String showForm(Model model) {
        model.addAttribute("job", new Job());
        return "post-job";
    }

    @PostMapping("/post")
    public String postJob(@ModelAttribute Job job) {
        service.save(job);
        return "redirect:/jobs";
    }
}
