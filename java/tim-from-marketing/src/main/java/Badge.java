import static java.lang.String.format;

class Badge {

    private static final String OWNER = "OWNER";

    public String print(Integer id, String name, String department) {
        if(department == null) return printOwner(id, name);
        else if(id == null) return printNewEmployee(name, department);
        else return format("[%s] - %s - %s", id, name, department.toUpperCase());
    }

    public String printNewEmployee(String name, String department) {
        return format("%s - %s", name, department.toUpperCase());
    }

    public String printOwner(Integer id, String name) {
        if(id != null) return format("[%s] - %s - %s", id, name, OWNER);
        else return format("%s - %s", name, OWNER);
    }
}
