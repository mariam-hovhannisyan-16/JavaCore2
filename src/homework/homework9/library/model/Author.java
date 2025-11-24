package homework.homework9.library.model;

import java.util.Objects;

public class Author {

    private String name;
    private String surname;
    private int age;
    private String phoneNumber;

    public  Author(String name, String surname, int age, String phoneNumber ){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public  Author() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() !=  o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age &&
                name.equals(author.name) &&
                surname.equals(author.surname) &&
                phoneNumber.equals(author.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,surname,age,phoneNumber);
    }

    @Override
    public String toString() {
        return  "Author{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber +
                '}';

    }


}
