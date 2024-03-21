package gwent.api.models;


import gwent.domain.IGwent;

public class GameDTO {
    public PlayerDTO[] players;
    public BoardDTO board;

    public GameDTO(IGwent gwent) {
        players = new PlayerDTO[2];
        players[0] = new PlayerDTO(gwent, 1);
        players[1] = new PlayerDTO(gwent, 2);
        board = new BoardDTO(gwent);
    }
};
