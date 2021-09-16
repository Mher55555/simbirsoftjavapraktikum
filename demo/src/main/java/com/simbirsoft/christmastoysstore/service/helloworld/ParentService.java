import com.simbirsoft.christmastoysstore.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParentService {
    public String getHello();
    public Parent findById();
    public List<Parent> findAll();
    public Parent saveUser();
    public void deleteById();
}
