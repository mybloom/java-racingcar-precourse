package racingcar.domain;

public class Car implements Comparable<Car>{
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현




    @Override
    public int compareTo(Car o) {
        return this.position - o.position;
    }





}
