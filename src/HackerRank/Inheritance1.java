package HackerRank;

class Animal {
    void walk(){
        System.out.println("I am Walking");
    }
}
class Bird extends Animal{
    void fly (){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am Singing");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Bird bird =  new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
