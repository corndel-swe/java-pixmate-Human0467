package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class Triangle {

    public static void main(String[] args) {

        drawTriangle(5);
    }

    public static void drawTriangle(int rows){

        // loop over rows
        for(int i = 0; i < rows; i++){
            StringBuilder line = new StringBuilder();
            for(int j = 0; j <= i; j++){
                // add required numbers of *s to line
                line.append(Chalk.on("*").green());
            }
            // print this row
            System.out.println(line.toString());
        }
    }
}
