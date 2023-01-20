public class Main {
    public static void main(String[] args) {
        PrroductManager prroductManager = new PrroductManager();
        prroductManager.ekle(new CustomerObserver());
        prroductManager.ekle(new EmployeeObserver());
        prroductManager.updatePrice();
    }
}