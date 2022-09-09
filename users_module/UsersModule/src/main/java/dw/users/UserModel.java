package dw.users;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private UserType userType;
    private String firstName;
    private String lastName;
    private String assignment;

    public UserModel(UserType userType, String firstName, String lastName, String assignment) {
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.assignment = assignment;
    }
}
