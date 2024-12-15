package Obj;

import Entity.Entity;
import main.GamePanel;

public class OBJ_DOOR extends Entity {

    public OBJ_DOOR(GamePanel gp) {
        super(gp);

        name = "Door";
        down1 = setup("/Objects/door", gp.tileSize, gp.tileSize);
        collision = true;

        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
}
