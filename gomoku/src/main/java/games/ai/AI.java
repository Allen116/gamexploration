package games.ai;


import games.model.Game;
import games.model.Location;
import games.model.Player;

/**
 * Created by wangdehao on 18/1/16.
 */
public class AI {
    public int playId = 0;
    public int sleepTime = 500;

    public Location getLocationBasedOnBoard(Game game, Player movePlayer) throws InterruptedException {
        return new Location(0,0);
    }
}
