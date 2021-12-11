package data.services.mapper;

import data.services.csv.model.HumanDto;
import data.services.generator.IdGenerator;
import domain.model.Human;
import domain.model.Subdivision;
import utils.Mapper;

public class HumanMapper implements Mapper<Human, HumanDto> {
    final IdGenerator generator = new IdGenerator();

    @Override
    public Human toDomain(HumanDto dto) {
        var subdivision = new Subdivision(generator.generateNewId(), dto.getSubdiv());
        return new Human(dto.getId(), dto.getName(), dto.getSex(), dto.getDateOfBirth(), subdivision, dto.getSalary());
    }

    @Override
    public HumanDto fromDomain(Human domain) {
        return new HumanDto(domain.id(), domain.name(), domain.sex(), domain.dateOfBirth(), domain.subdiv().name(), domain.salary());
    }
}
