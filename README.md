# Individual project: Gwent

## Project goal
This repository contains my personal project that concludes my traineeship at Sogyo. The goal of the personal project is to develop a full-stack web application from scratch. I have chosen to implement the game Gwent, which is a card game originally from The Witcher books by Andrzej Sapkowski. In this project, I will implement the rules used in The Witcher 3: Wild Hunt, a game by CD Project Red. How to play Gwent will be explained later in this README or can be found at: https://game8.co/games/Witcher3/archives/277237. 

### Personal learning goals
- Ask for help and feedback sooner
- Stay more focussed on one issue or goal

### Technical learning goals
- Build the connection from front- to back-end from scratch
- Get a better understanding of this connection and how data is send back and forth

## MoSCoW requirements

#### Must
- [x] UI with:
    - [x] A clickable card that goes to the field when clicked 
    - [x] A simple field with one row per player (where players put their cards)
    - [x] Show points for both players
- [x] Unit cards with a value, no special abilities or specific playing field
- [x] Have a point system that calculates the points both players have on their playing field

#### Should
- [ ] functionality:
    - [x] Add automatic random deck and hand building
    - [ ] Add active state to players and switch between players
    - [ ] Add rounds to the game
    - [ ] Allow players to end the round
    - [ ] Add funcitonality for leader cards
- [ ] Improve UI:
    - [ ] Show a complete playing field (three rows for both players; close range, ranged and siege)
    - [ ] Show rounds and wins/lives
    - [ ] Show end round button
    - [ ] Show weather card spot
    - [ ] Show leader card
- [ ] Improve cards:
    - [ ] Add special abilities to the unit cards:
        - [ ] Morale boost (add +1 to all units on the row excluding itself)
        - [ ] Tight bond (when placed next to a card of the same type, double strength of both cards)
        - [ ] Muster (go through your deck and play all cards of the same type immediately)
    - [ ] Weather cards:
        - [ ] Bad weather cards (set value to 1 for every card for that card's range) 
        - [ ] Clear weather (clear the negative effect of bad weather)
    - [ ] Add the decoy item (swap with a card in your field)
    - [ ] Add special character cards (unit cards with a high value and ability)
    - [ ] Add leader cards (a card that is always in your hand and has a special ability)

#### Could
- [ ] functionality:
    - [ ] Add confirm option before a card is played
    - [ ] Allow players to choose which row they want to play if applicable (commander's horn and weather cards)
    - [ ] Add discard pile
- [ ] UI:
    - [ ] Show confirm button before a card is played
    - [ ] Show discard spot
- [ ] Improve cards:
    - [ ] Add special abilities to the unit cards:
        - [ ] Medic (pick a card from your discard pile and play it instantly)
        - [ ] Spy (place on your opponent's battlefield and draw 2 cards from your deck)
        - [ ] Scorch (if the opponent has a total strength of at least 10 on this cards row, kill that row's strongest card)
    - [ ] Add commander's horn: double the value of all cards in the chosen playing field
    - [ ] Add scorch item

#### Would
- [ ] Switch the view for player 1 and 2
- [ ] Allow the players to set their own name
- [ ] Improve cards:
    - [ ] Add special abilities to the unit cards:
        - [ ] Berserker (this card turns much stronger if a mardroeme card is played before or after it)
        - [ ] Mardroeme (triggers a berserker card)
- [ ] Implement the different factions (decks): Northern Realms, Nilfgaard, Monster, Scoia'tael and Skellige
- [ ] Add factions specific leader cards
- [ ] Save accounts in a database
- [ ] Enable card collecting specific for these accounts
- [ ] add own artwork

## Framework and set-up

The back-end, domain and persistence layers of this project are programmed in java. The back-end furthermore uses the Spring Boot framework. The front-end uses Node.js, React and a Vite server.

In order to play the game, make sure you have `java version 17` installed. Then download and install the dependencies as follows:

```
git clone https://github.com/DSKuiper/Gwent.git
cd gwent
cd front-end
npm install
```

### Running the game

To run the game, start the backend server by running the `ApiApplication.java` file in `gwent/api/src/main/java/nl/sogyo/api/`.

Start the front-end server by going to the `gwent/client` folder and running the following command in a terminal:

```
npm run dev
```

In your browser, go to: `localhost:5173`

## How to play Gwent
Gwent is a strategic card game in which two players try to defeat the other by placing their cards on their playing field and forming the highest attack strength. The game is played in three rounds. A player can end a round at the start of their turn, preventing them from playing any more cards. When players end the round, the player with the highest score is granted a win. The player who has won two rounds first wins the game.

## The playing field
Both players have a playing field consisting of three rows. These rows represent different combat ranges (close range, ranged weapons and siege weapons). Cards can only be placed in a specific row. Therefore, each row has it's own score. Special ability cards like weather cards can also only be placed on their respective row. Items like the commander's horn however can be placed on a row of the players choosing.

TODO: add picture of playing field

## Cards
There are two general types of cards: `unit cards` and `special cards`. 

### Unit cards
Unit cards are your 'troops'. They have a certain strength which counts towards your score. Some have special abilities.

#### Unit card abilities
`Berserker`: This unit changes into a much stronger version of itself if a Mardroeme is played before or after it.

`Commander`: Double the strength of all unit cards in the row. Limit to 1 per row. Can only be placed on the specified row of this unit card.

`Medic`: After playing this card, choose one card from the discard pile and play it instantly (no Heroes or Special cards).

`Morale Boost`:	Adds +1 to all units in the row (excluding itself). Can only be placed on the specified row of this unit card.

`Mardroeme`: Triggers transformation of all Berserker Cards on the same row. Can only be placed on the specified row of this unit card.

`Muster`: Find any cards with the same name in your deck and play them instantly.

`Scorch`: Destroy enemy’s strongest unit in a specific row, if the combined strength of all his or her units is 10 or more. Can only be placed on the specified row of this unit card.

`Spy`: Place on your opponent’s battlefield and draw 2 cards from your deck.

`Tight Bond`: Placing this unit next to a card with the same name will double the strength of both cards.

#### Hero cards
Hero cards are unit cards with a high strength. They are immune to special effects and abilities. Some have a second ability like the ones listed above.

### Special cards
Special cards do not have a strength of their own, but do have special abilities. They can be used to enhance your own cards or hinder the opponent. 

#### Special card abilities
`Commander's Horn`: Double the strength of all unit cards in the row. Limit to 1 per row. Can only be placed on a row of the player's choice.

`Decoy`: This card allows you to swap it with a (unit) card on the battlefield to return it to your hand.

`Scorch`: Destroy the strongest card(s) for the row with the highest score anywhere on the battlefield (own rows as well).

#### Weather cards:
`Biting Frost`: Set the strength of all `close combat` cards to 1 for both players.

`Impenetrable Fog`: Set the strength of all `ranged combat` cards to 1 for both players.

`Torrential Rain`: Set the strength of all `siege combat` cards to 1 for both players.

`Clear Weather`: Discard all weather cards currently on the board.

#### Leader cards
Leader cards do not have a strength value but always have a special ability. They are always added to your hand and can be played at any time.
