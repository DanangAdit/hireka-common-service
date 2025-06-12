package id.project.hireka.service;

import id.project.hireka.dto.request.ResumeRequest;
import id.project.hireka.dto.response.ResumeResponse;
import id.project.hireka.entity.ResumeEntity;
import id.project.hireka.repository.ResumeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResumeService {

    private final ResumeRepository resumeRepository;
    private final RestTemplate restTemplate;

    public ResumeService(ResumeRepository resumeRepository, RestTemplate restTemplate) {
        this.resumeRepository = resumeRepository;
        this.restTemplate = restTemplate;
    }

    public ResumeResponse analyzeResume(ResumeRequest request) {
        ResumeEntity resume = new ResumeEntity(null, request.getName(), request.getEmail(), request.getSkills(), request.getExperience());
        resumeRepository.save(resume);

        String aiServiceUrl = "http://localhost:8000/analyze";
        ResumeResponse aiResponse = restTemplate.postForObject(aiServiceUrl, request, ResumeResponse.class);

        return aiResponse;
    }
}
