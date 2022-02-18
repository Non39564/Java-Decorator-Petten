
public class Ironman extends Shield {

    public Ironman(Avenger a) {
        super(a);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" invites Iron Man join to S.H.I.L.D");
    }
}
