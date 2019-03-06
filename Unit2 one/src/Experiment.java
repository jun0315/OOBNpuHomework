import java.text.ParseException;
import java.util.Date;
/**
 * This class models an Experiment. The following information is maintained:
 * <ol>
 * <li>the deadline of the Experiment, a <code>String</code></li>
 * </ol>
 *
 * @author  qijun xie
 * @version  1.0.0
 */
public class Experiment extends Task {
	private String deadline ;
	private int numberOfJavaFile ;

	/**
	 * Creat a new Experiment object
	 * @param initialcode
	 * @param initialtitle
	 * @param initialdescription
	 * @param initialcreationDate
	 * @param initialstate
	 * @param initialdeadline
	 * @param initialnumberOfJavaFile
	 */
	public Experiment(int initialcode, String initialtitle, String initialdescription, String initialcreationDate,
			int initialstate , String initialdeadline , int initialnumberOfJavaFile) throws ParseException {
		super(initialcode , initialtitle , initialdescription , initialcreationDate ,initialstate);
		this.deadline = initialdeadline ;
		this.numberOfJavaFile = initialnumberOfJavaFile ;
	}

	/**
	 * Return the deadline of the Experiment .
	 * @return
	 */
	public String getDeadline()
	{
		return deadline;
	}

	/**
	 * Return the NumberOfJavaFile of the Experiment .
	 * @return the NumberOfJavaFile of the Experiment .
	 */
	public int getNumberOfJavaFile()
	{
		return numberOfJavaFile;
	}
	/**
	 * Returns the string representation of this Homework in the following
	 * format: Homework: <i>homeworktitle = <i>title</i>， code = <i>code</i>, description = <i>description</i>,craetionDate
	 * 	 = <i>creationDate</i>, state = <i>state</i> deadline = :  <i>deadline</i>
	 * @return a string representation of this Expeirment.
	 */
	public String toString() {
		return "Experiment: "+ super.toString() +  ", deadline = " +deadline + ", numberOfJavaFile = " + numberOfJavaFile;
	}
}
