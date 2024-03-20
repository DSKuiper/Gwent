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
    var cardsOnFieldPlayer1 = [];
    var cardsOnFieldPlayer2 = [];

    /*cardsOnBoardPlayer1*/
    if(gameState!.cardsOnFieldPlayer1.length == 0) {
        cardsOnFieldPlayer1.push(<button type="button" hidden/>)
    } else {
        for(let i = 0; i < gameState?.cardsOnFieldPlayer1.length; i++) {
            cardsOnFieldPlayer1.push(
            <CardInField cardImg={gameState?.cardsOnFieldPlayer1[i].cardName}/>
            );
        }
    }

    /*cardsOnBoardPlayer2*/
    if(gameState!.cardsOnFieldPlayer2.length == 0) {
        cardsOnFieldPlayer2.push(<button type="button" hidden/>)
    } else {
        for(let i = 0; i < gameState!.cardsOnFieldPlayer2.length; i++) {
            cardsOnFieldPlayer2.push(
            <CardInField cardImg={gameState?.cardsOnFieldPlayer2[i].cardName}/>
            );
        }
    }

    /*cardsInHandPlayer1*/
    if(gameState!.players[0].hand.cards.length == 0) {
        cardsInHandPlayer1.push(<button type="button" className="card player1 empty-hand" ></button>)
    } else {
        for(let i = 0; i < gameState!.players[0].hand.cards.length; i++) {
            cardsInHandPlayer1.push(<CardInHand cardImg={gameState?.players[0].hand.cards[i].cardName}
                player={"player1"}
                onCardClick={() => playCard(gameState?.players[0].hand.cards[i].cardID, 1)} />);
        }
    }

    /*cardsInHandPlayer2*/
    if(gameState!.players[0].hand.cards.length == 0) {
            cardsInHandPlayer2.push(<button type="button" className="card player2 empty-hand" ></button>)
    } else {
        for(let i = 0; i < gameState!.players[1].hand.cards.length; i++) {
            cardsInHandPlayer2.push(<CardInHand cardImg={gameState?.players[1].hand.cards[i].cardName}
                player={"player2"}
                onCardClick={() => playCard(gameState?.players[1].hand.cards[i].cardID, 2)} />);
        }
    }

    const playCard = async (cardID: String, player: int) => {
        const response = await fetch("/gwent/api/play", {
            method: "POST",
            headers: {
                Accept: "application/json",
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                cardID: cardID,
                player: player
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
                {cardsOnFieldPlayer1}
            </div>
        </div>
        <div className="divFix">
            <div className="close2Cards">
                {cardsOnFieldPlayer2}
            </div>
        </div>
    </>
};
