package net.mmiroshnichenko.basepatterns.behavioral.iterator;

public class UserRunner {
    public static void main(String[] args) {
        String[] roles = {"User", "Support", "Admin", "SuperAdmin"};

        User adminUser = new User("Ivan Mazepa", roles);

        Iterator iterator = adminUser.getIterator();
        System.out.println("User: " + adminUser.getName());
        System.out.println("Roles: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
