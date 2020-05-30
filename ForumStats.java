package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOverEqual40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println("-------------------------------------------------");
        System.out.println("Average number of posts of users over or equal to 40 yo: " + avgOverEqual40);

        double avgUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println("-------------------------------------------------");
        System.out.println("Average number of posts of users under 40 yo: " + avgUnder40);
    }
}