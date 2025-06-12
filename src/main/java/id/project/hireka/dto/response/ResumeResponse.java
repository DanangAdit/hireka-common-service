package id.project.hireka.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResumeResponse {
    private String name;
    private String email;
    private String recommendation;
    private String match_score;
}

