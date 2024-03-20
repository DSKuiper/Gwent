package gwent.api.models;

import gwent.domain.IGwent;

public class PlayerDTO {
    public HandDTO hand;

    public PlayerDTO(IGwent gwent) {
        hand = new HandDTO(gwent);
    }
}
