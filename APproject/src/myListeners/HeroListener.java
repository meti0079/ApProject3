package myListeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Cardspackage.Spell;
import GAME.Gamestate;
import grapic.PlayPanel;
import interfaces.Visitor;
import playModel.Player;

public class HeroListener implements MouseListener{
private Player me;
private Player enemy;
private Visitor v;

	
	
	
	
	public HeroListener(Player me, Player enemy, Visitor v) {
	this.me = me;
	this.enemy = enemy;
	this.v = v;
}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {

//		if (PlayPanel.getRoundGame()==me.getTurn()) {
//			if(Gamestate.getinsist().getAttacker() instanceof Spell) {
//				if(((Spell)Gamestate.getinsist().getAttacker()).isNeedTarget())
//			}
//		}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}