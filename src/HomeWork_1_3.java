public class HomeWork_1_3 {
    public static void main(String[] args) {
        boolean nega = false;
        int quantity = 0;
        double sum = 0;
        double[] frac_num = {3.14, 2.75, -0.875, -0.833, 0.333, -1.25, 9.875,
                -3.5, 2.75, -7.125, 0.666, -3.333, 0.4, -0.2, 6.01};
        for (double fra: frac_num){
            if (!nega){
                if(fra < 0){
                    nega = true;
                }
            }else{
                if (fra > 0){
                    sum += fra;
                    quantity++;
                }
            }
        }
        System.out.println(sum/quantity);
    }

}
