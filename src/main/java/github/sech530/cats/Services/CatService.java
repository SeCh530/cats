package github.sech530.cats.Services;

import github.sech530.cats.Models.Cat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatService {
    void add(Cat cat);

    List<Cat> getAll();

    void update(int id, String name, int age);

    void delete(int id);
}
