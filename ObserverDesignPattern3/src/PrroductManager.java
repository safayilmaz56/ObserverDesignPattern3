import java.util.ArrayList;
import java.util.List;

public class PrroductManager {

    List<Observer> observers = new ArrayList<>();

    public void updatePrice(){
        System.out.println("fiyat guncellendi");
        Notify();
    }

    public void ekle(Observer observer){
        observers.add(observer);
    }
    public void sil(Observer observer){
        observers.remove(observer);
    }
    private void Notify(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
