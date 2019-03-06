import java.io.*;

/**
 * This class implements a sample of NPUSchlarshipSystem.
 *
 * @author xieqijun
 * @version 1.0.0
 */
public class NPUSchlarshipSystem {

    private static BufferedReader stdIn =
            new BufferedReader(new InputStreamReader(System.in));

    private static PrintWriter stdOut =
            new PrintWriter(System.out, true);

    private static PrintWriter stdErr =
            new PrintWriter(System.err, true);

    private ScholarshipDatabase scholarshipDatabase;

    private StudentDatabase studentDatabase;

    /**
     * Load student information and scholarship information from a
     * file and than start the application
     *
     * @param args String arguments
     * @throws IOException          if there are errors in the input.
     * @throws InterruptedException if there are errors int Interrupted.
     */
    public static void main(String[] args) throws IOException, InterruptedException {

        if (args.length != 2) {
            stdErr.println("Please input two filenames\n");
        } else {

            StudentDatabase studentDatabase = null;

            ScholarshipDatabase scholarshipDatabase = null;

            try {
                StudentLoader studentLoader = new FileStudentLoader();

                SchlorshipLoader schlorshipLoader = new FileSchlorshipLoader();

                studentDatabase = studentLoader.loadStudent(args[0]);

                scholarshipDatabase = schlorshipLoader.loadSchlorship(args[1]);
            } catch (FileNotFoundException fnfe) {

                stdErr.println("The file does not exit");

                System.exit(1);
            } catch (DataFormatException dfe) {

                stdErr.println("The file contains malformed data :" + dfe.getMessage());

                System.exit(1);
            }

            NPUSchlarshipSystem app = new NPUSchlarshipSystem(
                    studentDatabase, scholarshipDatabase);

            app.run();
        }
    }

    /**
     * Constructs a <code>NPUSchlarshipSystem</code> object.
     *
     * @param studentDatabase     the information of student.
     * @param scholarshipDatabase the information of scholarship .
     */
    private NPUSchlarshipSystem(StudentDatabase studentDatabase,
                                ScholarshipDatabase scholarshipDatabase) {

        this.studentDatabase = studentDatabase;

        this.scholarshipDatabase = scholarshipDatabase;
    }

    /**
     * start the application
     *
     * @throws IOException          if there are errors in the input.
     * @throws InterruptedException if there are errors int Interrupted.
     */
    private void run() throws IOException, InterruptedException {

        int choice = getChoice();

        Thread.sleep(300);

        while (choice != 0) {
            if (choice == 1) {

                displayStudent();

            } else if (choice == 2) {

                displayStudentByGrade();

            } else if (choice == 3) {

                stdOut.println("please input student's name ->\n");

                String name = stdIn.readLine();

                displayStudentByName(name);

            } else if (choice == 4) {

                displaySchalorship();

            } else if (choice == 5) {

                stdOut.println("please input scholarship's name ->\n");

                String name = stdIn.readLine();

                displayScholarshipByName(name);

            } else if (choice == 6) {

                stdOut.println("please input student's name ->\n");

                String studentName = stdIn.readLine();

                stdOut.println("please input scholarship's name ->\n");

                String scholarshipName = stdIn.readLine();

                AddSchalorshipToStudent(studentName, scholarshipName);

            } else if (choice == 7) {

                stdOut.println("please input student's name ->\n");

                String studentName = stdIn.readLine();

                displaySchalorshipOfStudent(studentName);
            }

            choice = getChoice();
        }
    }

    /**
     * get teh choice from the readline.
     *
     * @return the choice
     * @throws IOException if there are errors in the input.
     */
    private int getChoice() throws IOException {

        int input;

        do {
            try {
                Thread.sleep(100);
                stdErr.println();

                stdErr.print("[0]  Quit\n"
                        + "[1]  Display student's information\n"
                        + "[2]  Display student's ranking according their grade\n"
                        + "[3]  Display student's information by thier name\n"
                        + "[4]  Display all scholarship information\n"
                        + "[5]  Display scholarship information according their name\n"
                        + "[6]  Apply for scholarship\n"
                        + "[7]  Display student's scholarship\n"
                        + "choice> ");

                stdErr.flush();

                input = Integer.parseInt(stdIn.readLine());

                stdErr.println();

                if (0 <= input && input <= 7) {
                    break;
                } else {
                    stdErr.println("Invalid choice: " + input);
                }
            } catch (NumberFormatException nfe) {
                stdErr.println(nfe);
            } catch (InterruptedException e) {

            }
        } while (true);

        return input;
    }

