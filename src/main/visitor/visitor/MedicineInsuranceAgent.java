package main.visitor.visitor;

import main.visitor.person.JuridicalPerson;
import main.visitor.person.PhysicalPerson;

public class MedicineInsuranceAgent implements InsuranceAgentVisitor {

    @Override
    public void visit(PhysicalPerson physicalPerson) {
        System.out.printf("Уважаемый %s, купите страховку жизни  здоровья, у меня условия лучше всех%n", physicalPerson.name());
    }

    @Override
    public void visit(JuridicalPerson juridicalPerson) {
        System.out.printf("%s, купите ДМС для своих сотрудников, у меня условия лучше всех%n", juridicalPerson.fullName());
    }

}
