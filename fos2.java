import java.io.FileOutputStream;
public class fos2 {
    public static void main(String []args){
        try{
            FileOutputStream fs = new FileOutputStream("G:\\My Drive\\file2.txt");
            String s = "I love you my Dabbuu Wifey";
            byte b[]= s.getBytes();
            fs.write(b);
            fs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
