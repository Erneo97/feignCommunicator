package pl.erneo97.git_communicator.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.erneo97.git_communicator.model.GithubRepository;

@FeignClient(name ="githubcommunicator", url = "https://api.github.com")
public interface GithubClient {

    @GetMapping(value="/repos/{owner}/{repo}")
    GithubRepository getRepositoryInformation(@PathVariable("owner") String owner, @PathVariable("repo") String repo);

}
