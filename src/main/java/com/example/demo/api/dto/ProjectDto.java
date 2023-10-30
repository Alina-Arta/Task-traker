package com.example.demo.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    @NonNull
    Long id;
    @NonNull
    String name;
    @NonNull
    @JsonProperty("create_date")
    Instant createDate ;
}
