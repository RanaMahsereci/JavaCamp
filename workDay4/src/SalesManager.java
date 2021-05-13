import java.sql.SQLOutput;

public class SalesManager implements  SalesService{
    @Override
    public void sale(Sales sales) {
        System.out.println("kampanya adı: "+sales.getCampanya().getKampanyaName() );
        System.out.println("oyun adı: "+sales.getGame().getName());
        System.out.println("müşteri adı: "+sales.getCustomer().getFirstName());
    }
}
