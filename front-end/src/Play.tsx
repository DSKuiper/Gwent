import { useState } from 'react'
import './Play.css'
import React from 'react'
import { Card } from '../Types'
import ciri from './assets/ciri.png'
import { isGameState } from '../Types'
import { useGwentGame } from './context/GwentGameContext'

function CardHtml({ card_ID }) {
    return (
    <div>
        <button className="card-button">
            <img src={card_ID} className="card-image"/>
        </button>
    </div>
    );
}


export const Play = () => {
  const { gameState, setGameState } = useGwentGame();
  const [card, setCard] = useState<Card | undefined>(undefined)

  const start = async () => {
    const response = await fetch("/start", { method: "GET" });
    const card = await response.json();
    setCard(card);
  }

  return <>
    <h1>Vite + React</h1>
    <div>
      <button onClick={start}>
        response is {card?.cardName}
      </button>
      <CardHtml card_ID={$card?.cardName[0]} />
    </div>
  </>

};
