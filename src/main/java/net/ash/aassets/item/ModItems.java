package net.ash.aassets.item;

import net.ash.aassets.aassets;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(aassets.MODID);

    public static final DeferredItem<Item> FEDSWORD = ITEMS.register("federation_sword_item",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EYE = ITEMS.register("federation_eye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMINGSOON = ITEMS.register("comingsoon",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> FEDERATION_SWORD = ITEMS.register("federation_sword",
            () -> new SwordItem(ModToolTiers.FEDERATION, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.FEDERATION, 659, 6f))));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
