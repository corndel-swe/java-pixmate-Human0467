package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class InvertedTriangle {

    public static void main(String[] args) {

        invertedTriangle(5);
    }

    public static void invertedTriangle(int rows){

        StringBuilder line = new StringBuilder();
        // loop over rows
        for (int i = 0; i < rows; i++) {
            // draw correct number of stars
            for(int j = 0; j < (rows-i); j++){
                line.append(Chalk.on("*").green());
            }
            line.append("\n");
        }
        System.out.println(line.toString());
    }
}
