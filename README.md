Feature Request 2352 Testing Mod
================================

Testing instructions:
---------------------

1. Modify config/forge.cfg so that client -> S:srvRecordKey is set to "custom"

2. Run Minecraft.

In Forge versions with the patch, you should see log lines like the following:

    [15:00:43] [Client thread/INFO] [fr2352test]: Using srvcheckcustom.fr2352.forge.ajp.xyz:
    [15:00:43] [Client thread/INFO] [fr2352test]: Expected: customsrv.fr2352.forge.ajp.xyz
    [15:00:43] [Client thread/INFO] [fr2352test]: Actual: customsrv.fr2352.forge.ajp.xyz.
    [15:00:43] [Client thread/INFO] [fr2352test]: Using srvcheckminecraft.fr2352.forge.ajp.xyz:
    [15:00:43] [Client thread/INFO] [fr2352test]: Expected: minecraft.fr2352.forge.ajp.xyz
    [15:00:43] [Client thread/INFO] [fr2352test]: Actual: srvcheckminecraft.fr2352.forge.ajp.xyz
    [15:00:43] [Client thread/INFO] [fr2352test]: Using minecraft.fr2352.forge.ajp.xyz:
    [15:00:43] [Client thread/INFO] [fr2352test]: Expected: minecraft.fr2352.forge.ajp.xyz
    [15:00:43] [Client thread/INFO] [fr2352test]: Actual: minecraft.fr2352.forge.ajp.xyz
    [15:00:43] [Client thread/INFO] [FML]: Forge Mod Loader has successfully loaded 4 mods

In Forge versions without the patch, you should see log lines like the following:

    [15:03:30] [Client thread/INFO] [fr2352test]: Using srvcheckcustom.fr2352.forge.ajp.xyz:
    [15:03:30] [Client thread/INFO] [fr2352test]: Expected: customsrv.fr2352.forge.ajp.xyz
    [15:03:30] [Client thread/INFO] [fr2352test]: Actual: minecraftsrv.fr2352.forge.ajp.xyz
    [15:03:30] [Client thread/INFO] [fr2352test]: Using srvcheckminecraft.fr2352.forge.ajp.xyz:
    [15:03:30] [Client thread/INFO] [fr2352test]: Expected: minecraft.fr2352.forge.ajp.xyz
    [15:03:30] [Client thread/INFO] [fr2352test]: Actual: minecraftsrv.fr2352.forge.ajp.xyz.
    [15:03:30] [Client thread/INFO] [fr2352test]: Using minecraft.fr2352.forge.ajp.xyz:
    [15:03:30] [Client thread/INFO] [fr2352test]: Expected: minecraft.fr2352.forge.ajp.xyz
    [15:03:30] [Client thread/INFO] [fr2352test]: Actual: minecraft.fr2352.forge.ajp.xyz