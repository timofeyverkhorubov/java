package lab7;

public class main4 {
    public static void main(String[] args) {

        // SuperClassTest
        sc4 superClassObject = new sc4(10);
        System.out.println("superClassObject: " + superClassObject);
        sc4 superClassCopy = new sc4(superClassObject);
        System.out.println("superClassCopy: " + superClassCopy);

        // SubClassTest
        subc4 subClassObject = new subc4(1, 'a');
        System.out.println("subClassObject: " + subClassObject);
        subc4 subClassCopy = new subc4(subClassObject);
        System.out.println("subClassCopy: " + subClassCopy);


        // ThirdClassTest
        thc4 thirdClassObject = new thc4(1, 'a', "Hello");
        System.out.println("thirdClassObject: " + thirdClassObject);
        thc4 thirdClassCopy = new thc4(thirdClassObject);
        System.out.println("thirdClassCopy: " + thirdClassCopy);


    }
}
