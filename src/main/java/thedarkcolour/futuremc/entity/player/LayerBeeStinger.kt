package thedarkcolour.futuremc.entity.player

import net.minecraft.client.renderer.entity.layers.LayerRenderer
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.ResourceLocation

class LayerBeeStinger : LayerRenderer<EntityPlayer> {
    override fun shouldCombineTextures(): Boolean {
        TODO("not implemented")
    }

    override fun doRenderLayer(
        entitylivingbaseIn: EntityPlayer,
        limbSwing: Float,
        limbSwingAmount: Float,
        partialTicks: Float,
        ageInTicks: Float,
        netHeadYaw: Float,
        headPitch: Float,
        scale: Float
    ) {
        TODO("not implemented")
    }

    companion object {
        private val TEXTURE = ResourceLocation("textures/entity/bee/stinger.png")
    }
}