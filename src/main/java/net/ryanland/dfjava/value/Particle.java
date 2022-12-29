package net.ryanland.dfjava.value;

import com.google.gson.JsonObject;

public class Particle implements Value {

    private final String particle;
    private final boolean hasMotion;
    private final boolean hasColor;
    private final boolean hasSize;
    private final boolean hasMaterial;

    private int amount = 1;
    private float spreadHorizontal = 0;
    private float spreadVertical = 0;

    private int color = 0xff0000;
    private int colorVariation = 0;

    private float size = 1;
    private int sizeVariation = 0;

    private float motionX = 1;
    private float motionY = 0;
    private float motionZ = 0;
    private int motionVariation = 100;

    private String material = "oak_log";

    private Particle(String particle, boolean hasMotion, boolean hasColor, boolean hasSize, boolean hasMaterial) {
        this.particle = particle;
        this.hasMotion = hasMotion;
        this.hasColor = hasColor;
        this.hasSize = hasSize;
        this.hasMaterial = hasMaterial;
    }

    public int getAmount() {
        return amount;
    }

    public float getSpreadHorizontal() {
        return spreadHorizontal;
    }

    public float getSpreadVertical() {
        return spreadVertical;
    }

    public int getColor() {
        return color;
    }

    public int getColorVariation() {
        return colorVariation;
    }

    public float getSize() {
        return size;
    }

    public int getSizeVariation() {
        return sizeVariation;
    }

    public float getMotionX() {
        return motionX;
    }

    public float getMotionY() {
        return motionY;
    }

    public float getMotionZ() {
        return motionZ;
    }

    public int getMotionVariation() {
        return motionVariation;
    }

    public String getMaterial() {
        return material;
    }

    public boolean hasMotion() {
        return hasMotion;
    }

    public boolean hasColor() {
        return hasColor;
    }

    public boolean hasSize() {
        return hasSize;
    }

    public boolean hasMaterial() {
        return hasMaterial;
    }

    public Particle setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public Particle setSpreadHorizontal(float spreadHorizontal) {
        this.spreadHorizontal = spreadHorizontal;
        return this;
    }

    public Particle setSpreadVertical(float spreadVertical) {
        this.spreadVertical = spreadVertical;
        return this;
    }

    public Particle setColor(int color) {
        this.color = color;
        return this;
    }

    public Particle setColorVariation(int colorVariation) {
        this.colorVariation = colorVariation;
        return this;
    }

    public Particle setSize(float size) {
        this.size = size;
        return this;
    }

    public Particle setSizeVariation(int sizeVariation) {
        this.sizeVariation = sizeVariation;
        return this;
    }

    public Particle setMotionX(float motionX) {
        this.motionX = motionX;
        return this;
    }

    public Particle setMotionY(float motionY) {
        this.motionY = motionY;
        return this;
    }

    public Particle setMotionZ(float motionZ) {
        this.motionZ = motionZ;
        return this;
    }

    public Particle setMotionVariation(int motionVariation) {
        this.motionVariation = motionVariation;
        return this;
    }

    public Particle setMaterial(String material) {
        this.material = material;
        return this;
    }

    public Particle setSpread(float spreadHorizontal, float spreadVertical) {
        return setSpreadHorizontal(spreadHorizontal)
            .setSpreadVertical(spreadVertical);
    }

    public Particle setColor(int color, int colorVariation) {
        return setColor(color)
            .setColorVariation(colorVariation);
    }

    public Particle setSize(float size, int sizeVariation) {
        return setSize(size)
            .setSizeVariation(sizeVariation);
    }

    public Particle setMotion(float x, float y, float z) {
        return setMotionX(x)
            .setMotionY(y)
            .setMotionZ(z);
    }

    public Particle setMotion(float x, float y, float z, int motionVariation) {
        return setMotion(x, y, z)
            .setMotionVariation(motionVariation);
    }

    @Override
    public String getType() {
        return "part";
    }

    @Override
    public JsonObject getData() {
        JsonObject json = new JsonObject();
        json.addProperty("particle", particle);

        JsonObject cluster = new JsonObject();
        cluster.addProperty("amount", amount);
        cluster.addProperty("horizontal", spreadHorizontal);
        cluster.addProperty("vertical", spreadVertical);
        json.add("cluster", cluster);

        JsonObject data = new JsonObject();
        if (hasMotion) {
            data.addProperty("x", motionX);
            data.addProperty("y", motionY);
            data.addProperty("z", motionZ);
            data.addProperty("motionVariation", motionVariation);
        }
        if (hasColor) {
            data.addProperty("rgb", color);
            data.addProperty("colorVariation", colorVariation);
        }
        if (hasSize) {
            data.addProperty("size", size);
            data.addProperty("sizeVariation", sizeVariation);
        }
        if (hasMaterial) {
            data.addProperty("material", material.toUpperCase());
        }
        json.add("data", data);

        return json;
    }

