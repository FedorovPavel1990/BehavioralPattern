package main.visitor.person;

import main.visitor.visitor.InsuranceAgentVisitor;

public record PhysicalPerson(String name) implements Person {

    @Override
    public void accept(InsuranceAgentVisitor insuranceAgent) {
        insuranceAgent.visit(this);
    }
}
