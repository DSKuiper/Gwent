import React from 'react'
import { useState } from 'react'
import { Card } from '../Types'
import { isGameState } from '../Types'
import { useGwentGame } from './context/GwentGameContext'
import './Play.css'

function CardHtml({ card_ID }) {
    const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="card" id={`${card_ID}`} />
    </div>
    );
}

function PlayingField(/*{field}*/) {
    //const { gameState, setGameState } = useGwentGame();

    return (
    <div>
        <button className="field" disabled="disabled" /*id={`${field}`}*/ />
    </div>
    )
}

export const Play = () => {
  const { gameState, setGameState } = useGwentGame();

  return <>
    <div>
        <PlayingField />
    </div>
    <div>
        <span>
            <CardHtml card_ID={gameState?.cards[0].cardName} />
            <CardHtml card_ID={gameState?.cards[1].cardName} />
            <CardHtml card_ID={gameState?.cards[2].cardName} />
        </span>
    </div>
  </>

};
