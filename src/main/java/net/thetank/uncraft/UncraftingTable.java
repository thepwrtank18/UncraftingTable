import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UncraftingTable extends Block {

    public UncraftingTable(final Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(final BlockState state, final World world, final BlockPos pos, final PlayerEntity player,
            final Hand hand, final BlockHitResult hit) {
        if (!world.isClient) {
        }
 
        return ActionResult.SUCCESS;
    }
}