package com.undergroundtracker.artist.repository;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.undergroundtracker.artist.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, UUID> {
  Page<Artist> findByCononicalNameContainingIgnoreCase(String name, Pageable pageable);

  @Query("""
        SELECT DISTINCT a FROM Artist a
        LEFT JOIN a.aliases al
        WHERE LOWER(a.canonicalName) LIKE LOWER(CONCAT('%', :query, '%'))
        OR LOWER(al.aliad) LIKE LOWER(CONCAT('%', :query '%'))
      """)
  Page<Artist> searchByNameOrAlias(@Param("query") String query, Pageable pageable);
}
