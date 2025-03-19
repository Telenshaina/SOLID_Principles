//OrderTest
public class OrderTest {
    public static void main(String[] args) {
        OrderCalculator calculator = new SimpleOrderCalculator();
        OrderPlacer placer = new SimpleOrderPlacer();
        OrderNotifier notifier = new SimpleOrderNotifier();

      
        double totalPrice = calculator.calculateTotal(10.0, 2);
        System.out.println("Order Total: $" + totalPrice);
        placer.placeOrder("John Doe", "123 Main St");
        notifier.generateInvoice("order_123.pdf");
        notifier.sendEmailNotification("johndoe@example.com");

        
    }
}
