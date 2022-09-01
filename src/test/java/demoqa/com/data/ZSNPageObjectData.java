package demoqa.com.data;

public class ZSNPageObjectData {
    String firstName;
    String lastName;
    String email;
    String gender;
    String mobile;
    String dateOfBirth;
    String hobbies;
    String picture;
    String currentAddress;
    String state;
    String city;
    String[] subjects = {"Maths", "Computer Science"};

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getCity() {
        return city;
    }

    public String getPicture() {
        return picture;
    }

    public String getState() {
        return state;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public ZSNPageObjectData(String firstName, String lastName, String email, String gender, String mobile, String dateOfBirth, String hobbies, String picture, String currentAddress, String state, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        this.dateOfBirth = dateOfBirth;
        this.hobbies = hobbies;
        this.picture = picture;
        this.currentAddress = currentAddress;
        this.state = state;
        this.city = city;
    }
}
