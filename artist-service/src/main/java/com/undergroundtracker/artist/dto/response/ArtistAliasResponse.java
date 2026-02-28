package com.undergroundtracker.artist.dto.response;

import java.util.UUID;

import lombok.Data;

@Data
public class ArtistAliasResponse {
  private UUID id;
  private String alias;
  private String description;
}
