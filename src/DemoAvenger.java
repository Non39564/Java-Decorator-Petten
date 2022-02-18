
public class DemoAvenger {

    public static void main(String[] args) {
        Avenger ironMan = new Ironman(new NickFewry());
        ironMan.assemble();
        System.out.println(" ");

        Avenger spiderMan = new Ironman(new Spiderman(new NickFewry()));
        spiderMan.assemble();
    }
}
