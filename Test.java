package test;

import javax.swing.UIManager;

import view.MenuExampleView;

public class Test {
	public static void main(String[] args) {
		 try {
			        //Xét Giao Diện trước
			        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
			        //Sau đó mới Tạo UI
			    	new MenuExampleView();
			    } catch (Exception ex) {
			        ex.printStackTrace(); // Nếu set giao diện lỗi, in lỗi ra bảng điều khiển
			    }
		    }
	}
