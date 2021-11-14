class Remote extends ExaminationProcessTemplate
{
    @Override
    public void Admission()
    {
        System.out.println("You are admitted to the exam");

    }

    @Override
    public void Exam()
    {
        System.out.println("Taking an exam on the Teams/EDUX platform ");
    }

    @Override
    public void Score()
    {
        System.out.println("Viewing your grade in the system ");
    }

}