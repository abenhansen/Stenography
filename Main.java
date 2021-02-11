import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedImage bImage = ImageIO.read(new File("hiddenMessage.png"));
        String extractedBlue = "";
        for (int y = 0; y < bImage.getHeight(); y++) {
            for (int x = 0; x < bImage.getWidth(); x++) {
                Color c = new Color(bImage.getRGB(x, y));
                int blue = c.getBlue();
                String blueString = "";
                blueString = Integer.toBinaryString(blue);
                extractedBlue += blueString.substring(blueString.length() - 1);
            }
        }

        String finalString = "";
        for (int l = 0; l < extractedBlue.length(); l=l+8) {
           String trimmedBlue = extractedBlue.substring(l,l+8);

            if(trimmedBlue.equals("00000000")){
                break;
            }
            StringBuilder sb=new StringBuilder(trimmedBlue);

            int intChar = Integer.parseInt(sb.reverse().toString(),2);
            char c = (char) intChar;
            finalString += c;
        }

        System.out.println(finalString);
    }


}
