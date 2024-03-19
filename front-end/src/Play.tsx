import React from 'react'
import { useState } from 'react'
import { Card } from '../Types'
import { isGameState } from '../Types'
import { useGwentGame } from './context/GwentGameContext'
import './Play.css'

function CardInHand({ card_ID, onCardClick }) {
    const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="card" id={`${card_ID}`} onClick={onCardClick} />
    </div>
    );
}

function CardInField({ card_ID }) {
    const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="card" id={`${card_ID}`} />
    </div>
    );
}

function PlayingField({field}) {
    const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="field" disabled="disabled" id={`${field}`} >


        </button>
    </div>
    )
}

export const Play = () => {
    const { gameState, setGameState } = useGwentGame();
    var cardsInHand = [];
    var cardsOnBoard = [];

    for(let i = 0; i < gameState!.cards.length; i++) {
        cardsInHand.push(<CardInHand card_ID={gameState?.cards[i].cardName} onCardClick={() => playCard(gameState?.cards[i].cardName)} />);
    }

    for(let i = 0; i < gameState!.cards.length; i++) {
        cardsOnBoard.push(<CardInField card_ID={gameState?.cards[i].cardName} onCardClick={() => playCard(gameState?.cards[i].cardName)} />);
    }

    const playCard = async (cardID: String) => {
        const response = await fetch("/gwent/api/play", {
            method: "POST",
            headers: {
                Accept: "application/json",
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                cardToPlay: cardID
            }),
        });

        const gameState = await response.json();
        setGameState(gameState);
    }

    return <>
        <div>
            <PlayingField field="close2" />
            {cardsOnBoard}
            <PlayingField field="close1" />

        </div>
        <div>
            {cardsInHand}
        </div>
    </>
};
