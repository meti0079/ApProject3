package Cardspackage.Weapons;

import Cardspackage.Weapon;
import interfaces.Acceptable;
import interfaces.Visitor;
import playModel.Player;

public class HeavyAxe extends Weapon implements Acceptable{

	public HeavyAxe() {

		this.Set_Name("Heavy Axe");
		this.Set_Class("Neutral");
		this.Set_Rarity("common");
			this.Set_Mana(1);
		this.setAttack(1);
		this.setDurability(3);
	}

	@Override
	public boolean accept(Visitor v, Object taeget, Player attackerP, Player targetP) {
		super.accept(v, taeget, attackerP, targetP);
		v.visitHeavyAxe(this, taeget, attackerP, targetP);
		return true;
		}

}