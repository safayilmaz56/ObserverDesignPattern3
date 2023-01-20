public class CustomerObserver extends Observer{
    @Override
    public void update() {
        System.out.println("Customer tarafından gelen mesaj:fiyat guncellendi");
    }
}
