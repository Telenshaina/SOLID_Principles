public class SimpleOrderNotifier implements OrderNotifier {
    @Override
    public void generateInvoice(String fileName) {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + fileName);
    }

    @Override
    public void sendEmailNotification(String email) {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }
}
