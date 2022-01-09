package discount;

public class discount_in_sum {
    static double sum=0;
    static double dis(double ... p){
        sum=0;
        for (double a : p) {
            sum += a;
        }


       if(sum>=500 && sum<= 1000 )
           sum =sum * .01;
       else if(sum>=1000 && sum<=1500)
           sum = sum * .15;
       else
           sum = sum *.25;

       return sum;
    }

    public static void main(String[] args) {

        System.out.println("You got total discount "+dis(1200, 34.5, 14.7 , 350, 415.69));

    }

}
