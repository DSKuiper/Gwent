import React from 'react'
import { useState } from 'react'
import { useGwentGame } from './context/GwentGameContext'
import { isGameState } from '../Types'
import './Play.css'


export const Start = () => {
  const { gameState, setGameState } = useGwentGame();
  const [game, setGame] = useState<Game | undefined>(undefined)

  const startGame = async () => {
    const response = await fetch("/gwent/api/start", { method: "GET" });
    const game = await response.json();
    setGameState(game);
  }

  const test = async () => {
      const response = await fetch("/gwent/api/test", { method: "GET" });
      const game = await response.json();
      setGame(game);
  }


  return <>
    <div>
      <button onClick={startGame}>Start Game</button>
      <button onClick={test}>response is {game?.cardName}</button>
    </div>
  </>

};
