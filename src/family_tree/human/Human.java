package family_tree.human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private LocalDate dob, dad;
    private Gender gender;
    private List<Human>children;
    private int age;
    private Human mother, father;

    public Human(String name, LocalDate dob, LocalDate dad, Gender gender, int age, Human mother, Human father) {
        this.name = name;
        this.dob = dob;
        this.dad = dad;
        this.gender = gender;
        this.age = age;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
    }
    public boolean addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
            return true;
        }
        return false;
    }

    public boolean addParent(Human parent) {
        if (parent.getGender().equals(Gender.Male)) {
            setFather(parent);
        } else if (parent.getGender().equals(Gender.Female)){
            setMother(parent);
        }
        return true;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDad() {
        return dad;
    }

    public void setDad(LocalDate dad) {
        this.dad = dad;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getParents() {
        List<Human> list = new ArrayList<>(2);
                if (father != null) {
                    list.add(father);
        }
                if (mother != null) {
                    list.add(mother);
        }
        return list;
    }

    @Override
    public String toString() {
        return getInfo;
    }

    public String getInfo() {
        StringBuilder sbuild = new StringBuilder();
        sbuild.append("Имя: ");
        sbuild.append(name);
        sbuild.append(", пол: ");
        sbuild.append(getGender());
        sbuild.append(", возраст: ");
        sbuild.append(age);

    }
}

