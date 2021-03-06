package com.salhack.summit.events.blocks;

import com.salhack.summit.events.MinecraftEvent;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;

public class EventBlockGetRenderLayer extends MinecraftEvent
{
    private BlockRenderLayer _layer;
    private Block _block;
    
    public EventBlockGetRenderLayer(Block block)
    {
        _block = block;
    }
    
    public Block getBlock()
    {
        return _block;
    }
    
    public void setLayer(BlockRenderLayer layer)
    {
        _layer = layer;
    }

    public BlockRenderLayer getBlockRenderLayer()
    {
        return _layer;
    }

}
