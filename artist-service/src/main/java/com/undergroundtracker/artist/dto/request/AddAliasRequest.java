package com.undergroundtracker.artist.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddAliasRequest {
  @NotBlank(message = "Alias is required")
  @Size(max = 100, message = "Alias must be 100 characters or fewer")
  private String alias;

  @Size(max = 255, message = "Description must be 255 characters or fewer")
  private String description;
}
