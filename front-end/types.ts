export type GameState = {
    player: Player[];
    board: Board;
    scores: Scores;
}

export type Player = {
    player: int;
    hand: Hand;
}

export type Hand = {
    cards: Card[];
}

export type Board = {
    cardsOnFieldPlayer1: Card[];
    cardsOnFieldPlayer2: Card[];
    rangedPlayer1: Card[];
    rangedPlayer2: Card[];
    siegePlayer1: Card[];
    siegePlayer2: Card[];
}

export type Card = {
    cardName: string;
    cardID: string;
    range: string;
}

export type Scores = {
    totalScorePlayer1: int;
    totalScorePlayer2: int;
    scoreCloseRangePlayer1: int;
    scoreCloseRangePlayer2: int;
}

export function isGameState(game: unknown): gameState is GameState {
    return (gameState as GameState).cards !== undefined;
}
