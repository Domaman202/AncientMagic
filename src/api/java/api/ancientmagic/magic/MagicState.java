package api.ancientmagic.magic;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public interface MagicState {
    IMagicType getMagicType();
    int maxMana();
    void stateFunction(Level level, Player player, InteractionHand hand);
}
