package clientname.mods;

import clientname.mods.impl.ModPlayerIGN;

public class ModInstances {

	private static ModPlayerIGN modPlayerIGN;
	
	public static void register(HUDManager api) {
  
		modPlayerIGN = new ModPlayerIGN();
		api.register(modPlayerIGN);
	}
}
