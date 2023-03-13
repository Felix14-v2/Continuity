package me.pepperbell.continuity.client.mixin;

import java.util.Map;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import me.pepperbell.continuity.client.mixinterface.SpriteAtlasTextureDataExtension;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.util.Identifier;

@Mixin(SpriteAtlasTexture.Data.class)
public class SpriteAtlasTextureDataMixin implements SpriteAtlasTextureDataExtension {
	@Unique
	private Map<Identifier, Identifier> continuity$emissiveIdMap;

	@Override
	@Nullable
	public Map<Identifier, Identifier> continuity$getEmissiveIdMap() {
		return continuity$emissiveIdMap;
	}

	@Override
	public void continuity$setEmissiveIdMap(Map<Identifier, Identifier> map) {
		continuity$emissiveIdMap = map;
	}
}
