import { useGwentGame } from "./context/GwentGameContext";
import { Play } from "./Play";
import { Start } from "./Start";

export const Gwent = () => {
    const { gameState } = useGwentGame();
    console.log( gameState);
    return gameState ? <Play /> : <Start />;
};

//export default Start;