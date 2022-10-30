package net.deechael.genshin.lib.open.nbt;

import de.tr7zw.annotations.FAUtil;
import net.deechael.genshin.lib.open.nbt.utils.MinecraftVersion;
import net.deechael.genshin.lib.open.nbt.utils.annotations.AvailableSince;
import net.deechael.genshin.lib.open.nbt.utils.annotations.CheckUtil;
import org.bukkit.Chunk;

public class NBTChunk {

    private final Chunk chunk;

    public NBTChunk(Chunk chunk) {
        this.chunk = chunk;
    }

    /**
     * Gets the NBTCompound used by spigots PersistentDataAPI. This method is only
     * available for 1.16.4+!
     *
     * @return NBTCompound containing the data of the PersistentDataAPI
     */
    @AvailableSince(version = MinecraftVersion.MC1_16_R3)
    public NBTCompound getPersistentDataContainer() {
        FAUtil.check(this::getPersistentDataContainer, CheckUtil::isAvaliable);
        return new NBTPersistentDataContainer(chunk.getPersistentDataContainer());
    }

}
