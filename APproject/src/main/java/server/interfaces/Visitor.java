package server.interfaces;

import java.util.ArrayList;

import server.cardspackage.Card;
import server.cardspackage.Minions.BigGameHunter;
import server.cardspackage.Minions.BluegillWarrior;
import server.cardspackage.Minions.ChillwindYeti;
import server.cardspackage.Minions.CurioCollector;
import server.cardspackage.Minions.Dreadscale;
import server.cardspackage.Minions.Gruul;
import server.cardspackage.Minions.HighPriestAmet;
import server.cardspackage.Minions.KronxDragonhoof;
import server.cardspackage.Minions.LeperGnome;
import server.cardspackage.Minions.Locust;
import server.cardspackage.Minions.MurlocRaider;
import server.cardspackage.Minions.MurlocWarleader;
import server.cardspackage.Minions.OasisSnapjaw;
import server.cardspackage.Minions.Sandbinder;
import server.cardspackage.Minions.Sathrovarr;
import server.cardspackage.Minions.SeaGiant;
import server.cardspackage.Minions.SecurityRover;
import server.cardspackage.Minions.Sheep;
import server.cardspackage.Minions.Shieldbearer;
import server.cardspackage.Minions.SleepyDragon;
import server.cardspackage.Minions.SwampKingDred;
import server.cardspackage.Minions.TheBlackKnight;
import server.cardspackage.Minions.TombWarden;
import server.cardspackage.Minions.WaxElemental;
import server.cardspackage.Spells.ArcaneShot;
import server.cardspackage.Spells.AstralRift;
import server.cardspackage.Spells.Backstab;
import server.cardspackage.Spells.BookofSpecters;
import server.cardspackage.Spells.FriendlySmith;
import server.cardspackage.Spells.HolySmite;
import server.cardspackage.Spells.LearnDraconic;
import server.cardspackage.Spells.PharaohBlessing;
import server.cardspackage.Spells.Polymorph;
import server.cardspackage.Spells.Sprint;
import server.cardspackage.Spells.StrengthinNumbers;
import server.cardspackage.Spells.Swarmoflocusts;
import server.cardspackage.Spells.gift;
import server.cardspackage.Weapons.BattleAxe;
import server.cardspackage.Weapons.BloodFury;
import server.cardspackage.Weapons.HeavyAxe;
import server.hero.Heros;
import server.playModel.PlayerModel;

public interface Visitor {

		public void visitArcaneShot	(ArcaneShot m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitAstralRift(AstralRift m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitBackstab(Backstab m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitBattleAxe(BattleAxe m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitBigGameHunter(BigGameHunter m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitBloodFury(BloodFury m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitBluegillWarrior(BluegillWarrior m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitBookofSpecters(BookofSpecters m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitChillwindYeti(ChillwindYeti m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitCurioCollector(CurioCollector m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitDreadscale(Dreadscale m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitFriendlySmith(FriendlySmith m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitgift(gift m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitGruul(Gruul m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitHeavyAxe(HeavyAxe m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitHighPriestAmet(HighPriestAmet m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitHolySmite(HolySmite m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitKronxDragonhoof(KronxDragonhoof m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitLearnDraconic(LearnDraconic m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitLeperGnome(LeperGnome m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitMurlocWarleader(MurlocWarleader m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitMurlocRaider(MurlocRaider m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitOasisSnapjaw(OasisSnapjaw m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitPharaohBlessing(PharaohBlessing m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitPolymorph(Polymorph m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitSandbinder(Sandbinder m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitSathrovarr(Sathrovarr m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitSeaGiant(SeaGiant m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitSecurityRover(SecurityRover m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitShieldbearer(Shieldbearer m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitSprint(Sprint m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitStrengthinNumbers(StrengthinNumbers m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitSwampKingDred(SwampKingDred m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitSwarmoflocusts(Swarmoflocusts m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitTheBlackKnight(TheBlackKnight m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
		public void visitTombWarden(TombWarden m, Object taeget, PlayerModel attackerP, PlayerModel targetP);	
		public void visitLocust(Locust m, Object taeget, PlayerModel attackerP, PlayerModel targetP);	
		public void visitSheep(Sheep m, Object taeget, PlayerModel attackerP, PlayerModel targetP);	
		public void visitWaxElemental(WaxElemental m, Object taeget, PlayerModel attackerP, PlayerModel targetP);	
		public void visitSleepyDragon(SleepyDragon m, Object taeget, PlayerModel attackerP, PlayerModel targetP);
}