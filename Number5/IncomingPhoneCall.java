public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(0.02);
    }

    @Override
    public void displayInformation() {
        System.out.println("Incoming call from " + getPhoneNumber() + " at a rate of $" + getPrice() + " per minute.");
    }
}
