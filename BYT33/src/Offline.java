class Offline extends ExaminationProcessTemplate
{

    @Override
    public void Admission()
    {
        System.out.println("You are admitted to the exam");
    }

    @Override
    public void Exam()
    {
        System.out.println("You come to the university and take the exam ");
    }

    @Override
    public void Score()
    {
        System.out.println("Waiting for the teacher to transfer the grade to the system");
        System.out.println("Viewing your grade in the system ");
    }

}