    public static final Particle RAIN = new Particle("Rain", false, false, false, false);
    public static final Particle UNDERWATER = new Particle("Underwater", false, false, false, false);
    public static final Particle ASH = new Particle("Ash", false, false, false, false);
    public static final Particle WHITE_ASH = new Particle("White Ash", false, false, false, false);
    public static final Particle CRIMSON_SPORE = new Particle("Crimson Spore", false, false, false, false);
    public static final Particle WARPED_SPORE = new Particle("Warped Spore", false, false, false, false);
    public static final Particle ANGRY_VILLAGER = new Particle("Angry Villager", false, false, false, false);
    public static final Particle HAPPY_VILLAGER = new Particle("Happy Villager", false, false, false, false);
    public static final Particle SPIT = new Particle("Spit", true, false, false, false);
    public static final Particle SNEEZE = new Particle("Sneeze", true, false, false, false);
    public static final Particle HEART = new Particle("Heart", false, false, false, false);
    public static final Particle WITCH = new Particle("Witch", false, false, false, false);
    public static final Particle EXPLOSION = new Particle("Explosion", false, false, false, false);
    public static final Particle EXPLOSION_EMITTER = new Particle("Explosion Emitter", false, false, false, false);
    public static final Particle FLASH = new Particle("Flash", false, false, false, false);
    public static final Particle SPLASH = new Particle("Splash", false, false, false, false);
    public static final Particle FISHING = new Particle("Fishing", true, false, false, false);
    public static final Particle EFFECT = new Particle("Effect", false, false, false, false);
    public static final Particle INSTANT_EFFECT = new Particle("Instant Effect", false, false, false, false);
    public static final Particle ENTITY_EFFECT = new Particle("Entity Effect", false, true, false, false);
    public static final Particle AMBIENT_ENTITY_EFFECT = new Particle("Ambient Entity Effect", false, true, false, false);
    public static final Particle DOLPHIN = new Particle("Dolphin", false, false, false, false);
    public static final Particle GLOWING_SQUID_GLOW = new Particle("Glowing Squid Glow", false, false, false, false);
    public static final Particle FALLING_NECTAR = new Particle("Falling Nectar", false, false, false, false);
    public static final Particle FIREWORK = new Particle("Firework", true, false, false, false);
    public static final Particle BUBBLE = new Particle("Bubble", true, false, false, false);
    public static final Particle BUBBLE_POP = new Particle("Bubble Pop", true, false, false, false);
    public static final Particle SNOWFLAKE = new Particle("Snowflake", true, false, false, false);
    public static final Particle SNOWBALL = new Particle("Snowball", false, false, false, false);
    public static final Particle SLIME = new Particle("Slime", false, false, false, false);
    public static final Particle ITEM = new Particle("Item", true, false, false, true);
    public static final Particle CRITICAL_HIT = new Particle("Critical Hit", true, false, false, false);
    public static final Particle ENCHANTED_HIT = new Particle("Enchanted Hit", true, false, false, false);
    public static final Particle DAMAGE_INDICATOR = new Particle("Damage Indicator", true, false, false, false);
    public static final Particle SWEEP_ATTACK = new Particle("Sweep Attack", false, false, true, false);
    public static final Particle SQUID_INK = new Particle("Squid Ink", true, false, false, false);
    public static final Particle GLOWING_SQUID_INK = new Particle("Glowing Squid Ink", true, false, false, false);
    public static final Particle POOF = new Particle("Poof", true, false, false, false);
    public static final Particle ELDER_GUARDIAN = new Particle("Elder Guardian", false, false, false, false);
    public static final Particle DRAGON_BREATH = new Particle("Dragon Breath", true, false, false, false);
    public static final Particle TOTEM_OF_UNDYING = new Particle("Totem of Undying", true, false, false, false);
    public static final Particle CLOUD = new Particle("Cloud", true, false, false, false);
    public static final Particle DRIPPING_OBSIDIAN_TEAR = new Particle("Dripping Obsidian Tear", false, false, false, false);
    public static final Particle FALLING_OBSIDIAN_TEAR = new Particle("Falling Obsidian Tear", false, false, false, false);
    public static final Particle LANDING_OBSIDIAN_TEAR = new Particle("Landing Obsidian Tear", false, false, false, false);
    public static final Particle DRIPPING_WATER = new Particle("Dripping Water", false, false, false, false);
    public static final Particle DRIPSTONE_DRIPPING_WATER = new Particle("Dripstone Dripping Water", false, false, false, false);
    public static final Particle FALLING_WATER = new Particle("Falling Water", false, false, false, false);
    public static final Particle DRIPSTONE_FALLING_WATER = new Particle("Dripstone Falling Water", false, false, false, false);
    public static final Particle DRIPPING_LAVA = new Particle("Dripping Lava", false, false, false, false);
    public static final Particle DRIPSTONE_DRIPPING_LAVA = new Particle("Dripstone Dripping Lava", false, false, false, false);
    public static final Particle FALLING_LAVA = new Particle("Falling Lava", false, false, false, false);
    public static final Particle DRIPSTONE_FALLING_LAVA = new Particle("Dripstone Falling Lava", false, false, false, false);
    public static final Particle LANDING_LAVA = new Particle("Landing Lava", false, false, false, false);
    public static final Particle DRIPPING_HONEY = new Particle("Dripping Honey", false, false, false, false);
    public static final Particle FALLING_HONEY = new Particle("Falling Honey", false, false, false, false);
    public static final Particle LANDING_HONEY = new Particle("Landing Honey", false, false, false, false);
    public static final Particle LAVA = new Particle("Lava", false, false, false, false);
    public static final Particle MYCELIUM = new Particle("Mycelium", false, false, false, false);
    public static final Particle SPORE_BLOSSOM_FALL = new Particle("Spore Blossom Fall", false, false, false, false);
    public static final Particle SPORE_BLOSSOM_AIR = new Particle("Spore Blossom Air", false, false, false, false);
    public static final Particle PORTAL = new Particle("Portal", true, false, false, false);
    public static final Particle REVERSE_PORTAL = new Particle("Reverse Portal", true, false, false, false);
    public static final Particle ENCHANT = new Particle("Enchant", true, false, false, false);
    public static final Particle SMALL_FLAME = new Particle("Small Flame", true, false, false, false);
    public static final Particle FLAME = new Particle("Flame", true, false, false, false);
    public static final Particle SOUL_FLAME = new Particle("Soul Flame", true, false, false, false);
    public static final Particle NAUTILUS = new Particle("Nautilus", true, false, false, false);
    public static final Particle END_ROD = new Particle("End Rod", true, false, false, false);
    public static final Particle FALLING_DUST = new Particle("Falling Dust", false, false, false, true);
    public static final Particle WHIRLPOOL_BUBBLE_COLUMN = new Particle("Whirlpool Bubble Column", false, false, false, false);
    public static final Particle UPWARD_BUBBLE_COLUMN = new Particle("Upward Bubble Column", true, false, false, false);
    public static final Particle CAMPFIRE_SMOKE = new Particle("Campfire Smoke", true, false, false, false);
    public static final Particle CAMPFIRE_SIGNAL_SMOKE = new Particle("Campfire Signal Smoke", true, false, false, false);
    public static final Particle SMOKE = new Particle("Smoke", true, false, false, false);
    public static final Particle LARGE_SMOKE = new Particle("Large Smoke", true, false, false, false);
    public static final Particle NOTE = new Particle("Note", false, true, false, false);
    public static final Particle WAX_ON = new Particle("Wax On", true, false, false, false);
    public static final Particle WAX_OFF = new Particle("Wax Off", true, false, false, false);
    public static final Particle SCRAPE_OXIDIZATION = new Particle("Scrape Oxidization", true, false, false, false);
    public static final Particle COMPOSTER = new Particle("Composter", false, false, false, false);
    public static final Particle BARRIER = new Particle("Barrier", false, false, false, false);
    public static final Particle LIGHT = new Particle("Light", false, false, false, false);
    public static final Particle DUST = new Particle("Dust", false, true, true, false);
    public static final Particle SOUL = new Particle("Soul", true, false, false, false);
    public static final Particle BLOCK = new Particle("Block", false, false, false, true);
    public static final Particle ELECTRIC_SPARK = new Particle("Electric Spark", true, false, false, false);

}
