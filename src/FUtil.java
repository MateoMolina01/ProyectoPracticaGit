import java.io.File;

/**
 * @author Mateo Molina
 */
public class FUtil {

    /**
     *
     * @param filename nombre del archivo a buscar (su ruta)
     * @return devuelve true si existe el archivo dado y false si no existe
     *
     */
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
