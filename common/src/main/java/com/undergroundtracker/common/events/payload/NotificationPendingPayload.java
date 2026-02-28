package com.undergroundtracker.common.events.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationPendingPayload {
  private String notificationId;
  private String userId;
  private String artistId;
  private String activityEventId;
  private ActivityClassification classification;
  private String contentUrl;
  private String message;
}
