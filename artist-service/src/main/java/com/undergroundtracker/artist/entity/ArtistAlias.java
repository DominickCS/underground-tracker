package com.undergroundtracker.artist.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "artist_aliases", uniqueConstraints = @UniqueConstraint(columnNames = { "artist_id", "alias" }))
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ArtistAlias {

  @Id
  @EqualsAndHashCode.Include
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "artist_id", nullable = false)
  @ToString.Exclude
  private Artist artist;

  @Column(nullable = false)
  private String alias;

  // Optional — describes the context of the alias e.g. "Producer tag", "Early
  // career name"
  private String description;

  @PrePersist
  public void prePersist() {
    if (id == null)
      id = UUID.randomUUID();
  }
}
