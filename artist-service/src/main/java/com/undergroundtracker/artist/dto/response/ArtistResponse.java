package com.undergroundtracker.artist.dto.response;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class ArtistResponse {
  private UUID id;
  private String canonicalName;
  private String bio;
  private Instant createdAt;
  private List<ArtistAliasResponse> aliases;
  private List<ArtistHandleResponse> handles;
}
