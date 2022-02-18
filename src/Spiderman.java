
public class Spiderman extends Shield {

    public Spiderman(Avenger a) {
        super(a);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" invites Spider-Man join to S.H.I.L.D");
    }
}
