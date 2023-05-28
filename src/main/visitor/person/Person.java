package main.visitor.person;

import main.visitor.visitor.InsuranceAgentVisitor;

public interface Person {

    void accept(InsuranceAgentVisitor insuranceAgent);

}
