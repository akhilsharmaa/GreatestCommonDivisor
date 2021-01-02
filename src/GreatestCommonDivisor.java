public class GreatestCommonDivisor {

    public static void main(String[] args) {
        getGreatestCommonDivisor(21,64);
    }

    public static int getGreatestCommonDivisor (int first , int second ) {
        if (first < 10 || second < 10) {
            return -1;
        }

        // Returns The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

        int c = 0 ;
        int d = 0 ;
        int common = 0 ;
        //        First loop
        for (int i = 2; i < first; i++) {
//            int common = first / i;
            int reminder = first % i;
            if (reminder == 0 ){
//                System.out.println(i + " Divisors ??????????????????????? ");
                 c = i ;
            }

            //            Second loop
            for (int j = 2; j < second; j++) {
//                int common2 = second / j;
                int reminder2 = second % j;
                if ( reminder2 == 0 ){
//                    System.out.println( c + " Divisor __________________________");
                    d = j ;
                }

//                if(c  == d){
////                    System.out.println( c +"  Same i == j");
//                }
            }common = c;
        }
        System.out.println(c + " is the greatest common factor of "+ first + " and " + second);

        return c;
    }

}


