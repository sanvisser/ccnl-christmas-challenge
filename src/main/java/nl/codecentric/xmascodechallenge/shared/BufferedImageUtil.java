package nl.codecentric.xmascodechallenge.shared;

import lombok.experimental.UtilityClass;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@UtilityClass
public class BufferedImageUtil {

    public static final String PNG_FORMAT = "png";

    /**
     * Convert the image into a byte array
     */
    public static byte[] toByteArray(BufferedImage newBi) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(newBi, PNG_FORMAT, baos); //we need to be lossless!
        return baos.toByteArray();
    }

    /**
     * Turn the image back into an byte array
     */
    public static BufferedImage toBufferedImage(byte[] image) throws IOException {
        InputStream is = new ByteArrayInputStream(image);
        return ImageIO.read(is);
    }
}
