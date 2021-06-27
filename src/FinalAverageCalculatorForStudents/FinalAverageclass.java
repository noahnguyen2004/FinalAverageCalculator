package FinalAverageCalculatorForStudents;

class FinalAverageclass {
    protected double finalcalculate;
    protected double average;
    protected double atleastaverage;
    protected double finalaverage;


    FinalAverageclass (double finalcalc , double avg, double atleastavg, double finalavg)
    {
        this.finalcalculate = finalcalc;
        this.average = avg;
        this.atleastaverage = atleastavg;
        this.finalaverage = finalavg;

    }


    public double getFinalCalc()
    {
        return finalcalculate;
    }
    public double getAverage()
    {
        return average;
    }
    public double getAtLeastAverage()
    {
        return atleastaverage;
    }
    public double getFinalAverage()
    {

        return finalaverage;
    }



    public void showFinalCalc(double finalcalc)
    {
        this.finalcalculate = finalcalc;
    }
    public void showAverage (double avg)
    {
        this.average = avg;
    }
    public void showAtLeastAverage(double atleastavg)
    {
        this.atleastaverage = atleastavg;
    }
    public void showFinalAverage(double finalavg)
    {
        this.finalaverage = finalavg;
    }




    public double calcFinalAverage() //for North America average
    {
        return (atleastaverage - (1 - finalaverage) * average) / finalaverage;
    }


}
