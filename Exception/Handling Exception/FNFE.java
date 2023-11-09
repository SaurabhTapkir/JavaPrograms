//File Not Found Exception :checked

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class FNFE {
    
    public static void main(String[] args)  throws FileNotFoundException
    {
        try{
        FileOutputStream fs =new FileOutputStream("C:\\WCCA15_JAVA\\Exception\\new.txt");
        
        }
        catch(FileNotFoundException f){
System.out.println(f);            
        }

    }
}
