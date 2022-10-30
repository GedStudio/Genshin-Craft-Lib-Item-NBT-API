package net.deechael.genshin.lib.open.nbt.injector;

import net.deechael.genshin.lib.open.nbt.NBTCompound;

/**
 * This interface gets placed on Tiles and Entities
 * 
 * @author tr7zw
 *
 */
public interface INBTWrapper {

	/**
	 * @return The custom NBT compound inside this Object
	 */
	NBTCompound getNbtData();

}
