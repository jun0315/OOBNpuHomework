import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * This class models a Task. The following information is maintained:
 * <ol>
 * <li>the code of the Task, an <code>int</code></li>
 * <li>the title of the Task, a <code>String</code></li>
 * <li>the description of the Task, a <code>String</code></li>
 * <li>the creationDate of the Task, a <code>String</code></li>
 * <li>the state of the Task, an <code>int</code></li>
 * </ol>
 *
 * @author  qijun xie
 * @version  1.0.0
 */
public class Task {
	private int code ;
	private String title ;
	private String description ;
	private Date creationDate ; // Date
	private int state ;

	/**
	 * Creat an Task object with the specified code, title , description , creationDate , state .
	 * @param initialcode
	 * @param initialtitle
	 * @param initialdescription
	 * @param initialcreationDate
	 * @param initialstate
	 */
	public Task(int initialcode, String initialtitle, String initialdescription, String initialcreationDate,
			int initialstate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date date = sdf.parse(initialcreationDate);
		this.code = initialcode;
		this.title = initialtitle;
		this.description = initialdescription;
		this.creationDate = date;
		this.state = initialstate;
	}

	/**
	 * Return the Code of the Task .
	 * @return the Code of the Task .
	 */
	public int getCode() {
		return code;
	}
	/**
	 * Return the Title of the Task .
	 * @return the Title of the Task .
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Return the Description of the Task .
	 * @return the Description of the Task .
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Return the CreationDate of the Task .
	 * @return the CreationDate of the Task .
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * Return the State of the Task .
	 * @return the State of the Task .
	 */
	public int getState() {
		return state;
	}
	/**
	 * Modifies the State of the Task.
	 *
	 * @param state the new score of the Task.
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * Returns the string representation of this Task in the following
	 * format: title = <i>title</i>， code = <i>code</i>, description = <i>description</i>,craetionDate
	 *  = <i>creationDate</i>, state = <i>state</i>
	 *
	 * @return a string representation of this Task.
	 *
	 */
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		return "title = " + title + ", code = "+ code+ ", description = " + description 
		+ ", creationDate = " + sdf.format(this.creationDate) + ", state= " + state ;
	}
}
