import { useState } from 'react'
import './App.css'
import React from 'react'
import { Game } from '../Types'


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
    </div>
  </>

}

export default App
