class P {
    public void m1() {
        System.out.println("Parent Class");
    }
}

class Q extends P {
    public void m2() {
        System.out.println("Child Class");
    }
}
public class IngeritanceDemo {
    public static void main(String[] args) {

        Q obj = new Q();

        obj.m1();
        obj.m2();
    }
}
