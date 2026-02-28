package com.undergroundtracker.artist.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.undergroundtracker.artist.entity.ArtistHandle;
import com.undergroundtracker.common.enums.Platform;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArtistHandleRepository extends JpaRepository<ArtistHandle, UUID> {
  // Used by the Crawler Service to fetch all active handles — paginated
  Page<ArtistHandle> findByActiveTrue(Pageable pageable);

  // Used to enforce the unique constraint at the service layer before saving
  boolean existsByPlatformAndHandleIgnoreCase(Platform platform, String handle);

  // Fetch all handles for a specific artist — used in the full artist response
  List<ArtistHandle> findByArtistId(UUID artistId);

  // Fetch active handles for a specific platform — useful for targeted crawling
  List<ArtistHandle> findByPlatformAndActiveTrue(Platform platform);
}
