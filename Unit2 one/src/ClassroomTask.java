import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * This class models an Classroom. The following information is maintained:
 * <ol>
 * <li>the listOfStudnet of the Classroom, a <code>List<Student></code></li>
 * </ol>
 *
 * @author  qijun xie
 * @version  1.0.0
 */
public class ClassroomTask extends Task{
	private List<Student> listOfStudent ;

	/**
	 * Creat a new Classroom object .
	 * @param initialcode
	 * @param initialtitle
	 * @param initialdescription
	 * @param initialcreationDate
	 * @param initialstate
	 */
	public ClassroomTask(int initialcode, String initialtitle, String initialdescription, String  initialcreationDate,
			int initialstate) throws ParseException {
		super(initialcode , initialtitle , initialdescription , initialcreationDate , initialstate);
	}

	/**
	 *Return the listOfStudent of the Classroom .
	 * @return a list<Student>
	 */
	public List<Student> getListOfStudent()
	{
		return listOfStudent;
	}

	/**
	 * Returns the string representation of this Homework in the following
	 * format: Homework: <i>homeworktitle = <i>title</i>， code = <i>code</i>, description = <i>description</i>,craetionDate
	 * 	 = <i>creationDate</i>, state = <i>state</i> deadline = :  <i>deadline</i>
	 * @return a string representation of this Homework.
	 */
	public String toString()
	{
		return "ClassroomTask: "+super.toString();
	}
}
