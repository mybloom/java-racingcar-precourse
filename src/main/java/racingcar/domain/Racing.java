package racingcar.domain;

import java.util.List;

public class Racing {
	List<Car> racingCar;
	int racingCount;
	List<Integer> speedList;

	public Racing(List<Car> racingCar, int racingCount) {
		this.racingCar = racingCar;
		this.racingCount = racingCount;
	}


}
