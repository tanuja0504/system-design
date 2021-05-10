package eCommerce;

public class Account {
    String username;
    String password;
    String name;
    String address;
    String email;
    String contact;

    public String getShippingAddress() {
        return this.address;
    }

    public String getContactInfo() {
        return contact;
    }
}
