package com.undergroundtracker.common.events.payload;

import java.time.Instant;
import java.util.Map;

import com.undergroundtracker.common.enums.Platform;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RawActivityEventPayload {
  private String artistHandleId;
  private String artistId;
  private Platform platform;
  private String activityUrl;
  private String activityType;
  private Map<String, Object> rawContent;
  private Instant capturedAt;
}
