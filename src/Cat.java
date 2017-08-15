public class Cat extends Animal {
    static int count_cats;
    boolean hungry;//true=hungry
    public Cat(){
        super(0);
        System.out.println("Mяy");
        count_cats++;
    }
    public Cat(int a){
        super(a);
        this.a=this.a+a;
        count_cats++;
    }
    public Cat(int a, boolean b){
        this(a);
        this.hungry=b;
    }

}
