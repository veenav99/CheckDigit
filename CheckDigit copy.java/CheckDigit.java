public class CheckDigit{
    public static void main (String[] args){
        int sum1 = 0;
        int sum2 = 0;
                long number = Long.parseLong(args[0]);
                int Integer = 1;
               
                while (number > 0)
                { 
                    if(Integer %2!= 0)
                    {
                        sum1 += number % 10;
                    }
                    else 
                    {
                        sum2 += number % 10;
                    }
                    Integer++;
                    number /= 10;
                }

                sum1 %= 10;
                sum2 *= 3;
                sum2 %= 10;
                
                int digit = sum1 + sum2;
                digit %= 10;
        
                System.out.println(digit);
            }
        }