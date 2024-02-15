package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("ES")
public class I18nSpanishService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hola Muchacho! - ES";
    }
}
