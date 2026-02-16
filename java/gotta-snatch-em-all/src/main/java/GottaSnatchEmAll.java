import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> commonCards = commonCards(List.of(myCollection, theirCollection));
        myCollection.removeAll(commonCards);
        theirCollection.removeAll(commonCards);
        return !myCollection.isEmpty() && !theirCollection.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCards = new HashSet<>(collections.getFirst());
        for(int i = 1; i < collections.size(); i++) {
            Set<String> collection = collections.get(i);
            commonCards.removeIf(card -> !collection.contains(card));
            if(commonCards.isEmpty()) break;
        }
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        for(Set<String> collection: collections) allCards.addAll(collection);
        return allCards;
    }
}
