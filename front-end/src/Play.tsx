import React from 'react'
import { useState } from 'react'
import { Card } from '../Types'
import { isGameState } from '../Types'
import { useGwentGame } from './context/GwentGameContext'
import './Play.css'

function CardHtml({ card_ID, onCardClick }) {
    const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="card" id={`${card_ID}`} onClick={onCardClick} />
    </div>
    );
}

function PlayingField({field}) {
    //const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="field" disabled="disabled" id={`${field}`} />
    </div>
    )
}

export const Play = () => {
    const { gameState, setGameState } = useGwentGame();

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

    var playerOneCardOne = gameState?.cards[0].cardID;
    var playerOneCardTwo = gameState?.cards[1].cardID;
    //var playerOneCardThree = gameState?.cards[2].cardID;

    return <>
        <div>
            <PlayingField field="close2" />
            <PlayingField field="close1" />
        </div>
        <div>
            <CardHtml card_ID={gameState?.cards[0].cardName} onCardClick={() => playCard("Ciri")} />
            <CardHtml card_ID={gameState?.cards[1].cardName} onCardClick={() => playCard("Redenian-Foot-Soldier")} />

        </div>
    </>
};
