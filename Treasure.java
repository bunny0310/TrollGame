/*
 *  Represents an "empty" game piece. It's type is "Empty" and show is a space character.
 */
 public class Treasure extends GamePiece {
	  
   public Treasure() {
       super();
   }
   public Treasure(int x) {
       super(x);
   }  
   
   public String getType(){
      return "Treasure";
   } 
   
   public String show(){
	 return "$";
   } 
}