public class Cat extends Animal {
    public Cat(){
        super(0);
        System.out.println("Mяy");
    }
    public Cat(int a){
        super(a);
        this.a=this.a+a;
    }

}
