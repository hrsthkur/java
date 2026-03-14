public class Doc_comments{
    public static void main(String[] args){

    }

   /**
    * Function name: printText
    * @param name (String)
    * @param age (String)
    * 
    * Inside the function
    * 1. prints the name and age as a part of text
    * 
    */

    public static void printText(String name, String age){
        System.out.println("Hii, I am" + name + " and I'm" + age + " years old.");

    }

    /**
     * 
     * Function name: calculateArea
     * 
     * @param length (double)
     * @param width (double)
     * @return area (double)
     * 
     * 
     * Inside the function
     * 
     * 1. calucate the area and returns it.
     * 
     */


    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }
}