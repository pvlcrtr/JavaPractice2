package lt.pavelduniak.pirmauzduotis;

public class Darbuotojas {
    String vardas;
    String pavarde;
    String pareigos;
    String asmensKodas;
    String lytis;
    String vardasPavarde;
    String iskirptasTekstas;
    int simboliuSkaicius;

    public void sujunkVardaPavarde() {
        vardasPavarde = vardas + " " + pavarde;

    }

    public void skaiciuokSimboliuSkaiciu() {

        simboliuSkaicius = vardasPavarde.length();
    }


    public void iskirpkRaides() {

        iskirptasTekstas = vardasPavarde.substring(3, 9);
    }

    public String nustatykLytiPagalAsmKoda() {

        String pirmasSkaiciusAK = String.valueOf(asmensKodas.charAt(0));

        switch (pirmasSkaiciusAK) {
            case "3":
            case "5":
                lytis = "vyras";
                break;
            case "4":
            case "6":
                lytis = "moterys";
                break;
            default:
                lytis = "Asmens kodo klaida";
        }
        return lytis;

    }

    public String nustatykGimimoMetus() {
        String metai = String.valueOf(asmensKodas.charAt(1)) + String.valueOf(asmensKodas.charAt(2));
        String menuo = String.valueOf(asmensKodas.charAt(3)) + String.valueOf(asmensKodas.charAt(4));
        String diena = String.valueOf(asmensKodas.charAt(5)) + String.valueOf(asmensKodas.charAt(6));
        String pirmasSkaiciusAK = String.valueOf(asmensKodas.charAt(0));
        String gimimoData = null;

        switch (pirmasSkaiciusAK) {
            case "3":
            case "4":
                gimimoData = "19" + metai + "." + menuo + "." + diena;
                break;
            case "5":
            case "6":
                gimimoData = "20" + metai + "." + menuo + "." + diena;
                break;
            default:
                gimimoData = "Asmens kodo klaida";
        }
        return gimimoData;

    }

}