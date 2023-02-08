package io.cellulant.gbp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Generated
    @Id
    private Long userId;
    private String firstName;
    private  String lastName;
    private String email;

}
