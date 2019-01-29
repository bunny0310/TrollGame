/*
 *  Represents an "empty" game piece. It's type is "Empty" and show is a space character.
 */
 public class Troll extends GamePiece {
	  
   public Troll() {
       super();
   } 
   
   public String getType(){
      return "Troll";
   } 
   
   public String show(){
	 return "T";
   } 
}