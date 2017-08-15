import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        Cat catty1 = new Cat();
        Cat catty2 = new Cat(2);
        Cat catty3 = new Cat(3,true);

        System.out.println("catty1 "+catty1.a);
        System.out.println("catty2 "+catty2.a);
        System.out.println("Count of cats = "+ Cat.count_cats);
    }
}
