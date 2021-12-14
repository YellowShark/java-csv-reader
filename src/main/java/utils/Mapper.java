package utils;

/**
 * Interface for mapper.
 * @param <Domain> class for a Domain object.
 * @param <Dto> class for a Data Transfer Object.
 */
public interface Mapper<Domain, Dto> {
    Domain toDomain(Dto dto);
    Dto fromDomain(Domain domain);
}
