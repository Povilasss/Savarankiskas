import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite šešiažianklį bilieto numerį: ");

        int bilNr = scanner.nextInt();

        int bandSk = 0;
        int laimingasNr;

        while (true) {
            int paskutiniuTrijuSuma = 0;
            int pirmuTrijuSuma = 0;
            int sk = bilNr;

            for (int i = 0; i < 3; i++) {
                pirmuTrijuSuma += sk % 10;
                sk /= 10;
            }

            for (int i = 0; i < 3; i++) {
                paskutiniuTrijuSuma += sk % 10;
                sk /= 10;
            }

            boolean visiSkirtingi = true;
            int[] skMas = new int[10];
            sk = bilNr;
            while (sk > 0) {
                int skaitmuo = sk % 10;
                skMas[skaitmuo]++;
                if (skMas[skaitmuo] > 1) {
                    visiSkirtingi = false;
                    break;
                }
                sk /= 10;
            }

            if (pirmuTrijuSuma == paskutiniuTrijuSuma && visiSkirtingi) {
                laimingasNr = bilNr;
                break;
            }

            bilNr++;
            bandSk++;
        }

        System.out.println("Pirmas laimingas bilieto skaičius: " + laimingasNr);

        System.out.println("Bandymai: " + bandSk);

    }
}