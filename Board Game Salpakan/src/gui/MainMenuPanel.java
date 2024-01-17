package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Main menu JPanel that displays game main menu.
public class MainMenuPanel extends JPanel {

  // Background image directory 
  private final static String BG_DIR_PATH = "art/bg/";

  // Main menu options buttons 
  private final JLabel start, howToPlay, quit, credits, load;
  // Background image 
  private BufferedImage backgroundImage;
  private BufferedImage gametitle;
  
  
  // Main menu JButton size 
  private final Dimension GAME_TITLE = new Dimension(5,2);
  private final Dimension MAIN_MENU_BUTTON_SIZE = new Dimension(250, 50);
  
  
  // Main menu JButton font 
  private final Font MAIN_MENU_FONT = new Font("Ebrima", Font.BOLD, 26);

  // No argument constructor that creates the main menu JPanel.
  public MainMenuPanel() {
	  
	  try {
	      backgroundImage = ImageIO.read(new File(BG_DIR_PATH + "background.png"));
	    } catch (final IOException e) {
	      e.printStackTrace();
	    } 
	
	//Panel for Game title
	JPanel titlePanel = new JPanel(new FlowLayout());
	titlePanel.setPreferredSize(new Dimension(730,140));
	titlePanel.setBackground(new Color(0,0,0,0));
	
	JLabel title = new JLabel();
	title.setIcon(new ImageIcon(BG_DIR_PATH + "title.png"));
	Dimension size = title.getPreferredSize();
	titlePanel.add(title);
	
	
    this.setLayout(new GridBagLayout());
    this.setVisible(true);
    this.add(titlePanel);

    final GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(1, 1, 1, 1);


    // Add main menu buttons
    start = new JLabel();
	start.setIcon(new ImageIcon(BG_DIR_PATH + "start_initial.png"));
	Dimension start_size = start.getPreferredSize();
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    this.add(start, gbc);
    
    load = new JLabel();
	load.setIcon(new ImageIcon(BG_DIR_PATH + "loadgame_initial.png"));
	Dimension load_size = load.getPreferredSize();
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    this.add(load, gbc);
    
    howToPlay = new JLabel();
	howToPlay.setIcon(new ImageIcon(BG_DIR_PATH + "instructions_initial.png"));
	Dimension instructions_size = howToPlay.getPreferredSize();
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    this.add(howToPlay, gbc);
    
    credits = new JLabel();
	credits.setIcon(new ImageIcon(BG_DIR_PATH + "credits_initial.png"));
	Dimension credits_size = credits.getPreferredSize();
    gbc.gridx = 0;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    this.add(credits, gbc);
    
    quit = new JLabel();
	quit.setIcon(new ImageIcon(BG_DIR_PATH + "exit_initial.png"));
	Dimension quit_size = quit.getPreferredSize();
    gbc.gridx = 0;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    this.add(quit, gbc);

  }
  
  //Paints main menu JPanel background with image.
	  @Override
	  protected void paintComponent(final Graphics g) {
	    super.paintComponent(g);
	    g.drawImage(backgroundImage, 0, 0, null);
	  }

  // Gets the main menu start button.
  public JLabel getStartBtn() {
    return this.start;
  }

  // Gets the main menu load button.
  public JLabel getLoadBtn() {
    return this.load;
  }

  // Gets the main menu how to play button.
  public JLabel getHowToPlayBtn() {
    return this.howToPlay;
  }

  // Gets the main menu quit button.
  public JLabel getQuitBtn() {
    return this.quit;
  }

  //Gets the main menu quit button.
  public JLabel getCreditsBtn() {
	return this.credits;
  }
} 
