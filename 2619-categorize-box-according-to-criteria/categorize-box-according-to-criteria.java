class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean Bulky=(length>=10000)||(width>=10000)||(height>=10000)||(long)length*width*height>=1000000000L;
        boolean Heavy=(mass>=100);
        if(Bulky && Heavy){
            return "Both";
        }
        else if(Bulky){
            return "Bulky";
        }
        else if(Heavy){
            return "Heavy";
        }
        else{
            return "Neither";
        }
    }
}