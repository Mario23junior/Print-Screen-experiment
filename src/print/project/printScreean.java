package print.project;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class printScreean {

	public static void main(String[] args) {

		try {
			Robot rob = new Robot();
			BufferedImage img = rob.createScreenCapture(new Rectangle(0, 0, 300, 350));
 			ImageIO.write(img, "jpg", new File("img/newcapture"));
		} catch (Exception e) {
		}
	}
}
