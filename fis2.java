import java.io.FileInputStream;
public class fis2 {
    public static void main(String []args){
        try{
        FileInputStream fin = new FileInputStream("G:\\My Drive\\file2.txt");
        int i = 0;
        while((i=fin.read())!=-1){
            System.out.print((char)i);
        }
    }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
