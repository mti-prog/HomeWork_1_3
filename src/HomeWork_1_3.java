public class HomeWork_1_3 {
    public static void main(String[] args) {
        int quantity = 0;
        double sum = 0;
        double[] frac_num = {3.14, 2.75, -0.875, -0.833, 0.333, -1.25, 9.875,
                -3.5, 2.75, -7.125, 0.666, -3.333, 0.4, -0.2, 6.01};
        for (double i : frac_num){
            if(i > 0 && i != frac_num[0] && i != frac_num[1]){
                sum += i;
                quantity++;
            }
        }
        System.out.println(sum/quantity);
    }

}
