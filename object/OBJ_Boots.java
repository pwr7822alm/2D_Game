package object;

import java.io.*;
import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Boots extends SuperObject{

    GamePanel gp;

    public OBJ_Boots(GamePanel gp) {

        this.gp = gp;
        name = "Boots";

        try {
            
            image = ImageIO.read(getClass().getResourceAsStream("/res/img/object/boots.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch (IOException e) {
            //TODO: handle exception
        }
        collision = true;
    }

}
