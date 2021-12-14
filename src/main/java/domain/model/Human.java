package domain.model;

/**
 * Domain class for a human.
 */
public record Human(int id, String name, String sex, String dateOfBirth, Subdivision subdiv, int salary) { }

