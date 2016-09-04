/*
 * Project created by Jarone Jabonillo.
 */
package FightingGame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*; //imports all slick libraries
import org.newdawn.slick.state.*; //imports state/scene libraries

//Inherits the basic game state class
public class Menu extends BasicGameState{
    
    //Image var for title bg, start button, and exit button
    private Image gTitle, bStart, bExit;
    //Constants for button dimensions
    private final int bWidth = 200;
    private final int bHeight = 50;
    
    
    //Constructor
    public Menu(int state){
    
    
    }
    
    //Initializes window; parameters(GameContainer, StateBasedGame)
    public void init(GameContainer gc, StateBasedGame stGame) throws SlickException{
        //Load title image
        gTitle = new Image("res/images/Title.png");
        //Load start image 0
        bStart = new Image("res/images/button_Start0.png");
        //Load exit image 0
        bExit = new Image("res/images/button_Exit0.png");
    }
    
    //Draws objects on screen
    public void render(GameContainer gc, StateBasedGame stGame, Graphics g) throws SlickException{
        //Draw title background
        gTitle.draw(0,0);
        //Draw start button
        bStart.draw(725,650);
        //Draw exit button
        bExit.draw(725,720);
        
    }
    
    //Updates images on screen
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        int posX = Mouse.getX();
        int posY = Mouse.getY();
        
        if((posX > 725 && posX < 925) && (posY < 250 && posY > 200)){
            
            bStart = new Image("res/images/button_Start1.png");
            
            if(Mouse.isButtonDown(0)){
                sbg.enterState(1);
            }
        }
        else{
            bStart = new Image("res/images/button_Start0.png");
  
        }
        
        if((posX > 725 && posX < 925) && (posY < 180 && posY > 130)){
            
            bExit = new Image("res/images/button_Exit1.png");
            
            if(Mouse.isButtonDown(0)){
                System.exit(0);
            }
        }
        else{
            bExit = new Image("res/images/button_Exit0.png");
        }
       
    }
    
    //Returns the Id of the state
    public int getID(){
        return 0;
    }
}
