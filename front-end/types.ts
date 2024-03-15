export type GameState = {
    cards: Card[];
}

export type Card = {
    cardName: string;
}

export function isGameState(game: unknown): gameState is GameState {
    return (gameState as GameState).cards !== undefined;
}
