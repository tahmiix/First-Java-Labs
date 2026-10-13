package org.codewiththamsanqa;

public class GradeCalculator {
    int mark = -1;

    public String stuGrade() {
        String result;

        if (this.mark >= 0 && this.mark <= 49) {

            result = "Fail";

        } else if (this.mark >= 50 && this.mark <= 69) {

            result = "Pass";

        } else if (this.mark >= 70 && this.mark <= 79) {

            result = "Merit";

        } else if (this.mark >= 80 && this.mark <= 100) {

            result = "Distinction";

        } else {

            result = "Invalid Mark";
        }
        return result;
    }
}