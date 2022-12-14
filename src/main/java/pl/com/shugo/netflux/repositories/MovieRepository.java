package pl.com.shugo.netflux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.com.shugo.netflux.domain.Movie;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
