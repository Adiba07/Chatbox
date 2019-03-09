/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbox;

import java.awt.*;

/**
 * @author BELFADEL Wafa,BOUAYADI Khadidja Nour el houda,BOUFELDJA Adiba
 */
public class Main {

	public static void main(String[] args) {
            
                
		ChatBox c=new ChatBox();
                
		Frame frame1=new Frame(c,"client1");
		Frame frame2=new Frame(c,"client2");
                
                
                frame1.setLocation(50,200);
                 frame2.setLocation(500,200);
                  
    //pour que si un client ferme sa discussion il n'est pas obligé que tous les client ferment ses discussions  
		frame1.setDefaultCloseOperation(2);
		frame2.setDefaultCloseOperation(2);
                
                Observer ob1=new Observer(frame1);
		Observer ob2=new Observer(frame2);
               
		c.attach(ob1);
		c.attach(ob2);
		 
		frame1.setVisible(true);
		frame2.setVisible(true);
               
	}

}
