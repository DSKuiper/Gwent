import { useState } from 'react';
import './App.css';
import React from 'react';
import { Game } from '../Types';
import ciri from "./assets/ciri.png";

function Card({ card_ID }) {
    return (
    <button><img src={card_ID}/></button>
    );
}

function App() {
  const [game, setGame] = useState<Game | undefined>(undefined)

  const test = async () => {
    const response = await fetch("/test", { method: "GET" });
    const game = await response.json();
    setGame(game);
  }

  return <>
    <h1>Vite + React</h1>
    <div className="card">
      <button onClick={test}>
        response is {game?.input}
      </button>
      <Card card_ID={ciri}/>
    </div>
  </>

}

export default App
