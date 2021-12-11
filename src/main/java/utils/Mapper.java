package utils;

public interface Mapper<Domain, Dto> {
    Domain toDomain(Dto dto);
    Dto fromDomain(Domain domain);
}
