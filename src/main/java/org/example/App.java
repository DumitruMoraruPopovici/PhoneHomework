package org.example;

/**
 * the main class where we call all the methods from our classes
 *
 *
 *
 *
 */


public class App {
    public static void main(String[] args) {
//        Phone phone = new Samsung();
        Phone phone = new SamsungGalaxy6("blue", "aluminium", "297432987r9yh9283y6r");
        Phone phone1 = new HuaweiP9("red", "iron", "daui6fd8a7");
        Contact Dumitru = new Contact(1, "075846", "Dumtiru", "Popovici");
        Contact Alex = new Contact(2, "3165456", "Alex", "Popovici");
        Contact Irina = new Contact(3, "154987", "Irina", "Parlea");
        phone.addContact(Dumitru);
        phone.addContact(Alex);
        phone.addContact(Irina);
        Message mesage1 = new Message("075846", "Come Home");
        Message mesage2 = new Message("075846", "Dont forget to buy dinner");

        phone.getFirstContact();
        phone.getLastContact();
        phone.sendMessage(mesage1);
        phone.sendMessage(mesage2);
        phone.getFirstMessage("075846");
        phone.getSecondMessage("075846");
        phone.call(Alex);
        phone.call(Dumitru);
        System.out.println(phone.getBatteryLife());
        phone.viewHistory();
    }
}
