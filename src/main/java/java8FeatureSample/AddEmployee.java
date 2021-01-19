package java8FeatureSample;

@FunctionalInterface
public interface AddEmployee {
    Employee createEmployee(String name, int salary);
}
