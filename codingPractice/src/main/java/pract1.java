public class pract1 {


   public static int sal=100;

    public static void main(String [] args){

        int [] arr={1,4,5,6,10};
        int[] temp = new int[arr.length];

        System.out.println(arr.length);

        for(int i=0;i<arr.length;i++){

            temp[i]=arr[i];
            System.out.println(temp[i]);
        }

        System.out.println(temp);

        pract1 p1=new pract1();

        String s1="Test";
        String s2="Test";
        String s3= new String("Test");

        System.out.println(s1==s2);
        System.out.println(s1==s3);


    }

}
