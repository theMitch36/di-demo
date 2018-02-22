package guru.springframework.services;

import org.springframework.stereotype.Component;


@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - primary greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer GruBdienst";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primrio";
    }
}
