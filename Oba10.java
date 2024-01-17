// Romina Giane Z. Oba
// BSCPE III - GE
// Program of the MS Paint File menubar layout which incorporates the use of images for the different 
// Menu and MenuItem

import javax.swing.*;
import java.awt.image.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Oba10 extends JFrame{
	
	private JLabel statusbar;
	
	public Oba10()
	{
		setTitle("Untitled - Paint");
		JMenuBar menubar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		
		//adding the menu items 
		JMenuItem fileNew = new JMenuItem("New", resize("new.png"));
		fileNew.setMnemonic(KeyEvent.VK_N); // adds keyboard shortcut function
		fileNew.setToolTipText("Create a new picture."); // adds a text that shows up when the mouse hovers over the menu item
		JMenuItem fileOpen = new JMenuItem("Open", resize("open.png"));
		fileOpen.setMnemonic(KeyEvent.VK_O);
		fileOpen.setToolTipText("Open an existing picture.");
		JMenuItem fileSave = new JMenuItem("Save", resize("save.png"));
		fileSave.setMnemonic(KeyEvent.VK_S); 
		fileSave.setToolTipText("Save the current picture."); 
		
		JMenu fileSaveAs = new JMenu("Save As");
		fileSaveAs.setIcon(resize("saveAs.png")); // adds image to a JMenu
		JMenuItem savePNG = new JMenuItem("PNG picture", resize("savePNG.png"));
		JMenuItem saveJPEG = new JMenuItem("JPEG picture", resize("saveJPEG.png"));
		JMenuItem saveBMP = new JMenuItem("BMP picture", resize("saveBMP.png"));
		JMenuItem saveGIF = new JMenuItem("GIF picture", resize("saveGIF.png"));
		JMenuItem saveOther = new JMenuItem("Other formats", resize("saveOthers.png"));
		//adding the submenu item of Save As
		fileSaveAs.add(savePNG);
		fileSaveAs.add(saveJPEG);
		fileSaveAs.add(saveBMP);
		fileSaveAs.add(saveGIF);
		fileSaveAs.add(saveOther);
		
		JMenu filePrint = new JMenu("Print");
		filePrint.setIcon(resize("print.png")); 
		JMenuItem print = new JMenuItem("Print", resize("print.png"));
		JMenuItem pageSetup = new JMenuItem("Page setup", resize("pageSetup.png"));
		JMenuItem printPreview = new JMenuItem("Print preview", resize("preview.png"));
		//adding the submenu items under Print
		filePrint.add(print);
		filePrint.add(pageSetup);
		filePrint.add(printPreview);
		
		JMenuItem fileScanner = new JMenuItem("From scanner or camera", resize("scanner.png"));
		JMenuItem fileEmail = new JMenuItem("Send in email", resize("email.png"));
		fileEmail.setToolTipText("Send a copy of the picture in an email message as an attachment.");
		
		JMenu fileDeskBG = new JMenu("Set as desktop background");
		fileDeskBG.setIcon(resize("deskbg.png")); 
		JMenuItem fill = new JMenuItem("Fill", resize("fill.png"));
		JMenuItem tile = new JMenuItem("Tile", resize("tile.png"));
		JMenuItem center = new JMenuItem("Center", resize("center.png"));
		//submenu items of Desktop Background
		fileDeskBG.add(fill);
		fileDeskBG.add(tile);
		fileDeskBG.add(center);
		
		JMenuItem fileProperties = new JMenuItem("Properties", resize("properties.png"));
		fileNew.setMnemonic(KeyEvent.VK_E);
		fileNew.setToolTipText("Change the properties of the picture.");
		JMenuItem fileAbout = new JMenuItem("About Paint", resize("about.png"));
		JMenuItem fileExit = new JMenuItem("Exit", resize("exit.png"));
		
		//adds a text area with scroll
		JScrollPane scroll = new JScrollPane();
        getContentPane().add(scroll);
        
		JTextArea notepad = new JTextArea();
		scroll.setViewportView(notepad);
	
		//adding the submenu items under the menu File
		file.add(fileNew);
		file.add(fileOpen);
		file.add(fileSave);
		file.add(fileSaveAs);
		file.addSeparator();
		file.add(filePrint);
		file.add(fileScanner);
		file.add(fileEmail);
		file.addSeparator();
		file.add(fileDeskBG);
		file.addSeparator();
		file.add(fileProperties);
		file.addSeparator();
		file.add(fileAbout);
		file.addSeparator();
		file.add(fileExit);
		file.addSeparator();
		
		//adding the other menu options
		JMenu home = new JMenu("Home");
		JMenu view = new JMenu("View");
		
		//adding the menu to the menubar
		menubar.add(file);
		menubar.add(home);
		menubar.add(view);
		
		setJMenuBar(menubar);
        statusbar = new JLabel(" Statusbar");
        statusbar.setBorder(BorderFactory.createEtchedBorder());
        add(statusbar, BorderLayout.SOUTH);
        setSize(720, 520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
	
    public static void main(String[] args) {
        new Oba10(); 
	}
    
    //method that resizes the image icons into 32x32 to make them uniform
    public static ImageIcon resize(String fileName) {
    	ImageIcon newIcon = new ImageIcon(fileName);
		Image img = newIcon.getImage();
		Image newimg = img.getScaledInstance(32, 32,  java.awt.Image.SCALE_SMOOTH);
		newIcon = new ImageIcon(newimg);
		return newIcon;
    	
    }
}
