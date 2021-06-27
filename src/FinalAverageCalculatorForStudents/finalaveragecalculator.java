package FinalAverageCalculatorForStudents;
import javax.swing.JOptionPane;

public class finalaveragecalculator {
    public static void main(String[] args) {
        double YourCurrentAverage = 0; //for calculating North American average
        double AtLeastAverage = 0;
        double FinalWorth = 0;
        double FinalAverage = 0;

        double vietnamMarksHS1 = 0;  //for calculating Vietnamese average
        double vietnamMarksHS2 = 0;
        double vietnamMarksHS3 = 0;

        double sobaiVietnamHS1 = 0;
        double sobaiVietnamHS2 = 0;
        double sobaiVietnamHS3 = 0;

        String firstname;
        firstname = JOptionPane.showInputDialog("First Name");

        String lastname;
        lastname = JOptionPane.showInputDialog("Last Name");
        String fullname;
        fullname = firstname + " " + lastname;
        JOptionPane.showMessageDialog(null, "Welcome, " + fullname);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Verify your age to continue"));
        if (age < 16)
            throw new ArithmeticException("Access denied \n You must be at least 16 years old to use this calculator");
        else
            System.out.println();
        String[] options = {"Canada", "Vietnam", "Both / Ca hai", "None"};
        int optionsMESSAGE = JOptionPane.showOptionDialog(null, "Which country's average calculator do you want to choose?",
                "Choose an option / Vui long chon",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        if (optionsMESSAGE == 0)
            calculateFinalAvgNA(YourCurrentAverage, AtLeastAverage, FinalWorth, FinalAverage);

        else if (optionsMESSAGE == 1)
            calculateFinalAvgVietnam(vietnamMarksHS1, vietnamMarksHS2, vietnamMarksHS3, sobaiVietnamHS1, sobaiVietnamHS2, sobaiVietnamHS3);

        else if (optionsMESSAGE == 2)
        {
            calculateFinalAvgNA(YourCurrentAverage, AtLeastAverage, FinalWorth, FinalAverage);
            calculateFinalAvgVietnam(vietnamMarksHS1, vietnamMarksHS2, vietnamMarksHS3, sobaiVietnamHS1, sobaiVietnamHS2, sobaiVietnamHS3);
        }

        else
            JOptionPane.showMessageDialog(null, "See you again :) / Hen gap lai :)");


        System.exit(0);
    }

    private static void calculateFinalAvgNA(double YourCurrentAverage, double AtLeastAverage, double FinalWorth, double FinalAverage)
    {
        YourCurrentAverage = 0;
        AtLeastAverage = 0;
        FinalWorth = 0;
        FinalAverage = 0;


        double askforAverage = Double.parseDouble(JOptionPane.showInputDialog("Your current average is "));

        double askforAtLeastAvg = Double.parseDouble(JOptionPane.showInputDialog("You want (at least) how many % in your class "));

        double askforFinalWorth = Double.parseDouble(JOptionPane.showInputDialog("What is your final worth?"));


        FinalAverageclass calculateFinal = new FinalAverageclass(FinalAverage, YourCurrentAverage, AtLeastAverage, FinalWorth);

        String[] stringcalculateFINAL = {"Yes", "No", "I'm not sure", "Set an alarm until I got the final marks"};
        int calculateFinalMESSAGE = JOptionPane.showOptionDialog(null, "Calculate what I need on the final", " Choose an Option",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, stringcalculateFINAL, stringcalculateFINAL[0]);

        calculateFinal.showAverage(askforAverage);
        calculateFinal.showAtLeastAverage(askforAtLeastAvg);
        calculateFinal.showFinalAverage(askforFinalWorth / 100);

        if (calculateFinalMESSAGE == 0)  //if the user chooses "Yes"
        {
            JOptionPane.showMessageDialog(null, "You need " + calculateFinal.calcFinalAverage() + " to get a " + askforAtLeastAvg);
        }

        else if (calculateFinalMESSAGE == 2)
        {
            JOptionPane.showMessageDialog(null, "Okay, don't be stressed about your final marks :)");
        }

        else if (calculateFinalMESSAGE == 3)
        {
            int timesetMESSAGE = Integer.parseInt(JOptionPane.showInputDialog("What time do you want to set? "));
            while (timesetMESSAGE < 0 || timesetMESSAGE > 24)
            {
                JOptionPane.showMessageDialog(null, "Invalid Time! Please try again.");
                timesetMESSAGE = Integer.parseInt(JOptionPane.showInputDialog("What time do you want to set? "));
            }
            String[] timeset = {"AM", "PM", "Anytime", "Cancel"};
            int AMPMtimesetMESSAGE = JOptionPane.showOptionDialog(null, "AM or PM?", "Choose an Option",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, timeset, timeset[1]);
            if (AMPMtimesetMESSAGE == 0)
                JOptionPane.showMessageDialog(null, "By " + timesetMESSAGE + "\t" + timeset[0] + " we will notify you. ");
            else if (AMPMtimesetMESSAGE == 1)
                JOptionPane.showMessageDialog(null, "By " + timesetMESSAGE + "\t" + timeset[1] + " we will notify you. ");
            else if (AMPMtimesetMESSAGE == 2)
                JOptionPane.showMessageDialog(null, "Okay, feel free to come here at anytime :)");
            else
                JOptionPane.showMessageDialog(null, "Bye:)");


        }
    }

    private static void calculateFinalAvgVietnam(double vietnamMarksHS1, double vietnamMarksHS2, double vietnamMarksHS3,
                                                 double sobaiVietnamHS1, double sobaiVietnamHS2, double sobaiVietnamHS3)
    {
        vietnamMarksHS1 = 0;
        vietnamMarksHS2 = 0;
        vietnamMarksHS3 = 0;



        double howmanyHS1 = Double.parseDouble(JOptionPane.showInputDialog("Ban co bao nhieu bai kiem tra HE SO 1? "));
        double totalmarksHS1 = 0;
        for (int count = 0; count < howmanyHS1; count++)
        {
            double marksHS1 = Double.parseDouble(JOptionPane.showInputDialog("Diem cua bai " + (count + 1) + " kiem tra HE SO 1: "));
            totalmarksHS1 += marksHS1;
        }


        double howmanyHS2 = Double.parseDouble(JOptionPane.showInputDialog("Ban co bao nhieu bai kiem tra HE SO 2? "));
        double totalmarksHS2 = 0;
        for (int count = 0; count < howmanyHS2; count++)
        {

            double marksHS2 = Double.parseDouble(JOptionPane.showInputDialog("Diem cua bai " + (count + 1) + " kiem tra HE SO 2: "));
            totalmarksHS2 += marksHS2;
        }


        double howmanyHS3 = Double.parseDouble(JOptionPane.showInputDialog("Ban co bao nhieu bai kiem tra HE SO 3? "));
        double totalmarksHS3 = 0;
        for (int count = 0; count < howmanyHS3; count++)
        {

            double marksHS3 = Double.parseDouble(JOptionPane.showInputDialog("Diem cua bai " + (count + 1) + " kiem tra HE SO 3: "));
        }

        VietnameseAverage calcVietnamAvg = new VietnameseAverage(vietnamMarksHS1, vietnamMarksHS2, vietnamMarksHS3,
                sobaiVietnamHS1, sobaiVietnamHS2, sobaiVietnamHS3);
        String[] vietnamMESSAGE = {"Co", "Khong", "De sau", "Thoat"};
        int vietnamavgMESSAGE = JOptionPane.showOptionDialog(null, "Ban co muon tinh diem trung binh bay gio khong?", "Diem trung binh",
                JOptionPane.DEFAULT_OPTION,   JOptionPane.INFORMATION_MESSAGE,
                null, vietnamMESSAGE, vietnamMESSAGE[0]);
        calcVietnamAvg.showVietnamHS1(totalmarksHS1);
        calcVietnamAvg.showVietnamHS2(totalmarksHS2 * 2);
        calcVietnamAvg.showVietnamHS3(totalmarksHS3 * 3);

        calcVietnamAvg.showsobaiHS1(howmanyHS1);
        calcVietnamAvg.showsobaiHS2(howmanyHS2);
        calcVietnamAvg.showsobaiHS3(howmanyHS3);

        if (vietnamavgMESSAGE == 0)
            JOptionPane.showMessageDialog(null, "Diem trung binh mon cua ban la " + (double)calcVietnamAvg.calcVietnamAverage());
        else if (vietnamavgMESSAGE == 1)
            JOptionPane.showMessageDialog(null, "Bye :)");
        else if (vietnamavgMESSAGE == 2)
        {
            JOptionPane.showMessageDialog(null, "Xin cam on :)");
        }
        else
            JOptionPane.showMessageDialog(null, "Bye :)");




    }



}
