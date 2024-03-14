import { useState } from 'react'
import './App.css'
import React from 'react'
import { Card } from '../Types'
import ciri from './assets/ciri.png'

function CardHtml({ card_ID }) {
    return (
    <div>
        <button className="card-button">
            <img src={card_ID} className="card-image"/>
        </button>
    </div>
    );
}


function App() {
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

}

export default App
