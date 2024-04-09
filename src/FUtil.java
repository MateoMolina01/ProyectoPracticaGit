import java.io.File;

public class FUtil {
        public static boolean existe(String filename) {


            if(filename.isBlank()){

                throw new IllegalArgumentException("Error en el nombre del archivo");

            }else{

                File file = new File(filename);
                if (file.exists()) {
                    return true;
                }
                return false;

            }

        }
}
