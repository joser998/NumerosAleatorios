
import java.util.Random;

public class ClaseDos {

    public static void main(String[] args) {
        int aleatorio = 0;

        Random objeto = new Random();

        aleatorio = (int) (objeto.nextDouble() * 100);
        System.out.println(aleatorio);
    }
}
