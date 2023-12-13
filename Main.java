import uml.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("APU");
        Kiosk kiosk = shop.addKiosk("North");
        Kiosk kiosk2 = shop.addKiosk("East");
        
        Snack nyonya = (Snack) shop.addItem("Nyonya Kuih", 2.5, 10, "snack", 0.4);
        Snack rice = (Snack) shop.addItem("Hainanese Chicken Rice", 9.0, 20, "snack", 2.0); 
        rice.createAddon("Fish Meat", 1.0, 0.0);
        rice.createAddon("Cashnuts", 0.5, 0.0);
        Drink tea = (Drink) shop.addItem("Ice Lemon Tea", 5.0, 10, "drink", 0.5);
        tea.createAddon("Straw", 0.0, 0.0);
        tea.createAddon("Icicles", 0.0, 0.0);
        System.out.println(shop);

        Staff staff = new Staff("Let's Kopitiam");
        Student student = new Student("Mattéo");
        student.getAccount().topup(200.0);
        System.out.println(student);

        kiosk.pendingBasket = kiosk.getPendingBasket();
        System.out.println(kiosk);
        ArrayList<AddOn> addOnsSelected = new ArrayList<AddOn>();
        addOnsSelected.add(rice.availableAddOns.get(0));
        System.out.println(addOnsSelected);
        kiosk.pendingBasket.addElement(rice, 3, addOnsSelected);
        System.out.println(kiosk.pendingBasket);
        kiosk.pendingBasket.confirm(student);
        System.out.println("Serving the order to " + student);
        kiosk.pendingBasket.serve();
        System.out.println("Kiosk : " + kiosk);
    }

}