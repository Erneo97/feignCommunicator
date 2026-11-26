package pl.erneo97.git_communicator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.erneo97.git_communicator.mapper.RepositoryMapper;
import pl.erneo97.git_communicator.model.Repository;
import pl.erneo97.git_communicator.service.RepositoryService;

@RestController()
@RequestMapping("/repositories")
@RequiredArgsConstructor()
public class RepositoryController {
    private final RepositoryService repositoryService;
    private final RepositoryMapper repositoryMapper;

    @GetMapping("/{owner}/{repository-name}")
    public Repository getRepository(@PathVariable("owner") String owner, @PathVariable("repository-name") String repositoryName) {
        return repositoryMapper.toRepository(repositoryService.getRepositoryInformation(owner, repositoryName));
    }
}
