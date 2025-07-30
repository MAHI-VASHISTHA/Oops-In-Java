class Mammal {
    String BloodType;

    Mammal() {
        System.out.println("Created Mammal");
        BloodType = "warm";
    }

    void showMammalproperty() {
        System.out.println("Mammal proerty are :");
        System.out.println("BloodType :" + BloodType);
    }
}

class Human extends Mammal {
    int legs;

    Human() {
        System.out.println("Created Human");
        legs = 2;
    }

    void showHumanproperty() {
        System.out.println("Human proerty are :");
        System.out.println(" legs :" + legs);
    }
}

class Cat extends Human {
    String food;

    Cat() {
        System.out.println("Cat Created ");
        food = "rat";
    }

    void showCatproperty() {
        System.out.println("Cat  proerty are :");
        System.out.println("food :" + food);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.showMammalproperty();
        c1.showHumanproperty();
        c1.showCatproperty();
    }
}
