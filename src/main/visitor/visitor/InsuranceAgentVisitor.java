package main.visitor.visitor;

import main.visitor.person.JuridicalPerson;
import main.visitor.person.PhysicalPerson;

public interface InsuranceAgentVisitor {

    void visit(PhysicalPerson physicalPerson);

    void visit(JuridicalPerson juridicalPerson);

}
