class cal{
    // int a,b;
    public int add(int a,int b){
        return a+b;
    }
}

public class hello{
    public static void main(String a[]){
        cal c=new cal();
        System.out.println(c.add(3,4));
    }
}