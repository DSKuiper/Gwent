package gwent.domain;

import org.springframework.stereotype.Service;

@Service
public class GwentFactory implements IGwentFactory{

    @Override
    public Gwent createNewGame() {
        return new Gwent();
    }
}
