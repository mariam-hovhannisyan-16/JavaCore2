package homework.homework10.medicalCenter.model;

public class Doctor extends Person {
    private String email;
    private String profession;

    public Doctor(String id, String name, String surname, String phone, String email, String profession) {
        super();
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
        super();
    }

    public String getId(String id) {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        setPhone(phoneNumber);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                super.toString() +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

}

