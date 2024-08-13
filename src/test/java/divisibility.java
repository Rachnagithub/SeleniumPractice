public class divisibility {
    public static void main(String[] args){
        int count = 0;
        for(int i=1; i<=100; i++) {
            if (i % 13 == 0) {
                count = count + 1;
            }
        }
        System.out.println("Divisible numbers are " +count);
    }
}
