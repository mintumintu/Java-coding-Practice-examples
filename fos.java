import java.io.FileOutputStream;
public class fos {
    public static void main(String []args){
        try{
        FileOutputStream fs = new FileOutputStream("G:\\My Drive\\testout.txt");
        fs.write(68);
        fs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
