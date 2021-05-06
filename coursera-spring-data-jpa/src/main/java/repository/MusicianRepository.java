package repository;

import model.Musician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicianRepository extends JpaRepository<Musician, Long> {
}
