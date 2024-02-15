package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"EN","default"})
public class I18nEnglishService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Welcome my dear - EN";
    }
}
