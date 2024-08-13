import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
public class readafile {
    public static void main(String[] args) throws Exception{
        String filepath= System.getProperty("user.dir");
        System.out.println(filepath);
        File file = new File(filepath+"\\src\\test\\java\\team.txt");
        //FileInputStream fis= new FileInputStream(file);
        Scanner sc = new Scanner(file);
        StringBuffer sbf= new StringBuffer();
        while(sc.hasNext()){
            sbf=sbf.append(sc.next());
            System.out.println(sbf);

        }
    }

}
