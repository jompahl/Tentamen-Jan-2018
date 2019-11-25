import java.beans.PropertyEditor;

public class testmetod {

    public static void main(String[] args) {
        //Skapar instanser
        OOAB ooab = new OOAB();

        Dotterbolag dotterbolag1 = new Dotterbolag();
        Dotterbolag dotterbolag2 = new Dotterbolag();

        Anstalld anstalld1 = new Anstalld();
        Anstalld anstalld2 = new Anstalld();

        Projekt projekt1 = new Projekt();
        Projekt projekt2 = new Projekt();
        Projekt projekt3 = new Projekt();

        //matar in värden
        ooab.setNr("556512");
        ooab.setNamn("Acme AB");

        dotterbolag1.setNr("1a");
        dotterbolag1.setNamn("Acme Sweden");
        dotterbolag2.setNr("1b");
        dotterbolag2.setNamn("Acme Denmark");

        projekt1.setNamn("nyinvestering");
        projekt1.setBudget(1000000);
        projekt2.setNamn("Databaser");
        projekt2.setBudget(300000);
        projekt3.setNamn("Underhåll");
        projekt3.setBudget(500000);

        anstalld1.setPnr("1");
        anstalld1.setNamn("John");
        anstalld2.setPnr("2");
        anstalld2.setNamn("Henrik");

        //Kopplar ihop
        ooab.laggTillDotterbolag(dotterbolag1);
        ooab.laggTillDotterbolag(dotterbolag2);

        dotterbolag2.laggTillAnstalld(anstalld1);
        dotterbolag2.laggTillAnstalld(anstalld2);
        anstalld1.setDotterbolag(dotterbolag2);
        anstalld2.setDotterbolag(dotterbolag2);

        //lägger till mha metoden i OOAB
        ooab.laggTillProjekt(dotterbolag1.getNr(), projekt1);
        ooab.laggTillProjekt(dotterbolag2.getNr(), projekt2);
        ooab.laggTillProjekt(dotterbolag2.getNr(), projekt3);

        //exempel på utskrift för tentan
        for(Dotterbolag tmpDotter : ooab.getDotterbolagsLista()) {
            System.out.println(tmpDotter.getNamn());
            for(Projekt tmpProjekt : tmpDotter.getProjektLista()) {
                System.out.println("- " + tmpProjekt.getNamn());
            }
        }

        System.out.println("Total Budget: " + ooab.totalBudget());

        //Testar andra metoder för att säkerställa att resten fungerar

        System.out.println(anstalld1.getNamn());
        System.out.println(anstalld2.getNamn());
        for(Dotterbolag tmpDotter : ooab.getDotterbolagsLista()) {
            System.out.println(tmpDotter.getNamn() + " Budget: " + tmpDotter.totalBudget());
        }
    }
}
