
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
         Picture me = new Picture("images/cubs.jpg");
         Picture me1 = new Picture("images/cubs.jpg");
         Picture me2 = new Picture("images/cubs.jpg");

         Pixel[] Mpixels;
         Mpixels = me.getPixels();
         
         /**
          * method 1 change
          * 
          */
         
         int avg, blue, green, red;
         for (Pixel p : Mpixels)
         {
            blue = p.getBlue();
            green = p.getGreen();
            red = p.getRed();
            avg = (blue + green + red)/3;
            p.setBlue(avg);
            p.setGreen(avg);
            p.setRed(avg);
         }
         me.explore();
         
         for (Pixel p : Mpixels)
         {
            blue = p.getBlue();
            
            if (blue < 64)
                p.(0,0,255);
            
         }
         me.explore();
         
         
         
         
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
