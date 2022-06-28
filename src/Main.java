public class Main {

    public static void main(String[] args) throws Exception {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Бонусные мили: " + miles);
    }
}
