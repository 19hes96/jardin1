package tekup.de.jardin.repositories;

import org.springframework.data.repository.CrudRepository;
import tekup.de.jardin.Entities.FeedbackEntity;

public interface FeedbackRepository extends CrudRepository<FeedbackEntity,Integer> {
}
