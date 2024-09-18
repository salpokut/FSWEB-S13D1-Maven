package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock>20 && clock<8){
            if(isBarking==true){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if(firstAge>13&&firstAge<19||secondAge>13&&secondAge<19||thirdAge>13&&thirdAge<19){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
    if (isSummer==true){
        if(temp>25&&temp<45){
            return true;
        }else {
            return false;
        }
         } else {
        if(temp>25&&temp<35){
            return true;
        }else {
            return false;
        }
    }
    }

    public static double area(double width, double height) {

            if(width>0&&height>0){
                return width*height;
            }else {
                return -1;
            }
    }

    public static double area(double radius) {
            double pi=3.14;
            if (radius>0){
                return radius*radius*pi;
            }else {
                return -1;
            }
    }
}
