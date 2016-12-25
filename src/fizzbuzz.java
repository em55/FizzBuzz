public class fizzbuzz {
    public static void main(String[] args){
        fizzbuzz();
    }

    public static void fizzbuzz(){
        for(int i=1;i<=100;i++){
            if(i%3==0){
                if(i%5==0){
                    System.out.println("FizzBuzz");
                    continue;
                }
                System.out.println("Fizz");
                continue;
            }

            if(i%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}



