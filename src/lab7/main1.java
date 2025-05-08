package lab7;

public class main1 {
    public static void main(String[] args) {
        sc1 superClassObject = new sc1("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        subc1 subClassObject1 = new subc1("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subc1 subClassObject2 = new subc1("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
