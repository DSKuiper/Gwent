import React from 'react'
import { useState } from 'react'
import { Card } from '../Types'
import { isGameState } from '../Types'
import { useGwentGame } from './context/GwentGameContext'
import './Play.css'
import './Cards.css'

function CardInHand({ cardImg, player, onCardClick }) {
    const { gameState, setGameState } = useGwentGame();
    return (<button id={`${cardImg}`} className={`card ${player}`} onClick={onCardClick} />);
}

function CardInField({ cardImg }) {
    const { gameState, setGameState } = useGwentGame();
    return (<button className="card-in-field" id={`${cardImg}`} />);
}

function PlayingField({ field }) {
    const { gameState, setGameState } = useGwentGame();
    return (<button className="field" id={`${field}`} disabled="disabled" />);
}

export const Play = () => {
    const { gameState, setGameState } = useGwentGame();
    var cardsInHandPlayer1 = [];
    var cardsInHandPlayer2 = [];
    var cardsOnBoardPlayer1 = [];

    /*cardsInHandPlayer1*/
    if(gameState!.players[0].hand.cards.length == 0) {
        cardsInHandPlayer1.push(<button type="button" className="card player1 empty-hand" ></button>)
    } else {
        for(let i = 0; i < gameState!.players[0].hand.cards.length; i++) {
            cardsInHandPlayer1.push(<CardInHand cardImg={gameState?.players[0].hand.cards[i].cardName}
                player={"player1"}
                onCardClick={() => playCard(gameState?.players[0].hand.cards[i].cardID)} />);
        }
    }

    /*cardsInHandPlayer2*/
    for(let i = 0; i < gameState!.players[1].hand.cards.length; i++) {
        cardsInHandPlayer2.push(<CardInHand cardImg={gameState?.players[1].hand.cards[i].cardName}
            player={"player2"}
            onCardClick={() => playCard(gameState?.players[1].hand.cards[i].cardID)} />);
    }

    /*cardsOnBoardPlayer1*/
    if(gameState!.cardsOnField.length == 0) {
        cardsOnBoardPlayer1.push(<button type="button" hidden/>)
    } else {
        for(let i = 0; i < gameState!.cardsOnField.length; i++) {
            cardsOnBoardPlayer1.push(<CardInField cardImg={gameState?.cardsOnField[i].cardName}
                onCardClick={() => playCard(gameState?.cardsOnField[i].cardID)} />);
        }
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
            {cardsInHandPlayer2}
        </div>
        <div className="divFix">
            {cardsInHandPlayer1}
        </div>
        <div className="divFix">
            <PlayingField field="close2" />
            <PlayingField field="close1"/>
        </div>
        <div className="divFix">
            <div className="close1Cards">
                {cardsOnBoardPlayer1}
            </div>
        </div>
    </>
};
