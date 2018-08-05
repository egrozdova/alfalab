public class Solution1 {
    public static void main (String[] args) {
        try{
            double result = getSqrt(0);
            System.out.println(result);
            int result2 = getFact(0);
            System.out.println(result2);
        }
        catch(CalcException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
        catch(ZeroException ex){

            System.out.println(ex.getMessage());

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());

        }


    }


    public static int getFact(int num) throws Exception {

        int result=1;
        if(num<0) {throw new CalcException("Число меньше 0, нельзя посчитать факториал от", num);}
        else if (num==0) {throw new ZeroException("Введенное число 0. Хотя 0! = 1, но сделаем вид, что это недопустимое значение");}
        else {
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
          }}

    public static double getSqrt(int num) throws CalcException{

        double result;
        if(num<0) {throw new CalcException("The number is less than 0, impossible to take square root from", num);}
        else {


                result=Math.sqrt(num);

            return result;
        }}
}
