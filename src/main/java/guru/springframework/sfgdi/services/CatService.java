package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("petService")
@Profile("CAT")
public class CatService implements PetService{
    @Override
    public String whatPet() {
        return "I'm a Cat, and I'm fabolous";
    }
}
