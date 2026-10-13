package org.codewiththamsanqa;

public class PassOrFail {
    int mark = 78;

public void passOrFail(){
    String result;
    if(this.mark < 0 || this.mark > 100 ){
        result = "Invalid Input";
    }else if(this.mark >= 50){
        result = "Pass";
    }else{
        result = "fail";
    }

    System.out.println(result);
}
}
