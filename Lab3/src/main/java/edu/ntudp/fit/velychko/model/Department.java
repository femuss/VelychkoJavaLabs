package edu.ntudp.fit.velychko.model;

import java.util.ArrayList;
import java.util.List;

public class Department extends StructuralUnit {
    public Department(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    private List<Group> groups = new ArrayList<>();
    public void addGroup(Group group) {
        groups.add(group);
    }
    public boolean removeGroup(Group group) {
        return groups.remove(group);
    }
    public List<Group> getGroups() { return groups; }
    public void setGroups(List<Group> groups) { this.groups = groups; }
    public void printInfo() {
        System.out.println("Name of the department: " + name +
                "\nName of the head of the department:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }
}
