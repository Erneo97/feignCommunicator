package pl.erneo97.git_communicator.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.erneo97.git_communicator.model.GithubRepository;
import pl.erneo97.git_communicator.model.Repository;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface RepositoryMapper {
    Repository toRepository(GithubRepository githubRepository);
}
