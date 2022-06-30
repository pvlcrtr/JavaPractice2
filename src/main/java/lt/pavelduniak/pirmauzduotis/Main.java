package lt.pavelduniak.pirmauzduotis;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Darbuotojas darbuotojas1 = new Darbuotojas();
        darbuotojas1.vardas = "Andrius";
        darbuotojas1.pavarde = "Mamontovas";
        darbuotojas1.pareigos = "Lakunas";
        darbuotojas1.asmensKodas = "399002323";

        darbuotojas1.sujunkVardaPavarde();
        darbuotojas1.skaiciuokSimboliuSkaiciu();
        darbuotojas1.iskirpkRaides();


        Darbuotojas darbuotojas2 = new Darbuotojas();
        darbuotojas2.vardas = "Kostas";
        darbuotojas2.pavarde = "Macius";
        darbuotojas2.pareigos = "Statybininkas";
        darbuotojas2.asmensKodas = "3990223434";

        darbuotojas2.sujunkVardaPavarde();
        darbuotojas2.skaiciuokSimboliuSkaiciu();
        darbuotojas2.iskirpkRaides();


        Darbuotojas darbuotojas3 = new Darbuotojas();
        darbuotojas3.vardas = "Vygantas";
        darbuotojas3.pavarde = "Andrukonis";
        darbuotojas3.pareigos = "Programuotojas";
        darbuotojas3.asmensKodas = "39907105324";

        darbuotojas3.sujunkVardaPavarde();
        darbuotojas3.skaiciuokSimboliuSkaiciu();
        darbuotojas3.iskirpkRaides();

        System.out.println(darbuotojas3.nustatykLytiPagalAsmKoda());
        System.out.println(darbuotojas3.lytis);
        System.out.println(darbuotojas3.nustatykGimimoMetus());

        Darbuotojas darbuotojas4 = new Darbuotojas();
        darbuotojas4.vardas = "Anna";
        darbuotojas4.pavarde = "Kazkeviciute";
        darbuotojas4.pareigos = "Testuotojas";
        darbuotojas4.asmensKodas = "499003111025";

        darbuotojas4.sujunkVardaPavarde();
        darbuotojas4.skaiciuokSimboliuSkaiciu();
        darbuotojas4.iskirpkRaides();

        palyginkPareigas(darbuotojas1.pareigos, darbuotojas2.pareigos,
                darbuotojas3.pareigos, darbuotojas4.pareigos);


    }

    public static void palyginkPareigas(String... pareigos) {
        List<Boolean> palyginimai = new ArrayList();
        for (int i = 0; i < pareigos.length; i += 2) {
            palyginimai.add(pareigos[i].equals(pareigos[i + 1]));
        }
        System.out.println(palyginimai);

    }
}
