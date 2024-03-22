import React from 'react'
import { useState } from 'react'
import { Card } from '../Types'
import { isGameState } from '../Types'
import { useGwentGame } from './context/GwentGameContext'
import './Play.css'
import './Cards.css'
import './Field.css'
import './Scores.css'

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
    if(gameState!.board.cardsOnFieldPlayer1.length == 0) {
        cardsOnFieldPlayer1.push(<button type="button" className="card-in-field empty-card"></button>);
    } else {
        for(let i = 0; i < gameState?.board.cardsOnFieldPlayer1.length; i++) {
            cardsOnFieldPlayer1.push(<CardInField cardImg={gameState?.board.cardsOnFieldPlayer1[i].cardName}/>);
        }
    }

    /*cardsOnBoardPlayer2*/
    if(gameState!.board.cardsOnFieldPlayer2.length == 0) {
        cardsOnFieldPlayer2.push(<button type="button" className="card-in-field empty-card"></button>);
    } else {
        for(let i = 0; i < gameState!.board.cardsOnFieldPlayer2.length; i++) {
            cardsOnFieldPlayer2.push(<CardInField cardImg={gameState?.board.cardsOnFieldPlayer2[i].cardName}/>);
        }
    }

    /*cardsInHandPlayer1*/
    if(gameState!.players[0].hand.cards.length == 0) {
        cardsInHandPlayer1.push(<button type="button" className="card player1 empty-card">Empty2</button>);
    } else {
        for(let i = 0; i < gameState!.players[0].hand.cards.length; i++) {
            cardsInHandPlayer1.push(<CardInHand cardImg={gameState?.players[0].hand.cards[i].cardName}
                player={"player1"}
                onCardClick={() => playCard(gameState?.players[0].hand.cards[i].cardID, 1)} />);
        }
    }

    /*cardsInHandPlayer2*/
    if(gameState!.players[1].hand.cards.length == 0) {
        cardsInHandPlayer2.push(<button type="button" className="card player2 empty-card">Empty2</button>);
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
    <link href="https://fonts.cdnfonts.com/css/gliscor-gothic" rel="stylesheet"/>
    <div>
        {cardsInHandPlayer2}
    </div>
    <div>
        {cardsInHandPlayer1}
    </div>
    <div className="divFix">
        <PlayingField field="Close-Range-1"/>
        <div className="Close-Range-1-Cards">
            {cardsOnFieldPlayer1}
        </div>
    </div>
    <div className="divFix">
        <div className="Close-Range-2-Cards">
            {cardsOnFieldPlayer2}
        </div>
        <PlayingField field="Close-Range-2"/>
    </div>
    <div id="background" className="background">
    </div>
    <div className="scores">
        <div id="totalPoints1">{gameState?.scores.totalScorePlayer1}</div>
        <div id="totalPoints2">{gameState?.scores.totalScorePlayer2}</div>
        <div id="closePoints1">{gameState?.scores.scoreCloseRangePlayer1}</div>
        <div id="closePoints2">{gameState?.scores.scoreCloseRangePlayer2}</div>
    </div>
    </>
};
