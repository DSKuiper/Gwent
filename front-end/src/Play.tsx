import React from 'react'
import { useState } from 'react'
import { Card } from '../Types'
import { isGameState } from '../Types'
import { useGwentGame } from './context/GwentGameContext'
import './Play.css'

function CardInHand({ cardImg, onCardClick }) {
    const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="card" id={`${cardImg}`} onClick={onCardClick} />
    </div>
    );
}

function CardInField({ cardImg }) {
    const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="card-in-field" id={`${cardImg}`} />
    </div>
    );
}

function PlayingField({ field }) {
    const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="field" id={`${field}`} disabled="disabled" >


        </button>
    </div>
    )
}

export const Play = () => {
    const { gameState, setGameState } = useGwentGame();
    var cardsInHand = [];
    var cardsOnBoard = [];

    for(let i = 0; i < gameState!.cardsInHand.length; i++) {
        cardsInHand.push(<CardInHand cardImg={gameState?.cardsInHand[i].cardName} onCardClick={() => playCard(gameState?.cardsInHand[i].cardID)} />);
    }

    for(let i = 0; i < gameState!.cardsOnField.length; i++) {
        cardsOnBoard.push(<CardInField cardImg={gameState?.cardsOnField[i].cardName}
            onCardClick={() => playCard(gameState?.cardsOnField[i].cardID)} />);
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
        <div className="divFix">
            <PlayingField field="close2" />
            <PlayingField field="close1"/>
        </div>
            <div className="divFix">
                <div className="close1Cards">{cardsOnBoard}</div>
            </div>
        <div className="divFix">{cardsInHand}</div>
    </>
};
