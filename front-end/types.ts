export type GameState = {
    cardsInHand: Card[];
    cardsOnField: Card[];
}

export type Card = {
    cardName: string;
    cardID: string;
}

export function isGameState(game: unknown): gameState is GameState {
    return (gameState as GameState).cards !== undefined;
}
