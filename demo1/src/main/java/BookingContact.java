public class BookingContact {
private String emailAddress;
private String PhoneNumber;

public  BookingContact(){
    
}


    public BookingContact(String emailAddress, String phoneNumber) {
        this.emailAddress = emailAddress;
        PhoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BookingContact{" +
                "emailAddress='" + emailAddress + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
