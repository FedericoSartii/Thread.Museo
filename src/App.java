import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Museo m = new Museo();
        ArrayList<Turista> turisti = new ArrayList<>();
        for(int i = 0; i < 20; i++)
        {
            turisti.add(new Turista("Turista " + (i+1) + "", m));
        }
        for(Turista t : turisti)
        {
            t.start();
        }
    }
}

































