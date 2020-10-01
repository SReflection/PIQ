import java.io.FileInputStream;
import java.util.Properties;

public class DataReader {


    private static Properties dataFile;

    static  {
        try {
            FileInputStream input = new FileInputStream("testeng-mobile-master/data.properties");
            dataFile = new Properties();
            dataFile.load(input);
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return dataFile.getProperty(key);
    }
}
