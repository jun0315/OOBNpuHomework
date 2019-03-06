import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Maintains a collection of {@link Student} objects.
 *
 * @author xieqijun
 * @version  1.0.0
 */
public class StudentDatabase implements Iterable<Student> {

    private ArrayList<Student> students;

    public StudentDatabase(){
        this.students = new ArrayList<Student>() ;
    }

    /**
     * Adds a {@link Student} object to this collection.
     *
     * @param student  the {@link Scholarship} object.
     */
    public void addStudent(Student student) {

        this.students.add(student) ;
    }

    /**
     * Returns an iterator over the borrowers in this database.
     *
     * return  an {@link Iterator} of {@link Student}
     */
    public Iterator<Student> iterator(){
        return this.students.iterator();
    }

    /**
     * return the specified student
     * @param schoolnumber the name of the student
     * @return the specified student.
     */
    public Student getStudent(String schoolnumber){

        for(Student student1 : students){

            if(student1.getSchoolNumber().equals(schoolnumber))

                return student1 ;
        }

        return null ;
    }

    /**
     * get numberofScholarship .
     * @return numberofScholarship .
     */
    public int getNumberOfStudent(){

        return students.size() ;

    }

    /**
     * sort the student by the grade
     */
    public void sortArrayList(){

        Collections.sort(students,new SortByRanking());

        int i = 1 ;

        for(Student student : students){

            student.ranking = i++ ;
        }
    }


}

class SortByRanking implements Comparator{

    public int compare(Object o1 , Object o2){

        Student s1 = (Student) o1 ;

        Student s2 = (Student) o2 ;

        if(s1.evaluationGrade.grade < s2.evaluationGrade.grade) return 1;

        else return -1 ;
    }
}