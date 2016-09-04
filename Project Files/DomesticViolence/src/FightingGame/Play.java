/*
 * Project created by Jarone Jabonillo.
 */
package FightingGame;

import org.newdawn.slick.*; //imports slick libraries
import org.newdawn.slick.state.*; //imports state/scene libraries

//Inherits basic game state class
public class Play extends BasicGameState{
    
    private Image house1;
    
    //Constructor
    public Play(int state){
    
    }
    
    //Initializes window; parameters(Game container, State based game)
    public void init(GameContainer gc, StateBasedGame stGame) throws SlickException{
        house1 = new Image("res/images/House1.png");
    }
    
    //Draws objects on screen; parameters (Game container, state based game, graphics)
    public void render(GameContainer gc, StateBasedGame stGame, Graphics g) throws SlickException{
        house1.draw(0,0);
    }
    
    //Updates screen(game container, statebased game, )
    public void update(GameContainer gc, StateBasedGame stGame, int delta)throws SlickException{
    
    }
    
    //Returns id for state
    public int getID(){
        return 1;
    }
    
    
}
