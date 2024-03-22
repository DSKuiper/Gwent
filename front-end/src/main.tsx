import React from 'react'
import ReactDOM from 'react-dom/client'
import './style/index.css'
import { GwentGameProvider } from './context/GwentGameContext'
import { Gwent } from './Gwent'

ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
        <GwentGameProvider>
            <Gwent />
        </GwentGameProvider>
  </React.StrictMode>,
)
