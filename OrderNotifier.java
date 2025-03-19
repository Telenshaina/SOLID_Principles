//interface
public interface OrderNotifier {
    void generateInvoice(String fileName);
    void sendEmailNotification(String email);
}
