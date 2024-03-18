package repository;
import model.Diary;
import java.util.*;

public interface DiaryRepository {
    Diary save(Diary diary);
    List<Diary> findAll();
    Diary findById(String username);
    long count();
    void delete(String username);
    void delete(Diary diary);

}
