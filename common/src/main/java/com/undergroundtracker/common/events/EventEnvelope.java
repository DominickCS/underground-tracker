package com.undergroundtracker.common.events;

import java.time.Instant;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventEnvelope<T> {
  @Builder.Default
  private String eventId = UUID.randomUUID().toString();

  private String eventType;

  @Builder.Default
  private Instant timestamp = Instant.now();

  private T payload;
}
