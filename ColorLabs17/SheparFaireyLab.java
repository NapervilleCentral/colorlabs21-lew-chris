
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /*
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         /**/
         //relative path
         //Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me1 = new Picture("images/cubs.jpg");
         Picture me2 = new Picture("images/cubs.jpg");
         Picture me3 = new Picture("images/cubs.jpg");

         Pixel[] M1pixels;
         M1pixels = me1.getPixels();
         
         Pixel[] M2pixels;
         M2pixels = me2.getPixels();
         
         Pixel[] M3pixels;
         M3pixels = me3.getPixels();
         
         /**
          * method 1 change
          * 
          */
         
         int avg, blue, green, red;
         
         Color offwhite = new Color(230, 220, 199);
         Color lightblue = new Color(106, 174, 199);
         Color darkblue = new Color(24, 67, 83);
         Color newred = new Color(166, 15, 15);
         
         for (Pixel p : M1pixels)
         {
            avg = (int)(p.getAverage());
            p.setBlue(avg);
            p.setGreen(avg);
            p.setRed(avg);
         }
         me1.explore();
         
         for (Pixel p : M1pixels)
         {  
            blue = p.getBlue();
            if (blue < 64)
                p.setColor(darkblue);
            else if (blue < 126)
                p.setColor(newred);
            else if (blue < 189)
                p.setColor(lightblue);
            else
                p.setColor(offwhite);
         }
         me1.explore();
         
         /**
          * method 2 change
          */
         int max = -1, min = 300, diff;
         for (Pixel p : M2pixels)
         {
            avg = (int)(p.getAverage());
            if (avg > max)
                max = avg;
            else if (avg < min)
                min = avg;
            p.setBlue(avg);
            p.setGreen(avg);
            p.setRed(avg);
         }
         for (Pixel p : M2pixels)
         {  
            blue = p.getBlue();
            diff = (max - min)/4;
            if (blue < (int)(diff))
                p.setColor(darkblue);
            else if (blue < (int)(diff * 2))
                p.setColor(newred);
            else if (blue < (int)(diff * 3))
                p.setColor(lightblue);
            else
                p.setColor(offwhite);
         }
         me2.explore();
         /**
          * custom color palette
          */
         
         Color offwhite = new Color(230, 220, 199);
         Color lightblue = new Color(106, 174, 199);
         Color darkblue = new Color(24, 67, 83);
         Color newred = new Color(166, 15, 15);
         
         for (Pixel p : M3pixels)
         {
            avg = (int)(p.getAverage());
            p.setBlue(avg);
            p.setGreen(avg);
            p.setRed(avg);
         }
         me3.explore();
         
         for (Pixel p : M3pixels)
         {  
            blue = p.getBlue();
            if (blue < 64)
                p.setColor(darkblue);
            else if (blue < 126)
                p.setColor(newred);
            else if (blue < 189)
                p.setColor(lightblue);
            else
                p.setColor(offwhite);
         }
         me3.explore();
         me3.write("images/ShepardFairey1.jpg");

    }//main       
}//class
