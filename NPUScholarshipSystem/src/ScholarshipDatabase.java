import java.util.ArrayList;
import java.util.Iterator;
/**
 * Maintains a collection of {@link Scholarship} objects.
 *
 * @author xieqijun
 * @version  1.0.0
 */

public class ScholarshipDatabase implements Iterable<Scholarship> {
    private ArrayList<Scholarship> scholarships ;

    public ScholarshipDatabase(){

        this.scholarships = new ArrayList<>() ;
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
     * Adds a {@link Scholarship} object to this collection.
     *
     * @param scholarship  the {@link Scholarship} object.
     */
    public void addSchlarship(Scholarship scholarship){

        this.scholarships.add(scholarship) ;
    }

    /**
     * remove a Scholarship to this collection
     * @param scholarship the object .
     */
    public void removeSchlarship(Scholarship scholarship){

        this.scholarships.remove(scholarship) ;
    }

    /**
     * get numberofScholarship .
     * @return numberofScholarship .
     */
    public int getNumberOfScholarship(){

        return scholarships.size();
    }

    /**
     * return the specified scholarship
     * @param name the name of the scholarship
     * @return the specified scholarship.
     */
    public Scholarship getSchlorship(String name){

        for(Scholarship scholarship : scholarships){

            if(scholarship.getName().equals(name))

                return scholarship ;

        }

        return null ;
    }
}
