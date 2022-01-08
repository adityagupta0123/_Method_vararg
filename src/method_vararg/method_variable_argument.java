package method_vararg;

public class method_variable_argument {
    static int sum(int ...arr){
       int res = 0 ;
       for(int a : arr){
           res += a;
       }
       return res;

    }
    public static void main(String[] args) {
        System.out.println("sum of 3 and 4 : "+ sum(3,4)) ;
        System.out.println("sum of 1 ,3 ,4 : "+ sum(1,3,4));
        System.out.println("sum of 5 , 4, 9 ,3 : "+ sum(5,4,9,3));
    }
}
