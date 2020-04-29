/*Klasę SchoolDirectory z metodą main.
Klasę Principal, która będzie reprezentowała dyrektora szkoły.
Klasę School, która będzie reprezentowała szkołę, a w niej pole (typu ArrayList), które będzie przechowywało listę liczb uczniów w poszczególnych klasach.
Wewnątrz metody main stwórz mapę przyporządkowującą szkoły do dyrektorów.
Dodaj do mapy kilka wpisów - przykładowych dyrektorów i szkół.
Wykorzystując pętlę for-each, wyświetl informacje o dyrektorach placówek, nazwie szkoły którą kierują, oraz o łącznej liczbie uczniów w każdej szkole.*/

package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();

        Principal james = new Principal("James H");
        Principal Kirk = new Principal("Kirk H");
        Principal Cliff = new Principal("Cliff B");
        Principal lars = new Principal("Lars U");

        School first = new School(23, 25, 24);
        School second = new School(21, 20, 26);
        School third = new School(24, 23, 25);
        School fourth = new School(26, 21, 25);

        principalSchoolMap.put(james, first);
        principalSchoolMap.put(Kirk, second);
        principalSchoolMap.put(Cliff, third);
        principalSchoolMap.put(lars, fourth);

        for (Map.Entry<Principal, School> principalSchoolEntry : principalSchoolMap.entrySet()) {
            System.out.println("Principal: " + principalSchoolEntry.getKey().getName() + ", number of students in 1, 2 and 3 class, respectively: " + principalSchoolEntry.getValue().getNumberOfStudents());
        }
    }
}
