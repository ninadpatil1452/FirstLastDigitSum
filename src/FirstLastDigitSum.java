public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }else {
            int digit2=0;
            int digit1=number%10;
            while (number!=0){
                 digit2 = number%10;
                number=number/10;

            }
            return digit1 + digit2 ;
        }
    }
}
