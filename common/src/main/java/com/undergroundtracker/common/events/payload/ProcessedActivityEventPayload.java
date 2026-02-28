package com.undergroundtrakcer.common.events.payload;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessActivityEventPayload {
  private String activityEventId;
  private String rawEventId;
  private String artistId;
  private Platform platform;
  private ActivityClassification classification;
  private double relevanceScore;
  private String contentUrl;
  private boolean isDuplicate;
  private Instant eventTimestamp;
}
