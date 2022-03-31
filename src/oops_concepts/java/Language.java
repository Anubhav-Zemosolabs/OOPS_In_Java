package oops_concepts.java;

public interface Language {
    void setName(String Name);
    void getName();
}

class Programming_Language implements Language{
    String Name;
    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public void getName() {
        System.out.println("Programming Language: " + Name);
    }
}

class Main{
    public static void main(String[] args) {
        Programming_Language language = new Programming_Language();
        language.setName("Java");
        language.getName();
    }
}
