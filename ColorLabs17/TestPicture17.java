
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /*
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     */

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //relative path!!!! (ON TEST)
     //                          dir/folder/file
     //Picture beach = new Picture("images\\beach.jpg");
     //Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture moto = new Picture("images/redMotorcycle.jpg");
     //Picture wall = new Picture("images/wall.jpg");
     //displays the picture
     //apic.explore();
     //ferris1.explore();
     //moto.explore();
     
     int red, green, blue;
     Picture apic = new Picture("images/mcl38.jpg");
     Picture apic1 = new Picture("images/mcl38.jpg");
     Picture apic2 = new Picture("images/mcl38.jpg");
     Picture apic3 = new Picture("images/mcl38.jpg");
     Picture lando = new Picture("images/lando.jpg");
     Picture canvas = new Picture("images/canvas.jpg");
     //Picture m1 = new Picture("images/temple.jpg");
     /*Picture m2 = new Picture("images/redMotorcycle.jpg");
     Picture m3 = new Picture("images/redMotorcycle.jpg");
     Picture m4 = new Picture("images/redMotorcycle.jpg");
     Picture m5 = new Picture("images/redMotorcycle.jpg");
     */
    /*
    templeMirror(m1);
    m1.explore();
    m1.write("images/ParkinonFixed.jpg");
    //makes an array of pixels
     //Pixel[] M1pixels;
     //gets pixels from picture and assigns to pixels array
     //M1pixels = m1.getPixels();
     
     */
     //1
     copytoCanvas(apic, canvas);
     //2 Mirror
     mirrorVert(apic);
     copytoCanvasOffsets(apic, canvas, 2500, 0);
     //3 recursive scale
     
     recurScale(apic1, apic1);
     copytoCanvasOffsets(apic1, canvas, 5000, 0);
     
     //4
     greyScale(apic2);
     copytoCanvasOffsets(apic2, canvas, 0, 1667);
     
     //5 blend
     blend(apic3, lando);
     copytoCanvasOffsets(apic3, canvas, 2500, 1667);
     
     canvas.explore();
     
     
     /*
     Pixel[] M2pixels;
     M2pixels = m2.getPixels();
     
     Pixel[] M3pixels;
     M3pixels = m3.getPixels();
     
     Pixel[] M4pixels;
     M4pixels = m4.getPixels();
     
     Pixel[] M5pixels;
     M5pixels = m5.getPixels();
     /*
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );
    
    
    
    /*
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    Pixel spot2 = ferris1.getPixel(433,283);
    Pixel ferr17 = pixels[17];
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    
    Color newColor = new Color(255, 99, 71);
    
    ferr17.setRed(240);
    ferr17.setGreen(100);
    ferr17.setBlue(200);
    
    spot.setColor(newColor);
    spot2.setColor(newColor);
    //ferris1.explore();
    

    for (int i = 0; i < 50000; i++)
    {
        Pixel yuck = ferris1.getPixel((int)(Math.random()*1000), (int)(Math.random()*668));
        yuck.setColor(Color.orange);
    }
    ferris1.explore();
    
    /*

   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    moto.explore();
    
    for (Pixel spot1 : Mpixels)
    {
        //System.out.println(spot1);
        red = spot1.getRed();
        red = (int)(red * .25);
        spot1.setRed(red);
    }
    moto.explore();
    
    for (Pixel spotb : Mpixels)
    {
        blue = spotb.getBlue();
        blue = (int)(blue * (Math.random()));
        spotb.setBlue(blue);
        
        green = spotb.getGreen();
        green = (int)(green * (Math.random()));
        spotb.setGreen(green);
    }
    moto.explore();
   
 /*
    //ADJUST RED
    m1.explore();
    for (Pixel spot1 : M1pixels)
    {
        //System.out.println(spot1);
        red = spot1.getRed();
        red = (int)(red * .25);
        spot1.setRed(red);
    }
    m1.explore();
    m1.write("images/MotoAdjust1.jpg");
    */    
 /*
     //NEGATE()
     for (Pixel p : M2pixels)
     {
        blue = p.getBlue();
        blue = (255 - blue);
        p.setBlue(blue);
        
        green = p.getGreen();
        green = (255 - green);
        p.setGreen(green);
        
        red = p.getRed();
        red = (255 - red);
        p.setRed(red);
     }
     m2.explore();
     m2.write("images/MotoAdjust2.jpg");
/*
    //GRAYSCALE()
     int avg;
     for (Pixel p : M3pixels)
     {
        blue = p.getBlue();
        green = p.getGreen();
        red = p.getRed();
        avg = (blue + green + red)/3;
        p.setBlue(avg);
        p.setGreen(avg);
        p.setRed(avg);
     }
     m3.explore();
     m3.write("images/MotoAdjust3.jpg");
/*
    //LIGHTEN()
     for (Pixel p : M4pixels)
     {
        blue = p.getBlue();
        green = p.getGreen();
        red = p.getRed();
        p.setBlue((int)(blue * 1.25));
        p.setGreen((int)(green * 1.25));
        p.setRed((int)(red * 1.25));
     }
     m4.explore();
     m4.write("images/MotoAdjust4.jpg");
     
/*
    //COLORIFY()
    for (Pixel p : M5pixels)
     {
        blue = p.getBlue();
        green = p.getGreen();
        red = p.getRed();
        if ((red < 180 && red > 100) && (green > 100 && green < 200) && blue < 100)
            {
             p.setRed((int)(red*.25));
             p.setGreen((int)(green*.25));
             p.setBlue((int)(blue*1.25));
            }
     }
     m5.explore();
     m5.write("images/MotoAdjust5.jpg");
     
     
 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");

    /**/
  }//main
  
  /**
   * Method to mirror about a vertical line in the middle
   * of the picture based on the width
   */
  
  public static void mirrorVert(Picture apic)
  {
      int width = apic.getWidth();
      int mirrorPoint = width/2;
      Pixel leftPix = null;
      Pixel rightPix = null;
      
      //loop through all the rows
      for (int y = 0; y < apic.getHeight(); y++)
      {
          //loop from 0 to the middle
          for (int x = 0; x < mirrorPoint; x++)
          {
              leftPix = apic.getPixel(x,y);
              rightPix = apic.getPixel(width-1-x,y);
              rightPix.setColor(leftPix.getColor());
          }
      }
      
  }
  
  public static void greyScale(Picture source)
  {
     Pixel[] Mpixels;
     Mpixels = source.getPixels();
     int avg;
     for (Pixel p : Mpixels)
     {
        int blue = p.getBlue();
        int green = p.getGreen();
        int red = p.getRed();
        avg = (blue + green + red)/3;
        p.setBlue(avg);
        p.setGreen(avg);
        p.setRed(avg);
     }
  }
  
  public static void templeMirror(Picture apic)
  {
      int offset = 7;
      int width = apic.getWidth()-7;
      
      int mirrorPoint = (width/2) - offset;
      Pixel leftPix = null;
      Pixel rightPix = null;
      
      //loop through all the rows
      for (int y = 0; y < 145; y++)
      {
          //loop from 0 to the middle
          for (int x = 14; x < mirrorPoint; x++)
          {
              leftPix = apic.getPixel(x,y);
              rightPix = apic.getPixel(width-1-x,y);
              rightPix.setColor(leftPix.getColor());
          }
      }
      
  }
  
  public static void copytoCanvas(Picture source, Picture target)
  {
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //loop thru the columns (targetX is starting point on canvas)    sourceX+=2 (larger sX = sX + .5)
      for (int sourceX = 0, targetX = 0; sourceX  < source.getWidth(); sourceX++, targetX++)
      {
          //thru the rows                                                   sourceY+=2 (larger sY = sY + .5)
          for (int sourceY = 0, targetY = 0; sourceY  < source.getHeight(); sourceY++, targetY++)
          {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
  
    public static void recurScale(Picture source, Picture target)
    {
        if (source.getWidth() < 10)
            return;
        
        int newWidth = source.getWidth() / 2;
        int newHeight = source.getHeight() / 2;
        
        Picture smaller = new Picture(newWidth, newHeight);
        
        for (int x = 0; x < newWidth; x++)
        {
            for (int y = 0; y < newHeight; y++)
            {
                Color c = source.getPixel(x * 2, y * 2).getColor();
                smaller.getPixel(x, y).setColor(c);
            }
        }
        
        for (int x = 0; x < newWidth; x++)
        {
            for (int y = 0; y < newHeight; y++)
            {
                Color c = smaller.getPixel(x, y).getColor();
                target.getPixel(x, y).setColor(c);
            }
        }
        
        recurScale(smaller, target);
    }
  
  public static void blend(Picture source, Picture blendie)
  {
      Pixel sourcePix;
      
      for (int x = 0; x < source.getWidth(); x++)
      {
          for (int y = 0; y < source.getHeight(); y+=2)
          {
              sourcePix = source.getPixel(x, y);
              Color color = blendie.getPixel(x, y).getColor();
              sourcePix.setColor(color);
          }
      }
  }
  
  public static void copytoCanvasOffsets(Picture source, Picture target, int x, int y)
  {
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //loop thru the columns (targetX is starting point on canvas)    sourceX+=2 (larger sX = sX + .5)
      for (int sourceX = 0, targetX = x; sourceX  < source.getWidth(); sourceX++, targetX++)
      {
          //thru the rows                                                   sourceY+=2 (larger sY = sY + .5)
          for (int sourceY = 0, targetY = y; sourceY  < source.getHeight(); sourceY++, targetY++)
          {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
}//class
