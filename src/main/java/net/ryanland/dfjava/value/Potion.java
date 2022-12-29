package net.ryanland.dfjava.value;

import com.google.gson.JsonObject;

public class Potion implements Value {

    private final String potion;
    private int amplifier = 1;
    private int duration = 1_000_000; // in ticks

    private Potion(String potion) {
        this.potion = potion;
    }

    public Potion set(int amplifier, int durationTicks) {
        this.amplifier = amplifier;
        this.duration = durationTicks;
        return this;
    }

    public Potion set(int amplifier, int durationMinutes, int durationSeconds) {
        this.amplifier = amplifier;
        this.duration = (durationMinutes * 60 + durationSeconds) * 20;
        return this;
    }

    public int getAmplifier() {
        return amplifier;
    }

    public int getDuration() {
        return duration;
    }

    public Potion setAmplifier(int amplifier) {
        this.amplifier = amplifier;
        return this;
    }

    public Potion setDuration(int durationTicks) {
        this.duration = durationTicks;
        return this;
    }

    public Potion setDuration(int durationMinutes, int durationSeconds) {
        this.duration = (durationMinutes * 60 + durationSeconds) * 20;
        return this;
    }

    @Override
    public String getType() {
        return "pot";
    }

    @Override
    public JsonObject getData() {
        JsonObject json = new JsonObject();
        json.addProperty("pot", potion);
        json.addProperty("dur", duration);
        json.addProperty("amp", amplifier - 1);
        return json;
    }

    public static final Potion SPEED = new Potion("Speed");
    public static final Potion SLOWNESS = new Potion("Slowness");
    public static final Potion HASTE = new Potion("Haste");
    public static final Potion MINING_FATIGUE = new Potion("Mining Fatigue");
    public static final Potion STRENGTH = new Potion("Strength");
    public static final Potion INSTANT_HEALTH = new Potion("Instant Health");
    public static final Potion INSTANT_DAMAGE = new Potion("Instant Damage");
    public static final Potion JUMP_BOOST = new Potion("Jump Boost");
    public static final Potion NAUSEA = new Potion("Nausea");
    public static final Potion REGENERATION = new Potion("Regeneration");
    public static final Potion RESISTANCE = new Potion("Resistance");
    public static final Potion FIRE_RESISTANCE = new Potion("Fire Resistance");
    public static final Potion WATER_BREATHING = new Potion("Water Breathing");
    public static final Potion INVISIBILITY = new Potion("Invisibility");
    public static final Potion BLINDNESS = new Potion("Blindness");
    public static final Potion NIGHT_VISION = new Potion("Night Vision");
    public static final Potion HUNGER = new Potion("Hunger");
    public static final Potion WEAKNESS = new Potion("Weakness");
    public static final Potion POISON = new Potion("Poison");
    public static final Potion WITHER = new Potion("Wither");
    public static final Potion HEALTH_BOOST = new Potion("Health Boost");
    public static final Potion ABSORPTION = new Potion("Absorption");
    public static final Potion SATURATION = new Potion("Saturation");
    public static final Potion GLOWING = new Potion("Glowing");
    public static final Potion LEVITATION = new Potion("Levitation");
    public static final Potion LUCK = new Potion("Luck");
    public static final Potion BAD_LUCK = new Potion("Bad Luck");
    public static final Potion SLOW_FALLING = new Potion("Slow Falling");
    public static final Potion CONDUIT_POWER = new Potion("Conduit Power");
    public static final Potion DOLPHINS_GRACE = new Potion("Dolphin's Grace");
    public static final Potion BAD_OMEN = new Potion("Bad Omen");
    public static final Potion HERO_OF_THE_VILLAGE = new Potion("Hero of the Village");

}
