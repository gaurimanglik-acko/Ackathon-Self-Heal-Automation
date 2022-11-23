package pages;

public class UserInfo {
    String firstName;
    String lastName;
    String username;
    String email;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress1() {
        return "address dummy 1";
    }

    public String getAddress2() {
        return "address dummy 2";
    }

    public int getCountry() {
        return 1;
    }

    public int getState() {
        return 2;
    }

    public String getZip() {
        return "560043";
    }

    public String getCardName() {
        return "";
    }

    public String getCardNumber() {
        return "";
    }

    public String getCardExpiration() {
        return "";
    }

    public String getCardCVV() {
        return "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.firstName = lastName;
    }
}
