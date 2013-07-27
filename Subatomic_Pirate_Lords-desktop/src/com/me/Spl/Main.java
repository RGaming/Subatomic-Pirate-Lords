package com.me.Spl;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Subatomic_Pirate_Lords";
		cfg.useGL20 = false;
		cfg.width = 900;
		cfg.height = 320;
		
		new LwjglApplication(new SPL(), cfg);
	}
}
