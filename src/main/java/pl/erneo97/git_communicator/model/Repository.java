package pl.erneo97.git_communicator.model;

import java.time.LocalDate;

public record Repository(
        String fullName,
        String description,
        String cloneUrl,
        long starts,
        LocalDate createdAt
) {
}
