package id.project.hireka.controller;

import id.project.hireka.dto.request.ResumeRequest;
import id.project.hireka.dto.response.ResumeResponse;
import id.project.hireka.service.ResumeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resumes")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("/analyze")
    public ResumeResponse analyzeResume(@RequestBody ResumeRequest request) {
        return resumeService.analyzeResume(request);
    }
}
