package io.github.slimefunguguproject.bump.implementation;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import io.github.slimefunguguproject.bump.api.items.LocalizedItemStack;
import io.github.slimefunguguproject.bump.implementation.items.machines.AppraisalInstrument;
import io.github.slimefunguguproject.bump.implementation.items.machines.AttributeGrindstone;
import io.github.slimefunguguproject.bump.implementation.items.tools.QualityIdentifier;
import io.github.slimefunguguproject.bump.utils.AppraiseUtils;
import io.github.slimefunguguproject.bump.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

import lombok.experimental.UtilityClass;

/**
 * This class holds all {@link SlimefunItemStack} of Bump.
 *
 * @author ybw0014
 */
@UtilityClass
public final class BumpItems {
    public static final SlimefunItemStack RANDOM_HELMET;
    public static final SlimefunItemStack RANDOM_HORSE_ARMOR;
    public static final SlimefunItemStack XUEBI;
    public static final SlimefunItemStack KELE;
    public static final SlimefunItemStack FANGBIANMIAN;
    public static final SlimefunItemStack LATIAO;
    public static final SlimefunItemStack KOUXIANGTANG;
    public static final SlimefunItemStack ZONGZI;
    public static final SlimefunItemStack APPRAISAL;
    public static final SlimefunItemStack ATTRIBUTE_GRINDSTONE;
    public static final SlimefunItemStack SUN_ENERGY;
    public static final SlimefunItemStack MECHA_GEAR;
    public static final SlimefunItemStack OLD_COIN;
    public static final SlimefunItemStack MAKE;
    public static final SlimefunItemStack OLD_CPU;
    public static final SlimefunItemStack CPU;
    public static final SlimefunItemStack SOUL_PAPER;
    public static final SlimefunItemStack KSF_STUFF;
    public static final SlimefunItemStack WATER_SUGAR;
    public static final SlimefunItemStack PEACH_WOOD;
    public static final SlimefunItemStack UPDATE_POWER;
    public static final SlimefunItemStack COMPRESSED_RANDOM_EQUIPMENT;
    public static final SlimefunItemStack GETGOLD_SPADE;
    public static final SlimefunItemStack QUALITY_IDENTIFIER;
    public static final SlimefunItemStack APPRAISAL_PAPER_ARMOR;
    public static final SlimefunItemStack APPRAISAL_PAPER_DAMAGE;
    public static final SlimefunItemStack APPRAISAL_PAPER_HORSE_ARMOR;
    public static final SlimefunItemStack LIGHT_BOW;
    public static final SlimefunItemStack WITHERSKULL_BOW;
    public static final SlimefunItemStack EMER_SWORD;
    public static final SlimefunItemStack BONE_SWORD;
    public static final SlimefunItemStack RANDOM_SWORD;
    public static final SlimefunItemStack GUARD_SWORD;
    public static final SlimefunItemStack PEACH_SWORD;
    public static final SlimefunItemStack SOUL_SWORD;
    public static final SlimefunItemStack SKY_SWORD;
    public static final SlimefunItemStack DEVIL_SWORD;
    public static final SlimefunItemStack SKY_DEVIL_SWORD;

