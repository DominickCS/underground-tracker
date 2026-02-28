package com.undergroundtracker.common.events.payload;

import com.undergroundtracker.common.enums.HandleEventType;
import com.undergroundtracker.common.enums.HandleType;
import com.undergroundtracker.common.enums.Platform;

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
  private HandleEventType handleEventType;
}
