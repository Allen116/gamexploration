package games.entrance;

import games.ai.AI;
import games.ai.Lv1RandomMoveAI;
import games.ai.Lv2StrategyMoveAI;
import games.model.*;


/**
 * Created by wangdehao on 18/1/15.
 */
public class Gmain {

    public static void main(String[] args) throws InterruptedException {
        Config config = new Config();

        AI aiA = new Lv1RandomMoveAI(config.getSleepTimeForSingleStep(), 0);
        Player playerA = new Player("A");
//        playerA.setAI(aiA);

        AI aiB = new Lv1RandomMoveAI(config.getSleepTimeForSingleStep(), 2);
        Player playerB = new Player("B", aiB);

        AI aiC = new Lv2StrategyMoveAI(config.getSleepTimeForSingleStep(), 1, 0.5, 1);
        Player playerC = new Player("C", aiC);

        AI aiD = new Lv2StrategyMoveAI(config.getSleepTimeForSingleStep(), 1, 0.5, 2);
        Player playerD = new Player("D", aiD);

        Series.playSeries(playerC, playerD, config);
    }
}
