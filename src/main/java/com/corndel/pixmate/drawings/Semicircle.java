package com.corndel.pixmate.drawings;

public class Semicircle {

    public static void main(String[] args) {
        drawSemicircle(8);
    }

    public static void drawSemicircle(int radius){

        StringBuilder line = new StringBuilder();
        for (int i = radius; i > 0; i--) {
            // i is the y coord
            // solve the equation x2 + y2 = r2
            int point = (int) Math.sqrt(radius*radius - i*i);
            for(int j = 0; j < radius*2; j++){
                if(j == (radius - point) || j == (radius + point)){
                    line.append("*");
                }else{
                    line.append("  ");
                }

            }

            line.append("\n");
        }
        System.out.println(line);
    }
}
