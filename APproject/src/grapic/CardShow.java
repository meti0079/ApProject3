package grapic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Cardspackage.Cards;

public class CardShow extends JPanel  {

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private Cards card;
	public CardShow(Cards card) {
		this.card=card;
		initial();
		readImage();
		if(card.getType().equalsIgnoreCase("minion")) {
			setAtackLable(card);
			setHpLable(card);		
		}else if(card.getType().equalsIgnoreCase("weapon")) {
			setAtackLable1(card);
			setDuribalityLable(card);
		}
		manaLable();			
	}
	private void manaLable() {
		JLabel manaJLabel=new JLabel(card.get_Mana()+"");	
		manaJLabel.setBounds(9, 8, 20, 20);
		manaJLabel.setForeground(Color.WHITE);
		manaJLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(manaJLabel);
	}
	private void readImage() {
		File input_file = new File("src\\play image\\"+card.get_Name()+".png"); 
		image = new BufferedImage(100, 150, BufferedImage.TYPE_INT_ARGB);
		try {image = ImageIO.read(input_file);
		} catch (IOException e) {e.printStackTrace();}
	}
	private void initial() {
		setPreferredSize(new Dimension(100, 150));
		setSize(new Dimension(100, 150));
		setLayout(null);
		setBackground(new Color(0, 0, 0, 0));
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0,this.getWidth(), this.getHeight(),null);
	}
	private void setAtackLable(Cards x) {
		JLabel attackJLabel=new JLabel(x.getAttack()+"");
		attackJLabel.setBounds(10, 121, 20, 20);
		attackJLabel.setForeground(Color.WHITE);
		attackJLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(attackJLabel);
	}
	private void setHpLable(Cards x) {
		JLabel hpJLabel=new JLabel(x.getHp()+"");
		hpJLabel.setBounds((this.getWidth()*4)/5, 126, 20, 20);
		hpJLabel.setForeground(Color.WHITE);
		hpJLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(hpJLabel);

	}
	private void setAtackLable1(Cards x) {
		JLabel attackJLabel=new JLabel(x.getAttack()+"");
		attackJLabel.setBounds(10, 121, 20, 20);
		attackJLabel.setForeground(Color.WHITE);
		attackJLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(attackJLabel);
	}
	private void setDuribalityLable(Cards x) {
		JLabel hpJLabel=new JLabel(x.getHp()+"");
		hpJLabel.setBounds(81, 126, 20, 20);
		hpJLabel.setForeground(Color.WHITE);
		hpJLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(hpJLabel);
	}
}
