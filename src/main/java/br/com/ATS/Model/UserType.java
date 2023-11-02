package br.com.ATS.Model;
import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.*;

@Entity(name="user_type")
@Table(name = "user_type")
public class UserType implements GrantedAuthority  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type_name")
    private String typeName;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String getAuthority() {
        return typeName;
    }

}