    /**
     * Display student's information
     */
    private void displayStudent() {

        for (Student student : studentDatabase) {

            stdOut.println(student.toString() + "\n");
        }
    }

    /**
     * Display student's ranking according their grade
     */
    private void displayStudentByGrade() {

        studentDatabase.sortArrayList();

        for (Student student : studentDatabase) {

            stdOut.println(student.toStringsort() + "\n");
        }
    }

    /**
     * Display student's information by thier name
     *
     * @param name the name of student .
     */
    private void displayStudentByName(String name) {

        int falg = 0;

        for (Student student : studentDatabase) {

            if (student.getName().equals(name)) {

                stdOut.println(student.toString());

                falg = 1;

                break;
            }
        }

        if (falg == 0) {

            stdOut.println("cannot find student\n");
        }
    }

    /**
     * Display all scholarship information
     */
    private void displaySchalorship() {

        for (Scholarship scholarship : scholarshipDatabase) {

            stdOut.println(scholarship.toString() + "\n");

        }
    }

    /**
     * Display scholarship information according their name
     *
     * @param name the name of scholarship
     */
    private void displayScholarshipByName(String name) {

        int falg = 0;

        stdOut.println(name + "\n");

        for (Scholarship scholarship : scholarshipDatabase) {

            stdOut.println(scholarship.getName() + "\n");

            if (scholarship.getName().equals(name)) {

                stdOut.println(scholarship.toString());

                falg = 1;

                break;
            }
        }

        if (falg == 0) {

            stdOut.println("cannot find scholarship\n");

        }
    }

    /**
     * Apply for scholarship
     *
     * @param studentName     the name of the student.
     * @param schalorshipName the name of the scholarship.
     */
    private void AddSchalorshipToStudent(String studentName
            , String schalorshipName) {

        int falg = 0, falg1 = 0;

        Student student = null;

        Scholarship scholarship = null;

        for (Student student1 : studentDatabase) {

            if (student1.getName().equals(studentName)) {

                student = student1;

                falg = 1;
            }
        }

        for (Scholarship scholarship1 : scholarshipDatabase) {

            if (scholarship1.getName().equals(schalorshipName)) {

                scholarship = scholarship1;

                falg1 = 1;
            }
        }

        if (falg == 0 || falg1 == 0) {

            stdErr.println("input name error\n");
        }

        studentDatabase.sortArrayList();
        //  stdOut.println(scholarship.getSelectionConditions().equals("Top one in professional ranking")+ "\n" +student.ranking);
        if (scholarship.judgementCondition(student)) {

            student.addSchalorship(scholarship);

            stdOut.println(" satisfied with the " +
                    "application conditions , apply successfully!!\n");
        } else {

            stdOut.println(" Not satisfied with the " +
                    "application conditions ,apply fail\n");
        }
    }

    /**
     * Display student's scholarship
     *
     * @param studentName the name of the student.
     */
    private void displaySchalorshipOfStudent(String studentName) {
        int falg = 0;

        Student student = null;

        for (Student student1 : studentDatabase) {

            if (student1.getName().equals(studentName)) {

                student = student1;

                falg = 1;
            }
        }

        if (falg == 0) {

            stdOut.println("cannot find student\n");
        } else {
            if (student.getScholarships().size() == 0) {

                stdOut.println("sorry ,this student don't have any scholarships\n");
            } else {

                stdOut.println(student.getName());

                for (Scholarship scholarship : student.getScholarships()) {
                    stdOut.println(scholarship.toString() + "\n");
                }
            }
        }

    }
}
