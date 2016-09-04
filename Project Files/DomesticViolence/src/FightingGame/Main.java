

package FightingGame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {
    public static void main(String []args){
        //Create game window
        AppGameContainer appGc;

        //Attempt to run the code
        try{ 
            //Creates a window that holds the class Game
            appGc = new AppGameContainer(new Game("Domestic Violence!"));
            //Sets display mode; paremeters(width, length, fullscreen)
            appGc.setDisplayMode(1600, 900, false);
            //Initiates screen
            appGc.start();

        //Catch if error
        }catch(SlickException error){
            //Prints error
            error.printStackTrace();
        }
        
    }
    
}
