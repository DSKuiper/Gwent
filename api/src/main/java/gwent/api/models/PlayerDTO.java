package gwent.api.models;

import gwent.domain.IGwent;

public class PlayerDTO {
    public HandDTO hand;
    public int player;

    public PlayerDTO(IGwent gwent, int player) {
        hand = new HandDTO(gwent, player);
        this.player = player;
    }
}
