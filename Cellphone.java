public class Cellphone {
    // Method to simulate ringing
    public void ring() {
        System.out.println("ringing...");
    }

    // Method to simulate vibrating
    public void vibrate() {
        System.out.println("vibrating...");
    }

    // Method to simulate calling a contact
    public void callContact(String contactName) {
        System.out.println("Calling " + contactName + "...");
    }

    // Method to simulate sending a message
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    // Main method to test the Cellphone class
    public static void main(String[] args) {
        Cellphone myPhone = new Cellphone();

        myPhone.ring();
        myPhone.vibrate();
        myPhone.callContact("Alice");
        myPhone.sendMessage("Hello, how are you?");
    }
}