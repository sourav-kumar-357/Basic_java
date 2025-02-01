package Section_11_OOPs_Concepts;

class Subject {

    private String subjectId;
    private String subjectName;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subjectId, String subjectName, int maxMarks, int marksObtained) {

        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }
    public Subject(String subjectId, String subjectName) {

        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public String getSubjectId() {
        return subjectId;
    }
    public int getMarksObtained() {
        return marksObtained;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public String getSubjectName() {
        return subjectName;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }
    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    boolean isQualified() {
        return marksObtained >= maxMarks / 2;
    }

    public String toString() {

        return "Subject ID: " + subjectId + "\nSubject Name: " + subjectName + "\nMax Marks: " + maxMarks + "\nMarks Obtained: " + marksObtained + "\nQualified: " + isQualified() + "\n";
    }

}
public class Program6_College {
    public static void main(String[] args) {
        
        Subject sub[] = new Subject[3];
        sub[0] = new Subject("S001", "Maths", 100, 50);
        sub[1] = new Subject("S002", "Science", 100, 60);
        sub[2] = new Subject("S003", "English");
        
        sub[2].setMaxMarks( 40);

        for (Subject s : sub) {
            System.out.println(s);
        }
    }
}
