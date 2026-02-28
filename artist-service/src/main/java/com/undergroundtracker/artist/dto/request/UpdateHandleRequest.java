package com.undergroundtracker.artist.dto.request;

import com.undergroundtracker.common.enums.HandleType;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateHandleRequest {
  @NotNull(message = "Handle type is required")
  private HandleType handleType;
  @NotNull(message = "Active status is required")
  private Boolean active;
}
