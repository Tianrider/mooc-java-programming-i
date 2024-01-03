/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**                                                 a
 *
 * @author Christian
 */
import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> list = new ArrayList<>();
    
    public void add(Message message){
        if(message.getContent().length() <= 280){
            this.list.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.list;
    }
}                                                                                   
