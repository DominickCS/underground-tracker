package com.undergroundtracker.artist.entity;

import com.undergroundtracker.common.enums.HandleType;
import com.undergroundtracker.common.enums.Platform;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "artist_handles", uniqueConstraints = @UniqueConstraint(columnNames = { "platform", "handle" }))
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ArtistHandle {

  @Id
  @EqualsAndHashCode.Include
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "artist_id", nullable = false)
  @ToString.Exclude
  private Artist artist;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Platform platform;

  @Column(nullable = false)
  private String handle;

  @Enumerated(EnumType.STRING)
  @Column(name = "handle_type", nullable = false)
  private HandleType handleType;

  @Column(nullable = false)
  @Builder.Default
  private boolean active = true;

  @PrePersist
  public void prePersist() {
    if (id == null)
      id = UUID.randomUUID();
  }
}
