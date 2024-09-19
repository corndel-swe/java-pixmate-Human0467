package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class Diagonal {

    public static void main(String[] args) {

        drawDiagonal(5, true);
    }

    public static void drawDiagonal(int length, boolean isUp){

        StringBuilder line = new StringBuilder();

        // if upwards diagonal, spaces are before characters.
        // if downwards, spaces are after character
        if(isUp){
            for (int i = 0; i < length; i++) {
                // add required number of spaces
                line.append(" ".repeat(length-i));
                // add the character
                line.append(Chalk.on("*\n").green());
            }
        } else {
            for (int i = 0; i < length; i++) {
                // add required number of spaces
                line.append(" ".repeat(i));
                // add the character
                line.append(Chalk.on("*\n").green());
            }
        }
        System.out.println(line);
    }
}
