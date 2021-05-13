public class CustomerManager implements  CustomerService{

    @Override
    public void add(Customer customer) {
        System.out.println("müşteri eklendi "+customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("müşteri silindi "+customer.getFirstName());

    }

    @Override
    public void update(Customer customer) {
        System.out.println("müşteri güncellendi "+customer.getFirstName());

    }
}
