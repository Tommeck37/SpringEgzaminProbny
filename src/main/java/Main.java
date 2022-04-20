import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 1, 8);
        LinkedList<Hero> bohatarowie = new LinkedList<>();
        bohatarowie.add(new Hero("Mariano", 150L, date, "793262713"));
        bohatarowie.add(new Hero("Tadeusz", 200L, LocalDate.of(199, Month.APRIL, 20),"793262713"));
        bohatarowie.add(new Hero("Como", 300L, LocalDate.of(1979, Month.AUGUST,15),"71321311"));

        sort(bohatarowie, Hero::compareTo);
//        sort(bohatarowie);

        for (int i = 0; i < bohatarowie.size(); i++) {
            System.out.println(bohatarowie.get(i).toString());
        }
    }
}
