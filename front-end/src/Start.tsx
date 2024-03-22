import React from 'react'
import { useState } from 'react'
import { useGwentGame } from './context/GwentGameContext'
import { isGameState } from '../Types'
import './style/Play.css'


export const Start = () => {
  const { gameState, setGameState } = useGwentGame();
    console.log(gameState)

  const startGame = async () => {
    const response = await fetch("/gwent/api/start", { method: "GET" });
    const game = await response.json();
    setGameState(game);
  }

  return <>
    <div>
      <button onClick={startGame}>Start Game {gameState?.cards[0].cardName}</button>
    </div>
  </>
};
