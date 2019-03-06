import java.io.FileNotFoundException;
import java.io.IOException;

public interface StudentLoader {

    StudentDatabase loadStudent(String filename) throws IOException,
            FileNotFoundException ,DataFormatException;
}
