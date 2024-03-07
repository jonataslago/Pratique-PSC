package main.java.com.ibmrCollege.pratique.model;

public class User {
    private String name;
    private String password;
    private Integer age;
    private String email;
    private String tellNumber;
    private String city;
    private String state;

    //Constructor
    public User( String name, String password, Integer age, String email, String tellNumber, String city, String state){
        this.name = name;
        this.password = password;
        this.age = age;
        this.email = email;
        this.tellNumber = tellNumber;
        this.city = city;
        this.state = state;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTellNumber() {
        return tellNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTellNumber(String tellNumber) {
        this.tellNumber = tellNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}





