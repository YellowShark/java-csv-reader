package data.services.mapper;

import data.services.csv.model.HumanDto;
import data.services.generator.IdGenerator;
import domain.model.Human;
import domain.model.Subdivision;
import utils.Mapper;

/**
 * Class for data mapping.
 */
public class HumanMapper implements Mapper<Human, HumanDto> {
    final IdGenerator generator = new IdGenerator();

    /**
     * Transforms DTO object to the Domain.
     * @param dto - HumanDto object.
     * @return - Human domain object.
     */
    @Override
    public Human toDomain(HumanDto dto) {
        var subdivision = new Subdivision(generator.generateNewId(), dto.getSubdiv());
        return new Human(dto.getId(), dto.getName(), dto.getSex(), dto.getDateOfBirth(), subdivision, dto.getSalary());
    }

    /**
     * Transforms Domain object to the DTO.
     * @param domain - Human object.
     * @return - HumanDto object.
     */
    @Override
    public HumanDto fromDomain(Human domain) {
        return new HumanDto(domain.id(), domain.name(), domain.sex(), domain.dateOfBirth(), domain.subdiv().name(), domain.salary());
    }
}
