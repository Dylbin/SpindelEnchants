package me.spindel.enchantsplugin.enchants.swords;

import org.bukkit.event.entity.EntityDamageByEntityEvent;

import me.jereds.txenchants.api.AttackEnchant;
import me.jereds.txenchants.enums.EnchantTier;
import me.jereds.txenchants.enums.EnchantType;

public class DumbGabe extends AttackEnchant {

	//String id, String displayName, EnchantType type, EnchantTier tier, int maxLevel, int[] chances
	public DumbGabe() {
		super("dumb-gabe", "Mean Gabriel",  EnchantType.SWORD , EnchantTier.ASCENDANT, 50);
	}

	@Override
	public void runEnchantLogic(EntityDamageByEntityEvent event) {
		getAttacker().damage(5);
	}


}
//camelCase <- methods, variables, etc
//PascalCase <- class names