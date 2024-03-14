import { useGwentGame } from "./context/GwentGameContext";
import { Play } from "./Play";
import { Start } from "./Start";

export const Gwent = () => {
    const { useGwentGame } = useGwentGame();
    return gwentGame ? <Play /> : <Start />;
};

export default Start;