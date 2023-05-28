package main.visitor.person;

import main.visitor.visitor.InsuranceAgentVisitor;

public record JuridicalPerson(String fullName) implements Person {

    @Override
    public void accept(InsuranceAgentVisitor insuranceAgent) {
        insuranceAgent.visit(this);
    }
}
