package FinalAverageCalculatorForStudents;

class VietnameseAverage {
    protected double vietnamHeSo1;
    protected double vietnamHeSo2;
    protected double vietnamHeSo3;
    protected double sobaiheso1;
    protected double sobaiheso2;
    protected double sobaiheso3;

    VietnameseAverage (double VNHS1, double VNHS2, double VNHS3, double sobaiHS1, double sobaiHS2, double sobaiHS3)
    {
        this.vietnamHeSo1 = VNHS1;
        this.vietnamHeSo2 = VNHS2;
        this.vietnamHeSo3 = VNHS3;
        this.sobaiheso1 = sobaiHS1;
        this.sobaiheso2 = sobaiHS2;
        this.sobaiheso3 = sobaiHS3;
    }


    public double vietnamHS1() //diem tung bai
    {
        return vietnamHeSo1;
    }

    public double vietnamHS2()
    {
        return vietnamHeSo2;
    }

    public double vietnamHS3()
    {
        return vietnamHeSo3;
    }

    public double vietnamsobaiHS1()  //so bai
    {
        return sobaiheso1;
    }
    public double vietnamsobaiHS2()
    {
        return sobaiheso2;
    }
    public double vietnamsobaiHS3()
    {
        return sobaiheso3;
    }

    public void showVietnamHS1(double VNHS1)  //show diem tung bai
    {
        this.vietnamHeSo1 = VNHS1;
    }

    public void showVietnamHS2(double VNHS2)
    {
        this.vietnamHeSo2 = VNHS2;
    }

    public void showVietnamHS3(double VNHS3)
    {
        this.vietnamHeSo3 = VNHS3;
    }

    public void showsobaiHS1(double sobaiHS1) //show so bai
    {
        this.sobaiheso1 = sobaiHS1;
    }

    public void showsobaiHS2(double sobaiHS2)
    {
        this.sobaiheso2 = sobaiHS2;
    }
    public void showsobaiHS3(double sobaiHS3)
    {
        this.sobaiheso3 = sobaiHS3;
    }
    public double calcVietnamAverage()  //for Vietnamese average
    {
        return (vietnamHeSo1 + vietnamHeSo2 + vietnamHeSo3) / (double)(sobaiheso1 + sobaiheso2 + sobaiheso3);
    }
}
