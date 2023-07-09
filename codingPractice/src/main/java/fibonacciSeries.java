public class fibonacciSeries {

    public static void main(String[] args){
        int a=0,b=1,c=0,n=9;

        for(int i=0;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+ " ");
        }
    }
}
