package main.visitor;

import main.visitor.person.JuridicalPerson;
import main.visitor.person.Person;
import main.visitor.person.PhysicalPerson;
import main.visitor.visitor.AutoInsuranceAgent;
import main.visitor.visitor.InsuranceAgentVisitor;
import main.visitor.visitor.MedicineInsuranceAgent;

public class Demo {
    public static void main(String[] args) {
        Person ivan = new PhysicalPerson("Иван");
        Person hornsAndHooves = new JuridicalPerson("Рога и копыта");

        InsuranceAgentVisitor autoRenessanceAgent = new AutoInsuranceAgent();
        InsuranceAgentVisitor medicineRGSAgent = new MedicineInsuranceAgent();

        ivan.accept(autoRenessanceAgent);
        ivan.accept(medicineRGSAgent);
        hornsAndHooves.accept(autoRenessanceAgent);
        hornsAndHooves.accept(medicineRGSAgent);
    }

}
