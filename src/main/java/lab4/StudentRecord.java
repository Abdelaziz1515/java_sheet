package lab4;

import java.util.Objects;

public class StudentRecord {
    private double firstQuiz;
    private double secondQuiz;
    private double thirdQuiz;
    private double midTerm;
    private double finalExam;
    private double score;

    private char grade;

    public double computeNumericGrade(){
        double quizzes=firstQuiz+secondQuiz+thirdQuiz;

        score=((finalExam/100)*.4)+((midTerm/100)*.35)+((quizzes/30)*.25);
        score=score*100;
        return score;
    }

    public void letterGrade(){
        System.out.println(score);
        if (score>=90&&score<100){
            grade='A';
            System.out.println(grade);}
        else if (score>=80&&score<90){
            grade='B';
            System.out.println(grade);}
        else if (score>=70&&score<80){
            grade='C';
            System.out.println(grade);}
        else if (score>=60&&score<70){
            grade='D';
            System.out.println(grade);}
        else {
            grade='F';
            System.out.println(grade);}


    }

    public double getFirstQuiz() {
        return firstQuiz;
    }

    public void setFirstQuiz(double firstQuiz) {
        this.firstQuiz = firstQuiz;
    }

    public double getSecondQuiz() {
        return secondQuiz;
    }

    public void setSecondQuiz(double secondQuiz) {
        this.secondQuiz = secondQuiz;
    }

    public double getThirdQuiz() {
        return thirdQuiz;
    }

    public void setThirdQuiz(double thirdQuiz) {
        this.thirdQuiz = thirdQuiz;
    }

    public double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(double midTerm) {
        this.midTerm = midTerm;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentRecord)) return false;
        StudentRecord that = (StudentRecord) o;
        return Double.compare(that.firstQuiz, firstQuiz) == 0 && Double.compare(that.secondQuiz, secondQuiz) == 0 && Double.compare(that.thirdQuiz, thirdQuiz) == 0 && Double.compare(that.midTerm, midTerm) == 0 && Double.compare(that.finalExam, finalExam) == 0 && Double.compare(that.score, score) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstQuiz, secondQuiz, thirdQuiz, midTerm, finalExam, score);
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "firstQuiz=" + firstQuiz +
                ", secondQuiz=" + secondQuiz +
                ", thirdQuiz=" + thirdQuiz +
                ", midTerm=" + midTerm +
                ", finalExam=" + finalExam +
                ", score=" + score +
                '}';
    }
}
