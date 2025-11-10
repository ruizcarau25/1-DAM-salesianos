import java.util.Random;

public class Generadora {

    public int GenerarQuiniela () {
        Random r = new Random(System.nanoTime());
        int hasta=3, desde=1;
        return r.nextInt(hasta-desde+1)+desde;
    }

    public String GenerarPares () {
        Random r = new Random(System.nanoTime());
        int hasta=1, desde=0, numAle;
            numAle = r.nextInt(hasta-desde+1)+desde;
            if (numAle==0) {
                return "Par";
            } else {
                return "Impar";
            }
    }
    public int GenerarChinos () {
        Random r = new Random(System.nanoTime());
        int hasta=3, desde=1;
        return r.nextInt(hasta-desde+1)+desde;
    }

    public int GenerarPrimitiva () {
        Random r = new Random(System.nanoTime());
        int hasta=49, desde=1;
        return r.nextInt(hasta-desde+1)+desde;
    }
}
