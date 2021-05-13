public class CampanyaManager implements CampanyaService {

    @Override
    public void add(Campanya campanya) {
        System.out.println("kampanya eklendi "+campanya.getKampanyaName());
    }

    @Override
    public void delete(Campanya campanya) {
        System.out.println("kampanya silindi "+campanya.getKampanyaName());

    }

    @Override
    public void update(Campanya campanya) {
        System.out.println("kampanya güncellendi "+campanya.getKampanyaName());

    }
}
