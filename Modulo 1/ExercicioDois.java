public class ExercicioDois{
    public static void fizzBuzz(int n1){
        if (n1 % 3 == 0 && n1 % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(n1 % 3 == 0){
            System.out.println("Fizz");
        }else if(n1 % 5 == 0){
            System.out.println("Buzz");
        }else {
            System.out.println(n1);
        }
    }

    public static void main(String[] args){
        for(int i = 1; i<=15; i++){
            fizzBuzz(i);
        }
    }
}