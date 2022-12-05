package cavett.springframework.spring5jokesappv2.services;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
    
}
