package kdima90.openschool.user.entity;

import jakarta.persistence.*;

import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "users", schema = "openschool_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column private String firstname;
    @Column private String lastname;
    @Column private String street;
    @Column private Integer streetNumber;
    @Column private String city;
    @Column private String postalCode;
    @Column private String federalState;
    @Column private String email;
    @Column private Locale locale;

    @ManyToOne
    private School school;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFederalState() {
        return federalState;
    }

    public void setFederalState(String federalState) {
        this.federalState = federalState;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(street, user.street) && Objects.equals(streetNumber, user.streetNumber) && Objects.equals(city, user.city) && Objects.equals(postalCode, user.postalCode) && Objects.equals(federalState, user.federalState) && Objects.equals(email, user.email) && Objects.equals(locale, user.locale) && Objects.equals(school, user.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, street, streetNumber, city, postalCode, federalState, email, locale, school);
    }
}
