package br.com.devdojo.repository;

import br.com.devdojo.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author William Suane for DevDojo on 6/27/17.
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsername(String username);
}
