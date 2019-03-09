/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbox;


/**
 * @author BELFADEL Wafa,BOUAYADI Khadidja Nour el houda,BOUFELDJA Adiba
 */
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author user
 *
 */
public class ChatBox {
//contains main 
	private ArrayList<Observer> observers;
	ChatBox(){
		observers=new ArrayList<>();
	}
	public void sendMessage(String str){
		for (Observer observer : observers) {
			observer.message(str);
		}
	}
        
	public void attach(Observer o){
		observers.add(o);
	}
        public void writing(boolean v){
            for (Observer observer : observers) {
			observer.writing(v);
		}
        }
	
}