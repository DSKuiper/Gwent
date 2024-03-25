package gwent.domain;

import java.util.ArrayList;

public class Board {
    private ArrayList<Card> closeRangePlayer1 = new ArrayList<>();
    private ArrayList<Card> closeRangePlayer2 = new ArrayList<>();
    private ArrayList<Card> rangedPlayer1 = new ArrayList<>();
    private ArrayList<Card> rangedPlayer2 = new ArrayList<>();
    private ArrayList<Card> siegePlayer1 = new ArrayList<>();
    private ArrayList<Card> siegePlayer2 = new ArrayList<>();

    public Card getCard(int index, int player, String range) {
        switch(range) {
            case "close":
                if(player == 1) {
                    return closeRangePlayer1.get(index);
                } else {
                    return closeRangePlayer2.get(index);
                }
            case "ranged":
                if(player == 1) {
                    return rangedPlayer1.get(index);
                } else {
                    return rangedPlayer2.get(index);
                }
            case "siege":
                if(player == 1) {
                    return siegePlayer1.get(index);
                } else {
                    return siegePlayer2.get(index);
                }
        }
        return null;
    }

    public int numberOfCards(String range, int player) {
        switch(range) {
            case "close": {
                if (player == 1) {
                    return closeRangePlayer1.size();
                } else {
                    return closeRangePlayer2.size();
                }
            }
            case "ranged": {
                if (player == 1) {
                    return rangedPlayer1.size();
                } else {
                    return rangedPlayer2.size();
                }
            }
            case "siege": {
                if (player == 1) {
                    return siegePlayer1.size();
                } else {
                    return siegePlayer2.size();
                }
            }
        }
        return 0;
    }
    public void addCard(Card playedCard, int player) {
        switch(playedCard.getRange()) {
            case "close": {
                if (player == 1) {
                    closeRangePlayer1.add(playedCard);
                } else {
                    closeRangePlayer2.add(playedCard);
                }
                break;
            }
            case "ranged": {
                if (player == 1) {
                    rangedPlayer1.add(playedCard);
                } else {
                    rangedPlayer2.add(playedCard);
                }
                break;
            }
            case "siege": {
                if (player == 1) {
                    siegePlayer1.add(playedCard);
                } else {
                    siegePlayer2.add(playedCard);
                }
                break;
            }
        }
    }

    public int getScore(String range, int player) {
        int score = 0;
        switch(range) {
            case "close":
                if(player == 1) {
                    for(Card card : closeRangePlayer1) {
                        score += card.cardValue;
                    }
                } else {
                    for(Card card : closeRangePlayer2) {
                        score += card.cardValue;
                    }
                }
                break;
            case "ranged":
                if(player == 1) {
                    for(Card card : rangedPlayer1) {
                        score += card.cardValue;
                    }
                } else {
                    for(Card card : rangedPlayer2) {
                        score += card.cardValue;
                    }
                }
                break;
            case "siege":
                if(player == 1) {
                    for(Card card : siegePlayer1) {
                        score += card.cardValue;
                    }
                } else {
                    for(Card card : siegePlayer2) {
                        score += card.cardValue;
                    }
                }
                break;
        }
        return score;
    }

    public ArrayList<Card> getCloseRangePlayer1() {
        return closeRangePlayer1;
    }

    public ArrayList<Card> getCloseRangePlayer2() {
        return closeRangePlayer2;
    }

    public ArrayList<Card> getRangedPlayer1() {
        return rangedPlayer1;
    }

    public ArrayList<Card> getRangedPlayer2() {
        return rangedPlayer2;
    }

    public ArrayList<Card> getSiegePlayer1() {
        return siegePlayer1;
    }

    public ArrayList<Card> getSiegePlayer2() {
        return siegePlayer2;
    }
}
