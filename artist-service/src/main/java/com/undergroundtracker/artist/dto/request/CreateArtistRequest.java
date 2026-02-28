package com.undergroundtracker.artist.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateArtistRequest {
  @NotBlank(message = "Canonical name is required")
  @Size(max = 100, message = "Name must be 100 characters or fewer")
  private String canonicalName;

  @Size(max = 1000, message = "Bio must be 1000 characters or fewer")
  private String bio;
}
