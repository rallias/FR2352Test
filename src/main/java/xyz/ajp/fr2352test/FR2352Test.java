package xyz.ajp.fr2352test;

import net.minecraft.client.multiplayer.ServerAddress;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid="fr2352test", version = "1.0")
public class FR2352Test {
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event ) {
        Logger logger = LogManager.getLogger("fr2352test");
        logger.log(Level.INFO, "Using srvcheckcustom.fr2352.forge.ajp.xyz: ");
        logger.log(Level.INFO, "Expected: customsrv.fr2352.forge.ajp.xyz");
        logger.log(Level.INFO, "Actual: " + ServerAddress.getServerAddress("srvcheckcustom.fr2352.forge.ajp.xyz")[0]);
        logger.log(Level.INFO, "Using srvcheckminecraft.fr2352.forge.ajp.xyz: ");
        logger.log(Level.INFO, "Expected: minecraft.fr2352.forge.ajp.xyz");
        logger.log(Level.INFO, "Actual: " + ServerAddress.getServerAddress("srvcheckminecraft.fr2352.forge.ajp.xyz")[0]);
        logger.log(Level.INFO, "Using minecraft.fr2352.forge.ajp.xyz: ");
        logger.log(Level.INFO, "Expected: minecraft.fr2352.forge.ajp.xyz");
        logger.log(Level.INFO, "Actual: " + ServerAddress.getServerAddress("minecraft.fr2352.forge.ajp.xyz")[0]);
    }
}
