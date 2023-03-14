package HackerRank;


class Arithmetic {
    int add(int a,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{

}
public class InheritanceII {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My Super Class is : " + a.getClass().getSuperclass().getName());
        System.out.println(a.add(10,20) + " " + a.add(30,10) + " " + a.add(12,10));
    }
}
