package io.cellulant.gbp.repositories;

import io.cellulant.gbp.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
}
