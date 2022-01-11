package max_of_number;

public class maxofno {

    static int max(int a, int ...arr){

        if(arr.length == 0 )
            return Integer.MIN_VALUE;
        int max = a;
        for (int j : arr) if (j > max) max = j;

        return max;
    }

    public static void main(String[] args) {

        System.out.println(max(49, 93));
        System.out.println(max(4,7 , 9, 23));
    }
}
