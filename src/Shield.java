
public class Shield implements Avenger {

    protected Avenger avenger;

    public Shield(Avenger a) {
        this.avenger = a;
    }

    @Override
    public void assemble() {
        this.avenger.assemble();
    }
}
