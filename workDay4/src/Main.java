import java.time.LocalDate;

public class Main {
    public static void main (String args[]){
        SalesManager salesManager = new SalesManager();

        Campanya campanya = new Campanya(1, "haftasonu kampanyası",50);

        Customer customer = new Customer(2, "12345","rana","mahsereci", LocalDate.now());

        Game game = new Game(3 ,"CSGO","savaş",100);

        Sales sales = new Sales(4, campanya ,customer ,game);


        salesManager.sale(sales);
    }
}
