package id.project.hireka.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "resume")
public class ResumeEntity {
    @Id
    @Column(name = "id", updatable = false, nullable = false, length = 36)
    private String id;
    private String name;
    private String email;
    private String skills;
    private String experience;

    public ResumeEntity() {
        this.id = UUID.randomUUID().toString();
    }

    public ResumeEntity(String id, String name, String email, String skills, String experience) {
        this.id = (id != null) ? id : UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.experience = experience;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }
}

