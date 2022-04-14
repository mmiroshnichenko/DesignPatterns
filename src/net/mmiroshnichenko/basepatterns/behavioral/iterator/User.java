package net.mmiroshnichenko.basepatterns.behavioral.iterator;

public class User implements Collection{
    private String name;
    private String[] roles;

    public User(String name, String[] roles) {
        this.name = name;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    @Override
    public Iterator getIterator() {
        return new RolesIterator();
    }

    private class RolesIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < roles.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return roles[index++];
        }
    }
}
