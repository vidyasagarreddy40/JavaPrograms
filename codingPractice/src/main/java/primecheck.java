public class primecheck {
    public static void main(String[] args) {
        int n=11;
        boolean isPrime=false;
        for(int i=2;i<n/2;i++){
            if(n%2==0){
                isPrime=true;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+ " is not prime number");
        }else{
            System.out.println(n+ " is a prime number");
        }
    }
}
