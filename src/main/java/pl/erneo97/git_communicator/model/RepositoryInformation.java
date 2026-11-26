package pl.erneo97.git_communicator.model;

import java.time.LocalDate;

public record RepositoryInformation(
        String fullName,
        String description,
        String cloneUrl,
        long starts,
        LocalDate createdAt
) {
}
