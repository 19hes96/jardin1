package tekup.de.jardin.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tekup.de.jardin.Entities.NotifEntity;
import tekup.de.jardin.repositories.NotifRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NotifService {
    private NotifRepository notifRepository ;

    public List<NotifEntity> listAllNotifs() {
        return notifRepository.findAll();
    }

    public Optional<NotifEntity> getNotifById(int id) {
        return notifRepository.findById(id);
    }

    public NotifEntity saveNotification (NotifEntity notification) {
        return notifRepository.save(notification);
    }

    public List<NotifEntity> deleteNotif(int id) {
        notifRepository.deleteById(id);
        return notifRepository.findAll();
    }
}
