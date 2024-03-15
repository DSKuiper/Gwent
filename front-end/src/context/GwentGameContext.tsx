import { createContext, useContext, useState } from "react";
import { GameState } from "../../types";

type ContextType = {
    gameState: GameState | undefined,
    setGameState: (gameState: GameState) => void;
}

const GwentGameContext = createContext<ContextType>({
    gameState: undefined,
    setGameState() { },
});

type Props = React.PropsWithChildren;

export const GwentGameProvider = (props: Props) => {
    const { children } = props;

    const [gameState, setGameState] = useState<GameState | undefined>(undefined);

    return <GwentGameContext.Provider value={{
        gameState: gameState,
        setGameState: setGameState
    }}>{children}</GwentGameContext.Provider>
}

export const useGwentGame = () => {
    const context = useContext(GwentGameContext);

    if (context === undefined) {
        throw new Error('useGwentGame must be used within a GwentGameProvider');
    }

    return context;
}
