public class OutgoingPhoneCall extends PhoneCall {
    private int minutes;

    public OutgoingPhoneCall(String phoneNumber, int minutes) {
        super(phoneNumber);
        this.minutes = minutes;
        setPrice(4.0);
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public void displayInformation() {
        System.out.println("Outgoing call to " + getPhoneNumber() + " for " + getMinutes() +
                " minutes at a rate of $" + getPrice() + " per minute. Total price: $" + getPrice() * minutes);
    }
}
