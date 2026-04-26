package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
    private MenuExampleView menuExampleView;
    
	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		//Ví dụ về đoạn code trên: 
		/*
		 *Khi bạn click: JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		 *Thì:  e.getActionCommand() = "Welcome" 
		 *=> action = "Welcome"
		 */
		
		
		System.out.println("Clicked: "+ action);
	
		if(action.equals("Exit")) { //Nếu là Exit -> thoát chương trình
			System.exit(0);
		}else { // Còn lại: New, Open, Welcome, Undo, Redo, .... vv 
			this.menuExampleView.setTextJLabel("Bạn đã click: "+ action);
		}
	}
}
