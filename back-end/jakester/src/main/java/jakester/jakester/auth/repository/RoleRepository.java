package	jakester.jakester.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jakester.jakester.auth.entity.ERole;
import jakester.jakester.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
