package net.deechael.genshin.lib.open.nbt.utils.annotations;

import net.deechael.genshin.lib.open.nbt.utils.MinecraftVersion;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({METHOD})
public @interface AvailableSince {

    MinecraftVersion version();

}