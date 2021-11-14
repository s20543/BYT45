class TemplateTest
{
    public static void main(String[] args)
    {
        ExaminationProcessTemplate Remote = new Remote();
        Remote.processOrder(true);
        System.out.println();
        ExaminationProcessTemplate Offline = new Offline();
        Offline.processOrder(true);

    }
}