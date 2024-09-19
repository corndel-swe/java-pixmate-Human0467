package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class Rectangle {
    public static void main(String[] args){

        // call rectangle, passing height and width
        DrawRectangle(5, 5);

    }

    public static void DrawRectangle(int height, int width){
        // loop over rows
        for(int i = 0; i < height; i++){
            StringBuilder line = new StringBuilder();
            // loop over columns
            for(int j = 0; j < width; j++){
                line.append(Chalk.on("* ").green());
            }
            // print complete row
            System.out.println(line.toString());
        }
    }
}

