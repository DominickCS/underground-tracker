package com.undergroundtracker.common.events.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArtistHandleEventPayload {
  private String artistId;
  private String handleId;
  private Platform platform;
  private String handle;
  private HandleType handleType;
  private boolean active;
  private HandleEventType handleEventyType;
}
