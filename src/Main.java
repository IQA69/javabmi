public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 98;
        double heightInMeters = (double) 1.87;
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);
    }
}
