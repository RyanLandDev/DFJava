package net.ryanland.dfjava.value;

import com.google.gson.JsonObject;
import net.ryanland.dfjava.selectable.target.GameValueTarget;

public class GameValue implements Value {

    private final String gameValue;
    private GameValueTarget target;

    private GameValue(String gameValue) {
        this.gameValue = gameValue;
    }

    public GameValue set(GameValueTarget target) {
        this.target = target;
        return this;
    }

    public GameValueTarget getTarget() {
        return target;
    }

    @Override
    public String getType() {
        return "g_val";
    }

    @Override
    public JsonObject getData() {
        JsonObject json = new JsonObject();
        json.addProperty("type", gameValue);
        json.addProperty("target", target.getId());
        return json;
    }

    public static final GameValue CURRENT_HEALTH = new GameValue("Current Health");
    public static final GameValue MAXIMUM_HEALTH = new GameValue("Maximum Health");
    public static final GameValue ABSORPTION_HEALTH = new GameValue("Absorption Health");
    public static final GameValue FOOD_LEVEL = new GameValue("Food Level");
    public static final GameValue FOOD_SATURATION = new GameValue("Food Saturation");
    public static final GameValue FOOD_EXHAUSTION = new GameValue("Food Exhaustion");
    public static final GameValue ATTACK_DAMAGE = new GameValue("Attack Damage");
    public static final GameValue ATTACK_SPEED = new GameValue("Attack Speed");
    public static final GameValue ARMOR_POINTS = new GameValue("Armor Points");
    public static final GameValue ARMOR_TOUGHNESS = new GameValue("Armor Toughness");
    public static final GameValue INVULNERABILITY_TICKS = new GameValue("Invulnerability Ticks");
    public static final GameValue EXPERIENCE_LEVEL = new GameValue("Experience Level");
    public static final GameValue EXPERIENCE_PROGRESS = new GameValue("Experience Progress");
    public static final GameValue FIRE_TICKS = new GameValue("Fire Ticks");
    public static final GameValue FREEZE_TICKS = new GameValue("Freeze Ticks");
    public static final GameValue REMAINING_AIR = new GameValue("Remaining Air");
    public static final GameValue FALL_DISTANCE = new GameValue("Fall Distance");
    public static final GameValue HELD_SLOT = new GameValue("Held Slot");
    public static final GameValue PING = new GameValue("Ping");
    public static final GameValue ITEM_USAGE_PROGRESS = new GameValue("Item Usage Progress");
    public static final GameValue LOCATION = new GameValue("Location");
    public static final GameValue TARGET_BLOCK_LOCATION = new GameValue("Target Block Location");
    public static final GameValue TARGET_BLOCK_SIDE = new GameValue("Target Block Side");
    public static final GameValue TARGET_FLUID_LOCATION = new GameValue("Target Fluid Location");
    public static final GameValue EYE_LOCATION = new GameValue("Eye Location");
    public static final GameValue X_COORDINATE = new GameValue("X-Coordinate");
    public static final GameValue Y_COORDINATE = new GameValue("Y-Coordinate");
    public static final GameValue Z_COORDINATE = new GameValue("Z-Coordinate");
    public static final GameValue PITCH = new GameValue("Pitch");
    public static final GameValue YAW = new GameValue("Yaw");
    public static final GameValue CARDINAL_DIRECTION = new GameValue("Cardinal Direction");
    public static final GameValue SPAWN_LOCATION = new GameValue("Spawn Location");
    public static final GameValue VELOCITY = new GameValue("Velocity");
    public static final GameValue DIRECTION = new GameValue("Direction");
    public static final GameValue MAIN_HAND_ITEM = new GameValue("Main Hand Item");
    public static final GameValue OFF_HAND_ITEM = new GameValue("Off Hand Item");
    public static final GameValue ARMOR_ITEMS = new GameValue("Armor Items");
    public static final GameValue HOTBAR_ITEMS = new GameValue("Hotbar Items");
    public static final GameValue INVENTORY_ITEMS = new GameValue("Inventory Items");
    public static final GameValue CURSOR_ITEM = new GameValue("Cursor Item");
    public static final GameValue INVENTORY_MENU_ITEMS = new GameValue("Inventory Menu Items");
    public static final GameValue SADDLE_ITEM = new GameValue("Saddle Item");
    public static final GameValue ENTITY_ITEM = new GameValue("Entity Item");
    public static final GameValue NAME = new GameValue("Name");
    public static final GameValue UUID = new GameValue("UUID");
    public static final GameValue ENTITY_TYPE = new GameValue("Entity Type");
    public static final GameValue OPEN_INVENTORY_TITLE = new GameValue("Open Inventory Title");
    public static final GameValue POTION_EFFECTS = new GameValue("Potion Effects");
    public static final GameValue VEHICLE = new GameValue("Vehicle");
    public static final GameValue PASSENGERS = new GameValue("Passengers");
    public static final GameValue LEAD_HOLDER = new GameValue("Lead Holder");
    public static final GameValue ATTACHED_LEADS = new GameValue("Attached Leads");
    public static final GameValue EVENT_BLOCK_LOCATION = new GameValue("Event Block Location");
    public static final GameValue EVENT_BLOCK_SIDE = new GameValue("Event Block Side");
    public static final GameValue EVENT_BLOCK_FACE = new GameValue("Event Block Face");
    public static final GameValue EVENT_DAMAGE = new GameValue("Event Damage");
    public static final GameValue DAMAGE_EVENT_CAUSE = new GameValue("Damage Event Cause");
    public static final GameValue EVENT_DEATH_MESSAGE = new GameValue("Event Death Message");
    public static final GameValue EVENT_HEAL_AMOUNT = new GameValue("Event Heal Amount");
    public static final GameValue HEAL_EVENT_CAUSE = new GameValue("Heal Event Cause");
    public static final GameValue EVENT_POWER = new GameValue("Event Power");
    public static final GameValue EVENT_COMMAND = new GameValue("Event Command");
    public static final GameValue EVENT_COMMAND_ARGUMENTS = new GameValue("Event Command Arguments");
    public static final GameValue EVENT_ITEM = new GameValue("Event Item");
    public static final GameValue EVENT_HOTBAR_SLOT = new GameValue("Event Hotbar Slot");
    public static final GameValue EVENT_CLICKED_SLOT_INDEX = new GameValue("Event Clicked Slot Index");
    public static final GameValue EVENT_CLICKED_SLOT_ITEM = new GameValue("Event Clicked Slot Item");
    public static final GameValue EVENT_CLICKED_SLOT_NEW_ITEM = new GameValue("Event Clicked Slot New Item");
    public static final GameValue CLOSE_INVENTORY_EVENT_CAUSE = new GameValue("Close Inventory Event Cause");
    public static final GameValue INVENTORY_EVENT_CLICK_TYPE = new GameValue("Inventory Event Click Type");
    public static final GameValue FISH_EVENT_CAUSE = new GameValue("Fish Event Cause");
    public static final GameValue PLAYER_COUNT = new GameValue("Player Count");
    public static final GameValue CPU_USAGE = new GameValue("CPU Usage");
    public static final GameValue SERVER_TPS = new GameValue("Server TPS");
    public static final GameValue TIMESTAMP = new GameValue("Timestamp");
    public static final GameValue SELECTION_SIZE = new GameValue("Selection Size");
    public static final GameValue SELECTION_TARGET_NAMES = new GameValue("Selection Target Names");
    public static final GameValue SELECTION_TARGET_UUIDS = new GameValue("Selection Target UUIDs");

}
