import static java.lang.String.format;

public class GameMaster {

    public String describe(Character character) {
        return format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(),
                character.getHitPoints());
    }

    public String describe(Destination destination) {
        return format("You've arrived at %s, which has %d inhabitants.", destination.getName(),
                destination.getInhabitants());
    }

    public String describe(TravelMethod travelMethod) {
        if(travelMethod.equals(TravelMethod.WALKING)) {
            return "You're traveling to your destination by walking.";
        } else {
            return "You're traveling to your destination on horseback.";
        }
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return format("%s %s %s", describe(character) , describe(travelMethod) , describe(destination));
    }

    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
