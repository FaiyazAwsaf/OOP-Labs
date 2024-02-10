public class Grade {
    private  int attendanceMark;
    private int quizMark;
    private int midMark;
    private int finalMark;

    public Grade(int attendanceMark, int quizMark, int midMark, int finalMark){
        this.attendanceMark = attendanceMark;
        this.quizMark = quizMark;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    public double gradeCalculation(){
        int totalMark = attendanceMark + quizMark + midMark + finalMark ;
        return ((double) totalMark/300 * 100);
    }

    public void displayStudentGrade(){
        double percentage = gradeCalculation();

        if (percentage >= 80){
            System.out.println("A+");
        }
        else if (percentage >= 75) {
            System.out.println("A");
        } else if (percentage >= 70) {
            System.out.println("A-");
        } else if (percentage >= 65) {
            System.out.println("B+");
        } else if (percentage >= 60) {
            System.out.println("B");
        } else if (percentage >= 55) {
            System.out.println("B-");
        } else if (percentage >= 50) {
            System.out.println("C+");
        } else if (percentage >= 45) {
            System.out.println("C");
        } else if (percentage >= 40) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        }
    }


