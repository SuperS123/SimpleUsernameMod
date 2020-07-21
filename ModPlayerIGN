package clientname.mods.impl;

import clientname.gui.hud.ScreenPosition;
import clientname.mods.ModDraggable;
import net.minecraft.client.Minecraft;

public class ModPlayerIGN extends ModDraggable{

	@Override
	public int getWidth() {
		return font.getStringWidth("IGN: " + Minecraft.getMinecraft().thePlayer.getName());
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		font.drawString("IGN: " + Minecraft.getMinecraft().thePlayer.getName(), pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
	}
	

}
