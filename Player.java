/*
 *  Represents an "empty" game piece. It's type is "Empty" and show is a space character.
 */
 public class Player extends GamePiece {
	  
   public Player() {
       super();
   } 
   public Player(int x) {
       super(x);
   } 
   public String getType(){
      return "Player";
   } 
   
   public String show(){
	 return "P";
   } 
}