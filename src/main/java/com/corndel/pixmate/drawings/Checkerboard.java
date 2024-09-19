package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class Checkerboard {

    public static void main(String[] args) {

        drawCheckerboard(20,10);
    }

    public static void drawCheckerboard(int width, int height){

        StringBuilder line = new StringBuilder();
        char nextChar;
        // loop over rows
        for (int i = 0; i < height; i++) {
            // odd rows start with *, evens with a ' '
            if(i % 2 != 0){
                nextChar = '*';
            }else{
                nextChar = ' ';
            }
            // now alternate * and ' ' for the required width
            for (int j = 0; j < width; j++){
                if(nextChar == ' '){
                    line.append(Chalk.on("*").green());
                    nextChar = '*';
                }else{
                    line.append(Chalk.on(" ").green());
                    nextChar = ' ';
                }
            }
            line.append("\n");
        }
        System.out.println(line);
    }
}
