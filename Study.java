public class Study {
    public static void main(String[] args) {
       int number1 = 100;
       while(number1 < 50) {
           number1 *= 2;
           System.out.println("While =" + number1);
       }
       
       int number2 = 100;
       do {
           number2 *= 2;
           System.out.println("DoWhile =" + number2);
       } while(number2 < 50);
       
       for(int number = 1; number <= 5; number++) {
           System.out.println("for =" + number);
       }
       
       int[] array = { 1,2,3,4,5 }; 
       for(int number : array) {
           System.out.println("for =" + number);
       }
       
       for(int count = 0; count < 5; count++) {
           if(count == 2) {
               break;
           }
           System.out.println("break =" + count);
       }
       
       for(int count = 0; count < 5; count++) {
           if(count == 2) {
               continue;
           }
           System.out.println("continue =" + count);
       }
       
        //   int num = 1;
        //   printNum(num);
        // }
        
        // public static int printNum(int num) {
        //     if(num < 50) {
        //         num *= 2;
        //         System.out.println("while =" + num);
        //         printNum(num);
        //     }
        //     return num;
        
        int num = 1;
        while(num < 5) {
            System.out.println(num * num);
            num++;
        }
        
        int[] val = {1,2,3,4};
        for(int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }
        
        int[] ary = {1,2,3,4};
        for(int a : ary) {
            if(a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}