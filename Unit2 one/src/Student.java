import java.util.*;
import java.util.ArrayList;
import java.util.List;
/**
 * This class models an Student. The following information is maintained:
 * <ol>
 * <li>the code of the Student, a <code>int</code></li>
 * <li>the name of the Student, a <code>String</code></li>
 * <li>the taskScoreList of the Student, a <code>List<TaskScore></code></li>
 * </ol>
 *
 * @author  qijun xie
 * @version  1.0.0
 */
public class Student {
	private int code ;
	private String name ;
	public List<TaskScore> taskScoreList = new ArrayList<TaskScore>();
	/**
	 * Return the code of the Student.
	 *
	 * @return the code of the Student.
	 */
	public int getCode() {

		return code;
	}
	/**
	 * Return the name of the Student.
	 *
	 * @return the name of the Student.
	 */
	public String getName() {

		return name;
	}
	/**
	 * Return the List<TaskScore> of the Student.
	 *
	 * @return the list<TaskScore> of the Student.
	 */
	public List<TaskScore> getTaskScoreList()
	{
		return taskScoreList;
	}

	/**
	 * add the taskScore into the student .
	 * @param taskScore the taskScore of the Student.
	 */
	public void addTaskScore(TaskScore taskScore) {

		taskScoreList.add(taskScore);
	}

	/**
	 * Creat a Student object with the specified code , name .
	 * @param initialcode
	 * @param initialname
	 */
	public Student (int initialcode , String initialname){
		this.code = initialcode;
		this.name = initialname;
	}
	/**
	 * Returns the string representation of this Student in the following
	 * format: name: <i>name</i> code:  <i>code</i>
	 * @return a string representation of this Student.
	 */
	public String toString (){
		return "name:  "+name+" code:  "+code;
	}
	
}
