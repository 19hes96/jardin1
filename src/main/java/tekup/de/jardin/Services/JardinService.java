package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.repositories.JardinRepository;

@Service
@AllArgsConstructor
public class JardinService {
    private JardinRepository jardinRepository ;
}
