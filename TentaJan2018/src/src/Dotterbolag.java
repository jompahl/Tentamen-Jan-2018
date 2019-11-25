import java.util.ArrayList;

public class Dotterbolag {

    private String nr;
    private String namn;
    private ArrayList<Anstalld> anstallningsLista = new ArrayList<Anstalld>();
    private ArrayList<Projekt> projektLista = new ArrayList<Projekt>();

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public ArrayList<Anstalld> getAnstallningsLista() {
        return anstallningsLista;
    }

    public void setAnstallningsLista(ArrayList<Anstalld> anstallningsLista) {
        this.anstallningsLista = anstallningsLista;
    }

    public ArrayList<Projekt> getProjektLista() {
        return projektLista;
    }

    public void setProjektLista(ArrayList<Projekt> projektLista) {
        this.projektLista = projektLista;
    }

    public void laggTillAnstalld(Anstalld anstalld) {
        anstallningsLista.add(anstalld);
    }

    public void laggTillProjekt(Projekt projekt) {
        projektLista.add(projekt);
    }

    public double totalBudget() {
        double sum = 0;

        for(Projekt tmpProjekt : projektLista) {
            sum = sum + tmpProjekt.getBudget();
        }
        return sum;
    }

}
