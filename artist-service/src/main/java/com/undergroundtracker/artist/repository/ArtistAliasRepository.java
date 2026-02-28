package com.undergroundtracker.artist.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.undergroundtracker.artist.entity.ArtistAlias;

public interface ArtistAliasRepository extends JpaRepository<ArtistAlias, UUID> {

  // Used to enforce uniqueness at the service layer before attempting to save
  boolean existsByArtistIdAndAliasIgnoreCase(UUID artistId, String alias);

}
