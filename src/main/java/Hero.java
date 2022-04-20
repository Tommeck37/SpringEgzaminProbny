import java.io.Serializable;
import java.time.LocalDate;

public class Hero implements Comparable<Hero>, Serializable {

    private String name;
    private Long power;
    private LocalDate dateOfBirth;

    public Hero(String name, Long power, LocalDate dateOfBirth, String phoneNumber) {
        this.name = name;
        this.power = power;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Hero o) {
        if (this.power != null && o.getPower() != null) {
            return (int) (o.power - this.power);
        } else {
            return 0;
        }


    }
}