/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Message {
    String msgId;
    int msgNumber;
    String msgTo;
    String TextTT;
    String myHash;
    static int total = 0;

    public Message(int num, String to, String text){
        msgNumber = num;
        msgTo = to;
        TextTT = text;
        msgId = makeId();
        myHash = makeHash();
    }

    public String makeId(){
        String id = "";
        for(int i=0; i<10; i++){
            int r = (int)(Math.random()*10);
            id = id + r;
        }
        return id;
    }

    public boolean checkMessageID(){
        return msgId.length() == 10;
    }

    public String checkRecipientCell(){
        if(msgTo.startsWith("+") && msgTo.length() <= 13){
            return "Cell phone number successfully captured.";
        }
        return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
    }

    public String checkMessage(){
        if(TextTT.length() <= 250){
            return "Message ready to send.";
        } else {
            int extra = TextTT.length() - 250;
            return "Message exceeds 250 characters by " + extra + ", please reduce the size.";
        }
    }

    public String makeHash(){
        String[] words = TextTT.split(" ");
        String first = words[0];
        String last = words[words.length - 1];
        last = last.replace("?", "").replace("!", "").replace(",", "").replace(".", "");
        String hash = msgId.substring(0,2) + ":" + msgNumber + ":" + first + last;
        return hash.toUpperCase();
    }

    public String createMessageHash(){
        return myHash;
    }

    public String SentMessage(int choice){
        if(choice == 1){
            total++;
            return "Message successfully sent.";
        }
        if(choice == 2){
            return "Press 0 to delete the message.";
        }
        return "Message successfully stored.";
    }

    public String printMessages(){
        return TextTT;
    }

    public int returnTotalMessagess(){
        return total;
    }

    public void showFull(){
        System.out.println("Message ID: " + msgId);
        System.out.println("Message Hash: " + myHash);
        System.out.println("Recipient: " + msgTo);
        System.out.println("Message: " + TextTT);
    }

    public void storeMessage(){
        try{
            java.io.FileWriter f = new java.io.FileWriter("storedMessages.json", true);
            f.write("{\"ID\":\"" + msgId + "\", \"Hash\":\"" + myHash + "\", \"To\":\"" + msgTo + "\", \"Message\":\"" + TextTT + "\"}\n");
            f.close();
        } catch(Exception e){
            System.out.println("Error saving");
        }
    }
}

    
   
    

    
    
    

