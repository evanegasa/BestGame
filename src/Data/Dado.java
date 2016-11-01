package Data;

public class Dado {

    private int numeroDado;

    public Dado() {
        numeroDado = (int) (Math.random() * 6 + 1);
    }

    @Override
    public String toString() {
        return "Dado{" + "numeroDado=" + numeroDado + '}';
    }

}
