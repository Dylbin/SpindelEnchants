package me.spindel.enchantsplugin.enchants.swords;

import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.jereds.txenchants.api.AttackEnchant;
import me.jereds.txenchants.enums.EnchantTier;
import me.jereds.txenchants.enums.EnchantType;

public class Penis extends AttackEnchant {
	
//	void main() {
//		//everything inside of here is inside the method, it gets ran when the method is ran.
//		System.out.println("print something");
//		boolean x = false;
//		if(x) {
//			//everything inside here only gets ran if x = true. if x were false, this code wouldnt be ran,
//			//but the rest of the method would continue.
//			
//			System.out.println(x);
//		}
//		
//		System.out.println("penis");
//		
//	}

	public Penis() {
		super("penis", "Penis", EnchantType.SWORD, EnchantTier.LEGENDARY, 3, 10, 10, 10);
	}

	@Override
	public void runEnchantLogic(EntityDamageByEntityEvent event) {
		getVictim().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 2));
	}
}
