package JavaTestSeries;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageFormatConversion {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://fileinfo.com/img/ss/xl/jpg_44.png");
			BufferedImage image = ImageIO.read(url);

			ImageIO.write(image, "jpg", new File("./Images/Laptop.jpg"));
			ImageIO.write(image, "gif", new File("./Images/Laptop.gif"));
			ImageIO.write(image, "bmp", new File("./Images/Laptop.bmp"));

			System.out.println("Done ...");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
