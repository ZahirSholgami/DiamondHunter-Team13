package com.neet.DiamondHunter.GameState;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import com.neet.DiamondHunter.Manager.Content;
import com.neet.DiamondHunter.Manager.GameStateManager;
import com.neet.DiamondHunter.Manager.JukeBox;
import com.neet.DiamondHunter.Manager.Keys;

/** State for the instruction screen.
 * 
 * @author Zachary Christensen
 *
 */
public class InstructionState extends GameState
{
	private BufferedImage bg;
	private BufferedImage instructions;
	
	public InstructionState(GameStateManager gsm)
	{
		super(gsm);
	}
	@Override
	public void init() {
		bg = Content.MENUBG[0][0];
		instructions = Content.INSTR[0][0];
		JukeBox.load("/SFX/collect.wav", "collect");
	}

	@Override
	public void update() {
		handleInput();
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(bg, 0, 0, null);
		g.drawImage(instructions, 0, 0, null);
		
	}

	@Override
	public void handleInput() {
		if(Keys.anyKeyPress()) {
			JukeBox.play("collect");
			returnMenu();
		}
		
	}
	
	private void returnMenu()
	{
		gsm.setState(GameStateManager.MENU);
	}
	
}
