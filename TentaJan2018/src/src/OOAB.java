import java.util.ArrayList;

public class OOAB {

    private String nr;
    private String namn;
    private ArrayList<Dotterbolag> dotterbolagsLista = new ArrayList<Dotterbolag>();

    public ArrayList<Dotterbolag> getDotterbolagsLista() {
        return dotterbolagsLista;
    }

    public void setDotterbolagsLista(ArrayList<Dotterbolag> dotterbolagsLista) {
        this.dotterbolagsLista = dotterbolagsLista;
    }

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

    public void laggTillDotterbolag(Dotterbolag d) {
        dotterbolagsLista.add(d);
    }

    public void laggTillProjekt(String dotterNr, Projekt projekt) {
        Dotterbolag dotterbolag = hittaDotterbolag(dotterNr);

        if(dotterbolag != null) {
            dotterbolag.laggTillProjekt(projekt);
        }
    }

    public Dotterbolag hittaDotterbolag(String nr) {
        for(Dotterbolag tmpDotter : dotterbolagsLista) {
            if(tmpDotter.getNr().equals(nr)) {
                return tmpDotter;
            }
        }
        return null;
    }

    public double totalBudget() {
        double sum = 0;
        for(Dotterbolag tmpDotter : dotterbolagsLista) {
            sum = sum + tmpDotter.totalBudget();
        }
        return sum;
    }
}