    static {
        // region armor
        RANDOM_HELMET = new LocalizedItemStack(
            "RANDOM_HELMET",
            Material.DIAMOND_HELMET
        );

        RANDOM_HORSE_ARMOR = new LocalizedItemStack(
            "RANDOM_HORSE_ARMOR",
            Material.DIAMOND_HORSE_ARMOR
        );

        AppraiseUtils.setAppraisable(RANDOM_HELMET);
        AppraiseUtils.setAppraisable(RANDOM_HORSE_ARMOR);
        // endregion armor

        // region food
        XUEBI = new LocalizedItemStack(
            "XUEBI",
            Material.POTION
        );

        KELE = new LocalizedItemStack(
            "KELE",
            Material.POTION
        );

        FANGBIANMIAN = new LocalizedItemStack(
            "FANGBIANMIAN",
            Material.STRING
        );

        LATIAO = new LocalizedItemStack(
            "LATIAO",
            Material.ROTTEN_FLESH
        );

        KOUXIANGTANG = new LocalizedItemStack(
            "KOUXIANGTANG",
            Material.SUGAR
        );

        ZONGZI = new LocalizedItemStack(
            "ZONGZI",
            Material.GREEN_DYE
        );

        Utils.glowItem(XUEBI);
        // endregion food

        // region machine
        APPRAISAL = new LocalizedItemStack(
            "APPRAISAL",
            Material.BELL,
            LoreBuilder.power(AppraisalInstrument.ENERGY_CONSUMPTION, " " + Bump.getLocalization().getString("lores.per-use"))
        );

        ATTRIBUTE_GRINDSTONE = new LocalizedItemStack(
            "ATTRIBUTE_GRINDSTONE",
            Material.GRINDSTONE,
            LoreBuilder.power(AttributeGrindstone.ENERGY_CONSUMPTION, " " + Bump.getLocalization().getString("lores.per-use"))
        );
        // endregion machine

        // region stuff
        SUN_ENERGY = new LocalizedItemStack(
            "SUN_ENERGY",
            Material.BELL
        );

        MECHA_GEAR = new LocalizedItemStack(
            "MECHA_GEAR",
            Material.ENDER_PEARL
        );

        OLD_COIN = new LocalizedItemStack(
            "OLD_COIN",
            Material.GOLD_NUGGET
        );

        MAKE = new LocalizedItemStack(
            "MAKE",
            Material.DIAMOND
        );

        OLD_CPU = new LocalizedItemStack(
            "OLD_CPU",
            Material.PRISMARINE_CRYSTALS
        );

        CPU = new LocalizedItemStack(
            "CPU",
            Material.DIAMOND
        );

        SOUL_PAPER = new LocalizedItemStack(
            "SOUL_PAPER",
            Material.PAPER
        );

        KSF_STUFF = new LocalizedItemStack(
            "KSF_STUFF",
            Material.BEETROOT_SEEDS
        );

        WATER_SUGAR = new LocalizedItemStack(
            "WATER_SUGAR",
            Material.SUGAR
        );

        PEACH_WOOD = new LocalizedItemStack(
            "PEACH_WOOD",
            Material.STICK
        );

        UPDATE_POWER = new LocalizedItemStack(
            "UPDATE_POWER",
            Material.ZOMBIE_HEAD
        );

        COMPRESSED_RANDOM_EQUIPMENT = new LocalizedItemStack(
            "COMPRESSED_RANDOM_EQUIPMENT",
            "bb82d5e2033ce8d9821d53e59d480f3dd60b4f9e555f67056c938c0240e16ffe"
        );
        // endregion stuff

        // region tool
        GETGOLD_SPADE = new LocalizedItemStack(
            "GETGOLD_SPADE",
            Material.GOLDEN_SHOVEL
        );

        QUALITY_IDENTIFIER = new LocalizedItemStack(
            "QUALITY_IDENTIFIER",
            Material.PAPER,
            LoreBuilder.usesLeft(QualityIdentifier.MAX_USES)
        );

        APPRAISAL_PAPER_ARMOR = new LocalizedItemStack(
            "APPRAISAL_PAPER_ARMOR",
            Material.PAPER,
            LoreBuilder.usesLeft(QualityIdentifier.MAX_USES)
        );

        APPRAISAL_PAPER_DAMAGE = new LocalizedItemStack(
            "APPRAISAL_PAPER_DAMAGE",
            Material.PAPER,
            LoreBuilder.usesLeft(QualityIdentifier.MAX_USES)
        );

        APPRAISAL_PAPER_HORSE_ARMOR = new LocalizedItemStack(
            "APPRAISAL_PAPER_HORSE_ARMOR",
            Material.PAPER,
            LoreBuilder.usesLeft(QualityIdentifier.MAX_USES)
        );

        GETGOLD_SPADE.addUnsafeEnchantment(Enchantment.MENDING, 3);
        // endregion tool

        // region weapon
        LIGHT_BOW = new LocalizedItemStack(
            "LIGHT_BOW",
            Material.BOW
        );

        WITHERSKULL_BOW = new LocalizedItemStack(
            "WITHERSKULL_BOW",
            Material.BOW
        );

        EMER_SWORD = new LocalizedItemStack(
            "EMER_SWORD",
            Material.DIAMOND_SWORD
        );

        BONE_SWORD = new LocalizedItemStack(
            "BONE_SWORD",
            Material.WOODEN_SWORD
        );

        RANDOM_SWORD = new LocalizedItemStack(
            "RANDOM_SWORD",
            Material.DIAMOND_SWORD
        );

        GUARD_SWORD = new LocalizedItemStack(
            "GUARD_SWORD",
            Material.GOLDEN_SWORD
        );

        PEACH_SWORD = new LocalizedItemStack(
            "PEACH_SWORD",
            Material.WOODEN_SWORD
        );

        SOUL_SWORD = new LocalizedItemStack(
            "SOUL_SWORD",
            Material.IRON_SWORD
        );

        SKY_SWORD = new LocalizedItemStack(
            "SKY_SWORD",
            Material.GOLDEN_SWORD
        );

        DEVIL_SWORD = new LocalizedItemStack(
            "DEVIL_SWORD",
            Material.IRON_SWORD
        );

        SKY_DEVIL_SWORD = new LocalizedItemStack(
            "SKY_DEVIL_SWORD",
            Material.DIAMOND_SWORD
        );

        LIGHT_BOW.addUnsafeEnchantment(Enchantment.POWER, 5);

        WITHERSKULL_BOW.addUnsafeEnchantment(Enchantment.POWER, 5);

        EMER_SWORD.addUnsafeEnchantment(Enchantment.SHARPNESS, 1);

        BONE_SWORD.addUnsafeEnchantment(Enchantment.UNBREAKING, 10);

        AppraiseUtils.setAppraisable(RANDOM_SWORD);

        GUARD_SWORD.addUnsafeEnchantment(Enchantment.SHARPNESS, 5);
        GUARD_SWORD.addUnsafeEnchantment(Enchantment.IMPALING, 3);

        PEACH_SWORD.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
        PEACH_SWORD.addUnsafeEnchantment(Enchantment.UNBREAKING, 3);

        SOUL_SWORD.addUnsafeEnchantment(Enchantment.SHARPNESS, 2);
        SOUL_SWORD.addUnsafeEnchantment(Enchantment.UNBREAKING, 1);

        SKY_SWORD.addUnsafeEnchantment(Enchantment.SHARPNESS, 1);
        SKY_SWORD.addUnsafeEnchantment(Enchantment.UNBREAKING, 1);
        SKY_SWORD.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 1);

        DEVIL_SWORD.addUnsafeEnchantment(Enchantment.SHARPNESS, 1);
        DEVIL_SWORD.addUnsafeEnchantment(Enchantment.UNBREAKING, 1);
        DEVIL_SWORD.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 1);

        SKY_DEVIL_SWORD.addUnsafeEnchantment(Enchantment.SHARPNESS, 5);
        SKY_DEVIL_SWORD.addUnsafeEnchantment(Enchantment.UNBREAKING, 5);
        SKY_DEVIL_SWORD.addUnsafeEnchantment(Enchantment.LOYALTY, 5);

        // endregion weapon
    }
}
