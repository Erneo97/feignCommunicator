package pl.erneo97.git_communicator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.erneo97.git_communicator.client.GithubClient;
import pl.erneo97.git_communicator.model.GithubRepository;

@Service
@RequiredArgsConstructor
public class RepositoryService {
    private final GithubClient githubClient;

    public GithubRepository getRepositoryInformation(String owner, String repo) {
        return githubClient.getRepositoryInformation(owner, repo);
    }
}
