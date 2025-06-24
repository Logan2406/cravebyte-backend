package com.cravebyte.cravebyte_backend.dao;

import com.cravebyte.cravebyte_backend.entities.IdCounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IdCounterRepository extends JpaRepository<IdCounter, UUID> {

    @Query("UPDATE IdCounter c SET c.lastNum = :next WHERE c.prefix = :prefix")
    void updateLastNumber(@Param("prefix") String prefix, @Param("next") Integer next);

    Optional<IdCounter> findByPrefix(String prefix);
}
