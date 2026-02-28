package com.undergroundtracker.artist.dto.response;

import java.util.UUID;

import com.undergroundtracker.common.enums.HandleType;
import com.undergroundtracker.common.enums.Platform;

import lombok.Data;

@Data
public class ArtistHandleResponse {
  private UUID id;
  private Platform platform;
  private String handle;
  private HandleType handleType;
  private boolean active;
}
