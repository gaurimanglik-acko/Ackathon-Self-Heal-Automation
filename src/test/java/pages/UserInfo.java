package pages;

public class UserInfo {
    String firstName;
    String lastName;
    String username;
    String email;
    String address1;
    String address2;
    int country;
    int state;
    String zipCode;
    String cardName;
    String cardNumber;
    String cardExpiration;
    String cardCVV;


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
        return this.address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public int getCountry() {
        return this.country;
    }

    public int getState() {
        return this.state;
    }

    public String getZip() {
        return this.zipCode;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCardExpiration() {
        return this.cardExpiration;
    }

    public String getCardCVV() {
        return this.cardCVV;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.firstName = lastName;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public void setEmail (String email) {
        this.email = email ;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setZip(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardExpiration (String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public void setCardCVV (String cardCVV) {
        this.cardCVV = cardCVV;
    }
}
