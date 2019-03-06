import java.io.*;
import java.util.StringTokenizer;
/**
 * Creates a NPUScholarshipSystem catalog and loads it with data stored in
 * a file.
 *
 * @author xieqijun
 * @version  1.0.0
 */
public class FileStudentLoader implements StudentLoader {
    private final static  String DELIM = "_" ;

    /**
     * Loads the information in the specified file into a NPUScholarshipSystem
     * catalog and returns the StudentDatabase.
     *
     * @param filename  The name of a file that contains catalog
     *                  information.
     * @return a StudentDatabase.
     * @throws IOException if there is an error reading the
     *                     information in the specified file.
     * @throws FileNotFoundException  if the specified file does not
     *                                exist.
     * @throws DataFormatException if the file contains malformed
     *                             data.
     */
    public StudentDatabase loadStudent(String filename) throws IOException,
            FileNotFoundException ,DataFormatException {

        StudentDatabase studentDatabase = new StudentDatabase() ;

        BufferedReader reader = new BufferedReader(new FileReader(filename)) ;

        String line = reader.readLine();

        while (line!=null){
            Student student = null ;

            student = readStudent(line) ;

            studentDatabase.addStudent(student);

            line = reader.readLine() ;
        }

        reader.close();

        return studentDatabase ;
    }

    /**
     * Extracts the Student data in the specified line and returns
     * a {@link Student} object that encapsulates the book data.
     *
     * @param line  a string that contains book data.
     * @return  a <code>student</code> object that encapsulates the
     *          book data in the specified line.
     * @throws DataFormatException if the line contains errors.
     */
    private Student readStudent(String line) throws  DataFormatException{

        StringTokenizer stringTokenizer = new StringTokenizer(line,DELIM) ;

        if(stringTokenizer.countTokens() != 13){
            throw new DataFormatException(line) ;
        }else {

            Student student = new Student(stringTokenizer.nextToken(),stringTokenizer.nextToken()
            ,stringTokenizer.nextToken(),stringTokenizer.nextToken(),
                    stringTokenizer.nextToken(),stringTokenizer.nextToken()
            ,stringTokenizer.nextToken()) ;

            student.evaluationGrade = new EvaluationGrade() ;
            student.evaluationGrade.setG1(Double.parseDouble(stringTokenizer.nextToken()));

            student.evaluationGrade.setG2(Double.parseDouble(stringTokenizer.nextToken()));

            student.evaluationGrade.setG3(Double.parseDouble(stringTokenizer.nextToken()));

            student.evaluationGrade.setG4(Double.parseDouble(stringTokenizer.nextToken()));

            student.evaluationGrade.setG5(Double.parseDouble(stringTokenizer.nextToken()));

            student.evaluationGrade.setG6(Double.parseDouble(stringTokenizer.nextToken()));

            student.evaluationGrade.calculationGrade() ;

            return student ;

        }
    }

}
