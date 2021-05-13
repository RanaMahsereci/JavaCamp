public class Sales {
    private int id;
    private Campanya campanya;
    private Customer customer;
    private Game game;

    public Sales(int id ,Campanya campanya, Customer customer, Game game){

        this.id = id;
        this.campanya = campanya;
        this.customer = customer;
        this.game = game;
    }


    public Campanya getCampanya() {
        return campanya;
    }

    public void setCampanya(Campanya campanya) {
        this.campanya = campanya;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
