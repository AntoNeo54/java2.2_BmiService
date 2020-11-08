public class BmiService {
    public float calculate(float weight, float height) {
        float Bmi = weight / (height/100 * 2);
 //       System.out.println (Bmi);
        return Bmi;
    }
}
