package pl.erneo97.git_communicator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record GithubRepository(
        @JsonProperty("full_name")
        String fullName,

        String description,

        @JsonProperty("clone_url")
        String cloneUrl,

        @JsonProperty("stargazers_count")
        long stars,

        @JsonProperty("created_at")
        LocalDateTime createdAt
) {
}
