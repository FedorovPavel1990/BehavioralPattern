package main.visitor.visitor;

import main.visitor.person.JuridicalPerson;
import main.visitor.person.PhysicalPerson;

public class AutoInsuranceAgent implements InsuranceAgentVisitor {

    @Override
    public void visit(PhysicalPerson physicalPerson) {
        System.out.printf("Уважаемый %s, купите страховку ОСАГО и КАСКО, у меня условия лучше всех%n", physicalPerson.name());
    }

    @Override
    public void visit(JuridicalPerson juridicalPerson) {
        System.out.printf("%s, купите страховку ОСАГО и КАСКО, если застрахуете весь свой парк, сделаем скидку, у меня условия лучше всех%n", juridicalPerson.fullName());
    }

}
