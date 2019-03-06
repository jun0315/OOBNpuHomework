import java.text.ParseException;
import java.util.Date;
/**
 * This class models an Homework. The following information is maintained:
 * <ol>
 * <li>the deadline of the Homework, a <code>String</code></li>
 * </ol>
 *
 * @author  qijun xie
 * @version  1.0.0
 */
public class Homework extends Task {
	private String deadline ;

	/**Creat a new Homework object with the specified code , title , description , state, deadline.
	 * @param initialcode
	 * @param initialtitle
	 * @param initialdescription
	 * @param initialcreationDate
	 * @param initialstate
	 * @param initialdeadline
	 */
	public Homework(int initialcode, String initialtitle, String initialdescription, String initialcreationDate,
			int initialstate , String initialdeadline) throws ParseException {
		super(initialcode , initialtitle , initialdescription , initialcreationDate,initialstate);
		this.deadline = initialdeadline ;
	}

	/**
	 * get the Deadline of the Student
	 * @return the deadline of the Student
	 */
	public String getDeadline(){
		return this.deadline ;
	}

	/**
	 * Returns the string representation of this Homework in the following
	 * format: Homework: <i>homeworktitle = <i>title</i>， code = <i>code</i>, description = <i>description</i>,craetionDate
	 * 	 = <i>creationDate</i>, state = <i>state</i> deadline = :  <i>deadline</i>
	 * @return a string representation of this Homework.
	 */
	public String toString() {
		return "Homework: "+super.toString() +", deadline = "+ deadline;
	}
}
