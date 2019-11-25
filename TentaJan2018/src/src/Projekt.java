public class Projekt {
    private String namn;
    private double budget;
    private Dotterbolag dotterbolag;

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Dotterbolag getDotterbolag() {
        return dotterbolag;
    }

    public void setDotterbolag(Dotterbolag dotterbolag) {
        this.dotterbolag = dotterbolag;
    }

}
