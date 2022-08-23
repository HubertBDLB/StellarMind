package stellar.content;

import arc.graphics.*;
import mindustry.world.*;
import mindustry.content.*;
import mindustry.world.meta.*;
import mindustry.world.Block;
import mindustry.world.blocks.*;
import mindustry.world.blocks.environment.*;

public class StellarEnvironment {
    public static Block
        test;

    public void load() {

        //Arkans
        test = new Floor("test") {{
            attributes.set(Attribute.water, -0.25f);
            mapColor = new Color(235, 64, 52, 1);
        }};
    }
}
