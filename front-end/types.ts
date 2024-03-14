export type Card = {
    cardName: string;
}

export function isCard(game: unknown): card is Card {
    return (card as Card).cardName !== undefined;
}
