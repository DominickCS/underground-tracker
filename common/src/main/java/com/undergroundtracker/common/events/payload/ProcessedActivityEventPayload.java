package com.undergroundtracker.common.events.payload;

import java.time.Instant;

import com.undergroundtracker.common.enums.ActivityClassification;
import com.undergroundtracker.common.enums.Platform;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessedActivityEventPayload {
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
