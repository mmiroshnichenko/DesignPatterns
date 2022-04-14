package net.mmiroshnichenko.basepatterns.behavioral.observer;

public class Application {
    public static void main(String[] args) {
        Blogger blogger = new Blogger();

        blogger.addPost("First post");
        blogger.addPost("Second post");

        Observer firstFollower = new Follower("Mykhaylo Myroshnychenko");
        Observer secondFollower = new Follower("Ivan Mazepa");

        blogger.addObserver(firstFollower);
        blogger.addObserver(secondFollower);

        blogger.addPost("Third post");
    }
}
