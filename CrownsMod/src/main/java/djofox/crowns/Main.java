package djofox.crowns;

import org.apache.logging.log4j.LogManager;

import djofox.crowns.init.ItemInit;
import djofox.crowns.potion.PotionList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
	public static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "crowns";
	public static final ItemGroup CROWNS_GROUP  = new CrownsTab("crownsTab");
	
	public Main() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		
		ItemInit.ITEMS.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
		PotionList.EFFECTS.register(bus);
		PotionList.POTIONS.register(bus);
	}
	private void setup(final FMLClientSetupEvent event) {
	}
	
	public static class CrownsTab extends ItemGroup {

		public CrownsTab(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.NETHERITE_CROWN.get().getDefaultInstance();
		}
		
	}
	
	
}
