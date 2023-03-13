public class DemoPhoneCalls {
    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[10];

        phoneCalls[0] = new IncomingPhoneCall("123-456-7890");
        phoneCalls[1] = new OutgoingPhoneCall("234-567-8901", 5);
        phoneCalls[2] = new IncomingPhoneCall("345-678-9012");
        phoneCalls[3] = new OutgoingPhoneCall("456-789-0123", 10);
        phoneCalls[4] = new IncomingPhoneCall("567-890-1234");
        phoneCalls[5] = new OutgoingPhoneCall("678-901-2345", 15);
        phoneCalls[6] = new IncomingPhoneCall("789-012-3456");
        phoneCalls[7] = new OutgoingPhoneCall("890-123-4567", 20);
        phoneCalls[8] = new IncomingPhoneCall("901-234-5678");
        phoneCalls[9] = new OutgoingPhoneCall("012-345-6789", 25);

        for (PhoneCall phoneCall : phoneCalls) {
            phoneCall.displayInformation();
            System.out.println();
        }
    }
}
