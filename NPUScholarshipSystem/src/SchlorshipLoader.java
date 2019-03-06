import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * This interface declares a method for obtaining a  ScholarshipDatabase
 * from a file.
 *
 * @author iCarnegie
 * @version 1.1.0
 */
public interface SchlorshipLoader {

    /**
     * Loads the information in the specified file into a NPUScholarshipSystem
     * catalog and returns the Scholarship.
     *
     * @param filename  The name of a file that contains catalog
     *                  information.
     * @return a library catalog.
     * @throws IOException if there is an error reading the
     *                     information in the specified file.
     * @throws FileNotFoundException  if the specified file does not
     *                                exist.
     * @throws DataFormatException if the file contains malformed
     *                             data.
     */

    ScholarshipDatabase loadSchlorship(String filename) throws IOException
        , FileNotFoundException ,DataFormatException;
}
