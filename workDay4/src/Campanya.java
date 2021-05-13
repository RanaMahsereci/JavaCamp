public class Campanya {
    private int id;
    private String kampanyaName;
    private double kampanyaOrani;

    public Campanya(int id, String kampanyaName, double kampanyaOrani){

        this.id = id;
        this.kampanyaName = kampanyaName;
        this.kampanyaOrani = kampanyaOrani;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKampanyaName() {
        return kampanyaName;
    }

    public void setKampanyaName(String kampanyaName) {
        this.kampanyaName = kampanyaName;
    }

    public double getKampanyaOrani() {
        return kampanyaOrani;
    }

    public void setKampanyaOrani(double kampanyaOrani) {
        this.kampanyaOrani = kampanyaOrani;
    }
}
