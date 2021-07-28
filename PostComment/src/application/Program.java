package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful cuntry!",
                12 );
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
        System.out.println("-------------");

        Post p2 = new Post(sdf.parse("28/08/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);
        System.out.println(p2);
    }
}
