package ana.gov.br.developer.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ana.gov.br.developer.entity.Car;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
}