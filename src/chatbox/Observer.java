/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbox;

/**
 * @author BELFADEL Wafa,BOUAYADI Khadidja Nour el houda,BOUFELDJA Adiba
 */

public class Observer {
	private Frame frame;

	public Observer(Frame frame) {
		
		this.frame = frame;
	}
	public void message(String str){
		frame.addTxt(str);
	}
        public void writing(boolean v)
        {
            frame.setVLabel(v);
        }
	
	
}
