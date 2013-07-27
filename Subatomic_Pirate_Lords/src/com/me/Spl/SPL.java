package com.me.Spl;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class SPL implements ApplicationListener {
	SpriteBatch spriteBatch;
	BitmapFont font;
	Texture shipTexture;
	@Override
	public void create() {
		spriteBatch = new SpriteBatch();
		Texture texture = new Texture(Gdx.files.internal("Arial.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		shipTexture = new Texture(Gdx.files.internal("Ship.png"));
		font = new BitmapFont(Gdx.files.internal("Arial.fnt"), new TextureRegion(texture), false);
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
	    Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		spriteBatch.begin();
		 font.setColor(.75f, 0f, 0f, 1.0f);
		 font.draw(spriteBatch, "Subatomic Pirate Lords: Genesis", 25, 160);
		 spriteBatch.draw(shipTexture, 0, 0);
		spriteBatch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
