package Imersao_Java.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/*
 * read image
 * creat new image in memory with transparent background and new size
 * copy image original for new image (in memory)
 * writer text in image
 * save image in new file
 */

public class GerandoFiguras {

  /**
   * @throws Exception
   */
  public void creat() throws Exception {
    BufferedImage originalImage = ImageIO.read(new File("entrada/film.jpg"));

    int width = originalImage.getWidth();
    int height = originalImage.getHeight();
    int newHeigth = height + 200;
    BufferedImage newImage = new BufferedImage(
      width,
      newHeigth,
      BufferedImage.TRANSLUCENT
    );

    Graphics2D g2d = (Graphics2D) newImage.getGraphics();
    g2d.drawImage(originalImage, 0, 0, null);

    var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 80);
    g2d.setColor(Color.YELLOW);
    g2d.getClipBounds();
    g2d.setFont(fonte);

    g2d.drawString("TOPZERA", 125, newHeigth - 70);

    ImageIO.write(newImage, "png", new File("saida/figura.png"));
  }

  public static void main(String[] args) throws Exception {
    var gera = new GerandoFiguras();
    gera.creat();
  }
}
