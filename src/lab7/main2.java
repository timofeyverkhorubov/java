package lab7;

public class main2 {
    public static void main(String[] args) {
        // SuperClassTest
        sc2 superClassObject = new sc2("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);
        System.out.println("Length: " + superClassObject.getStringLength());

        // SubClassTest
        subc2 subClassObject = new subc2(100, "hello");
        System.out.println(subClassObject.toString());

        subClassObject.setFields();
        System.out.println(subClassObject.toString());

        subClassObject.setFields("test");
        System.out.println(subClassObject.toString());

        subClassObject.setFields(200);
        System.out.println(subClassObject.toString());

        subClassObject.setFields("test2", 300);
        System.out.println(subClassObject.toString());
    }
}
