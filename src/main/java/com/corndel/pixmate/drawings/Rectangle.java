package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class Rectangle {
    public static void main(String[] args){

        // call rectangle, passing height and width
        drawRectangle(5, 5);

    }

    public static void drawRectangle(int height, int width){
        // loop over rows
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < height; i++){
            // loop over columns
            for(int j = 0; j < width; j++){
                line.append(Chalk.on("* ").green());
            }
            line.append("\n");
        }
        System.out.println(line.toString());
    }
}

