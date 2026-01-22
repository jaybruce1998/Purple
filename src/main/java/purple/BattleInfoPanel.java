package purple;

import javax.swing.*;
import java.awt.*;

public class BattleInfoPanel extends JPanel {

    private final BattlerPanel playerPanel = new BattlerPanel();
    private final BattlerPanel wildPanel = new BattlerPanel();

    public BattleInfoPanel() {
        setLayout(new GridLayout(1, 2, 10, 0));
        setBackground(Color.BLACK);

        add(playerPanel);
        add(wildPanel);
    }

    public void update(Battler player, Battler wild) {
        playerPanel.updateBattler(player);
        wildPanel.updateBattler(wild);
    }
}
