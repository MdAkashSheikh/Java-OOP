interface intra1{
    public void m1();
    public void m2();
}

abstract class ServiceProvider implements intra1{
    @Override
    public void m1() {
        System.out.println("HELLO THIS IS M1");
    }
}
class Nai extends ServiceProvider {
    @Override
    public void m2() {
        System.out.println("OK");
    }
}
public class Intra {
    public static void main(String[] args) {
        Nai s = new Nai();
        s.m1();
        s.m2();
    }

}
