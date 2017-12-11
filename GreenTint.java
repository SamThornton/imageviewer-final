import java.awt.Color;

/**
 * An image filter to make the image a bit more green.
 *
 * @author Sam Thornton
 * @version 12.9.2017
 */
public class GreenTint extends Filter
{
    /**
     * Constructor for objects of class RedTint
     * @param name The name of the filter.
     */
    public GreenTint(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                int redLevel = pixel.getRed();
                int blueLevel = pixel.getBlue();
                int greenLevel = pixel.getGreen();
                if (greenLevel < 200) {
                    greenLevel += 30;
                    image.setPixel(x, y, new 
                        Color(redLevel, greenLevel, blueLevel));
                }
                else {
                    greenLevel = 200;
                    image.setPixel(x, y, new
                        Color(redLevel, greenLevel, blueLevel));
                    }
            }
        }
    }

}
