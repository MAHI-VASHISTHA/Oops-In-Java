class Mammal{
    String bloodType;
Mammal(){
    System.out.println("mammal created");
    bloodType = "warm";
}
void showMammalproperty(){
    System.out.println("Mammal's property are :");
    System.out.println("bloodType : "+bloodType);
}
}
class Human extends Mammal{
    int  legs;

    Human(){
        System.out.println("Human created");
        legs = 2;
    }
    void showhumanproperty(){
        System.out.println("Human's property are :");
        System.out.println("legs :"+legs);
    }
}
public class SingleInhertance {
    public static void main(String[] args) {
        
/* 
 * I called only child class constructor[(human()] but parent class constructor automatically called by itself .Due to inheritance 
    */    
          Human m1=new Human();
          m1.showMammalproperty();
         m1.showhumanproperty();
    }
}
