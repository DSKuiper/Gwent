export type Game = {
    test: string;
}

export function isGame(game: unknown): game is Game {
    return (game as Game).test !== undefined;
}
