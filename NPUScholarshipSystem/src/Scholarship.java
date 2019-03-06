/**
 * This class models a Scholarship.
 *
 * @author xieqijun
 * @version 1.0.0
 */
public class Scholarship {

    private String name;

    private String amoutOfMoney;

    private String selectionConditions;

    /**
     * Constructs a <code>Scholarship</code> object.
     *
     * @param initialName                the name of the Scholarship.
     * @param initialAmoutOfMoney        the amoutOfMoney of the Scholarship.
     * @param initialSeletcionConditions the selectionConditions the Scholarship.
     */
    public Scholarship(String initialName, String initialAmoutOfMoney, String initialSeletcionConditions) {

        this.name = initialName;

        this.amoutOfMoney = initialAmoutOfMoney;

        this.selectionConditions = initialSeletcionConditions;
    }

    /**
     * judgement the student of the Scholarship
     *
     * @param student the student
     * @return yes or no .
     */
    public boolean judgementCondition(Student student) {

        if (selectionConditions.equals("Top one in professional ranking")) {

            if (student.ranking == 1) return true;
            else return false;
        } else if (selectionConditions.equals("Top two in professional ranking")) {

            if (student.ranking <= 2) return true;
            else return false;
        } else return false;
    }

    /**
     * return the name of Scholarship
     *
     * @return the name of Scholarship
     */
    public String getName() {

        return this.name;
    }

    /**
     * Returns the string representation of this Scholarship.
     *
     * @return the string representation of this Scholarship.
     */
    public String toString() {

        return "name: " + name + "\namoutOfMoney: " +
                amoutOfMoney + "\nselectionConditions:  " + selectionConditions;
    }

    //public String getSelectionConditions(){

    //     return this.selectionConditions ;
    // }
}
