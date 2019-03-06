import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Creates a NPUScholarshipSystem catalog and loads it with data stored in
 * a file.
 *
 * @author xieqijun
 * @version  1.0.0
 */
public class FileSchlorshipLoader implements SchlorshipLoader {

    private static final String DELIM = "_" ;

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
    public ScholarshipDatabase loadSchlorship(String filename) throws
            IOException, DataFormatException {

        ScholarshipDatabase scholarshipDatabase = new ScholarshipDatabase() ;

        BufferedReader reader = new BufferedReader(new FileReader(filename)) ;

        String line = reader.readLine() ;

        while (line!= null){
            Scholarship scholarship = null ;

            scholarship = readSchlorship(line) ;

            scholarshipDatabase.addSchlarship(scholarship);

            line = reader.readLine() ;
        }

        reader.close();

        return scholarshipDatabase ;
    }



    /**
     * Extracts the Scholarship data in the specified line and returns
     * a {@link Scholarship} object that encapsulates the book data.
     *
     * @param line  a string that contains book data.
     * @return  a <codeScholarship></code> object that encapsulates the
     *          book data in the specified line.
     * @throws DataFormatException if the line contains errors.
     */
    private Scholarship readSchlorship(String line) throws DataFormatException {

        StringTokenizer stringTokenizer = new StringTokenizer(line,DELIM) ;

        if(stringTokenizer.countTokens()!= 3){
            throw new DataFormatException(line) ;
        }else {

            return new Scholarship(stringTokenizer.nextToken(),stringTokenizer.nextToken()
            ,stringTokenizer.nextToken());
        }


    }
}
