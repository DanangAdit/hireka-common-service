package id.project.hireka.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResumeRequest {
    private String name;
    private String email;
    private String skills;
    private String experience;
    private String job_description;
}
