abstract class ExaminationProcessTemplate
{


    public abstract void Admission();

    public abstract void Exam();

    public final void Autopass()
    {
            System.out.println("You pass the exam automatically! ");
    }

    public abstract void Score();

    public final void processOrder(boolean isNeeded)
    {
        Admission();

        if (isNeeded) {
            Exam();
        } else{
            Autopass();
        }
        Score();
    }
}