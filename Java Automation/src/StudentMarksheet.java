public class StudentMarksheet
{


    int total;

    public static void main(String[] args)
    {
        StudentMarksheet studentMarksheet = new StudentMarksheet();
        studentMarksheet.totalMarks(86,94,78);



    }


    void totalMarks(int maths, int sci, int eng)
    {
        total = (maths + sci + eng);
        System.out.println("Total Marks = "+total);
    }




}
