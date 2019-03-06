import java.util.ArrayList;
import java.util.Iterator;
/**
 * This class models a Student.
 * @author xieqijun
 * @version 1.0.0
 */
public class Student implements Iterable<Scholarship> {
    private String name ;
    private String schoolNumber ;
    private String college ;
    private String enrollmentYear ;
    private String sex ;
    private String major ;
    private String tel ;

    public int ranking ;

    public EvaluationGrade evaluationGrade ;

    private ArrayList<Scholarship> scholarships ;

    /**
     * Constructs a <code>Student</code> object.
     */
    public Student(String initialName, String initialSchoolNumber, String initialCollege, String initialEnrollmentYear,
                   String initialSex, String initialMajor, String initiaTel) {

        this.name = initialName;
        this.schoolNumber = initialSchoolNumber;
        this.college = initialCollege;
        this.enrollmentYear = initialEnrollmentYear;
        this.sex = initialSex ;
        this.major = initialMajor;
        this.tel = initiaTel ;
        this.evaluationGrade = null ;

        this.scholarships = new ArrayList<Scholarship>() ;
    }

    /**
     * Returns an iterator over the borrowers in this database.
     *
     * return  an {@link Iterator} of {@link Scholarship}
     */
    public Iterator<Scholarship> iterator(){

        return this.scholarships.iterator();
    }


    /**
     * return the schoolNumber of Student
     * @return the schoolNumber of Student
     */
    public String getSchoolNumber(){

        return this.schoolNumber ;
    }

    /**
     * return the name of Student
     * @return the name of Student
     */
    public String getName(){

        return this.name ;

    }

    public ArrayList<Scholarship> getScholarships(){

        return this.scholarships ;
    }

    /**
     * return the string representation of this student
     * @return the string representation of this student
     */
    public String  toString(){

        return "name: " + this.name + "  schoolNumber: " + this.schoolNumber + "  college: " + this.college
                + "  enrollmentYear: " + enrollmentYear + "  sex: " + sex
                + "  major: " + major + "  tel: " + tel + evaluationGrade.toString() ;
    }

    /**
     * return the string representation of this student by ranking
     * @return the string representation of this student by ranking
     */
    public String toStringsort(){

        return "ranking:  " + ranking + "  name: " + this.name + "  schoolNumber: " + this.schoolNumber + "  college: " + this.college
                + "  enrollmentYear: " + enrollmentYear + "  sex: " + sex
                + "  major: " + major + "  tel: " + tel + evaluationGrade.toString() ;

    }

    /**
     * add the scholarship into the student
     * @param scholarship the scholarship
     */
    public void addSchalorship(Scholarship scholarship){

        this.scholarships.add(scholarship) ;
    }
}
