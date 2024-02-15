package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("petService")
@Profile({"DOG, default"})
public class DogService implements PetService{
    @Override
    public String whatPet() {
        return "I'm a Dog! Cuddle me and play with me!";
    }
}
