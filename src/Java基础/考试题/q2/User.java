package Java基础.考试题.q2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private String gender;
    private Long id;
    private String name;
    private LocalDate birthday;

    @Override
    public String toString() {
        return "User{" +
                "gender='" + gender + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
