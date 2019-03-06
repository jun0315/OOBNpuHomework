/**
 * This class models an TaskScore. The following information is maintained:
 * <ol>
 * <li>the score of the TaksScore, a <code>float</code></li>
 * <li>the task of the TaskScore, a <code>Taks</code></li>
 * <li>the Student of the TaskScore, a <code>Student</code></li>
 * </ol>
 *
 * @author  qijun xie
 * @version  1.0.0
 */
public class TaskScore {
	private float score ;
	private Task task ;
	private Student student ;

	/**
	 * Return the score of the TaskScore.
	 *
	 * @return the score of the TaskScore.
	 */
	public float getScore() {
		return score;
	}

	/**
	 * Modifies the score of the TaskScore.
	 *
	 * @param score the new score of the TaskScore.
	 */
	public void setScore(float score) {
		this.score = score;
	}

	/**
	 * Return the Task of the TaskScore .
	 * @return the Task of the TaskScore.
	 */
	public Task getTask() {

		return task;
	}

	/**
	 * Return the Student of the TaskScore.
	 * @return the Student of the TaskScore.
	 */
	public Student getStudent() {

		return student;
	}

	/**
	 * Creat a TaskScore object with the specified score , task , student .
	 * @param initialscore
	 * @param initialtask
	 * @param initialstudent
	 */
	public TaskScore(float initialscore, Task initialtask, Student initialstudent) {
		this.score = initialscore;
		this.task = initialtask;
		this.student = initialstudent;
	}

}
