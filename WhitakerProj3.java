import java.awt.Color;
import java.util.Random;
public class WhitakerProj3 {
	public static void main(String[] args) {
		ImageUtils img = new ImageUtils();
		Color[][] original = img.loadImage("Src/LennaCV.png");


		img.addImage(original, "Original Image");		
		img.addImage(negative(original), "Photo Negative");
		img.addImage(randomColor(original), "Randomly Colored");
	
		
		
		img.display();
	}
	public static Color[][] negative(Color[][] Image) {
		Color[][] negative = ImageUtils.cloneArray(Image);
		int r = 0;
		int g = 0;
		int b = 0;
		for (int row = 0; row < negative.length; row++) {
			for (int col = 0; col < negative[row].length; col++) {
				r = 255-negative[row][col].getRed();
				g = 255-negative[row][col].getGreen();
				b = 255-negative[row][col].getBlue();

				
				negative[row][col] = new Color(r,g,b);
			}
		}
		return negative; 
	}


public static Color[][] randomColor(Color[][] Image) {
	Random rand = new Random();
	Color[][] randomColor = ImageUtils.cloneArray(Image);
	int r = rand.nextInt(255)+1;
	int g = rand.nextInt(255)+1;
	int b = rand.nextInt(255)+1;
	for (int row = 0; row < randomColor.length; row++) {
		for (int col = 0; col < randomColor[row].length; col++) {
			//If you want to just randomize one color replace the variable value with 
			r = rand.nextInt(255)+1;
			//randomColor[row][col].getRed()
			g = rand.nextInt(255)+1;
			//randomColor[row][col].getGreen()
			b = rand.nextInt(255)+1;
			//randomColor[row][col].getBlue()

			
			randomColor[row][col] = new Color(r,g,b);
		}
	}
	return randomColor; 
}
}
