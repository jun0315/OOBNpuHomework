/**
 * the EvaluationGrade of the student and contain G1,G2,G3,G4,G5,G6 and grade
 */
public class EvaluationGrade {
    private double G1 ;
    private double G2 ;
    private double G3 ;
    private double G4 ;
    private double G5 ;
    private double G6 ;

    public double grade ;

    public EvaluationGrade(){
    }

    /**
     * calculationGrade by the specified
     */
    public void calculationGrade(){

        this.grade =  0.8*G1 + 0.1*(G2+G3+G4) + 0.1*G5 - 0.1*G6 ;
    }

    /**
     * Returns the string representation of this EvaluationGrade.
     *
     * @return  the string representation of this EvaluationGrade.
     */
    public String toString(){

        return "G1: " + G1 +"   G2: " + G2 + "   G3: " + G3 +"   G4: " + G4
                + "   G5: " + G5 + "   G6: " + G6 + "\n Grade: " + grade ;
    }

    /**
     * set  G1
     * @param g1 the G1 of the EvaluationGrade
     */
    public void setG1(double g1){
        G1 = g1 ;
    }

    /**
     * set  G2
     * @param g2 the G1 of the EvaluationGrade
     */
    public void setG2(double g2){
        G2 = g2 ;
    }

    /**
     * set  G3
     * @param g3 the G1 of the EvaluationGrade
     */
    public void setG3(double g3){
        G3 = g3 ;
    }

    /**
     * set  G4
     * @param g4 the G1 of the EvaluationGrade
     */
    public void setG4(double g4){
        G4 = g4 ;
    }

    /**
     * set  G5
     * @param g5 the G1 of the EvaluationGrade
     */
    public void setG5(double g5){
        G5 = g5 ;
    }

    /**
     * set  G6
     * @param g6 the G1 of the EvaluationGrade
     */
    public void setG6(double g6){
        G6 = g6 ;
    }
}
