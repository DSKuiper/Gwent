export type GameState = {
    player: Player[];
    board: Board;
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
}

export type Card = {
    cardName: string;
    cardID: string;
}

export function isGameState(game: unknown): gameState is GameState {
    return (gameState as GameState).cards !== undefined;
}
