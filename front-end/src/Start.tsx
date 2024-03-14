import React from 'react'
import { useState } from 'react'
import { useGwentGame } from './context/GwentGameContext'
import { isGameState } from '../Types'
import './Play.css'


export const Start = () => {
  const { gameState, setGameState } = useGwentGame();

  const startGame = async () => {
    const response = await fetch("/start", { method: "GET" });
    const game = await response.json();
    setGameState(game);
  }

  return <>
    <div>
      <button onClick={startGame}>Start Game</button>
    </div>
  </>

};
