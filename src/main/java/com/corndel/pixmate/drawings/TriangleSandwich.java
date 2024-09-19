package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

import static com.corndel.pixmate.drawings.Triangle.drawTriangle;

public class TriangleSandwich {

    public static void main(String[] args) {

        drawTriangleSandwich(7);
    }

    public static void drawTriangleSandwich(int rows) {

        // rows must be odd in order to draw symmetric sandwich
        if(rows%2 == 0){
            System.out.println("Invalid argument; please supply an odd number.");
            return;
        }

        // we'll draw the triangle in two parts, the longest row will belong to the top part
        rows = rows/2 + 1;

        StringBuilder line = new StringBuilder();

        // draw top part of sandwich
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                // add required numbers of *s to line
                line.append(Chalk.on("*").green());
            }
            // print newline
            line.append("\n");
        }

        // draw bottom part
        rows--;
        for (int i = 0; i < rows; i++) {
            // draw correct number of stairs
            for(int j = 0; j < (rows-i); j++){
                line.append(Chalk.on("*").green());
            }
            line.append("\n");
        }
        System.out.println(line);
    }
}
