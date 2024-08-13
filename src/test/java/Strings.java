public class Strings {
    int x=1;
    int y=2;
    int z;
    int a(){
        z=x;
        x=y;
        return x;
    }
    int b(){
        y=z;
        return y;
    }
    public static void main(String[] ags){
        Strings ss= new Strings();
        int x = ss.a();
        int y = ss.b();
        System.out.println("value of x:" +x);
        System.out.println("value of y:" +y);
    }
}
