package com.undergroundtracker.artist.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "artists")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Artist {
  @Id
  @EqualsAndHashCode.Include
  private UUID id;

  @Column(name = "canonical_name", nullable = false)
  private String canonicalName;

  @Column(columnDefinition = "TEXT")
  private String bio;

  @CreationTimestamp
  @Column(name = "created_at", updatable = false)
  private Instant createdAt;

  @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, orphanRemoval = true)
  @Builder.Default
  private List<ArtistAlias> aliases = new ArrayList<>();

  @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, orphanRemoval = true)
  @Builder.Default
  private List<ArtistHandle> handles = new ArrayList<>();

  @PrePersist
  public void prePersist() {
    if (id == null)
      id = UUID.randomUUID();
  }

}
