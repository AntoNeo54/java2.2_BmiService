public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 100.80F;
        float height = 170.50F;
        float Bmi = service.calculate(weight, height);
        System.out.printf("Body Mass Index %.2f %n", Bmi);
    }
}
