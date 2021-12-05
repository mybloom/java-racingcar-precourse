package racingcar.domain;

import static racingcar.utils.GameConstant.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import camp.nextstep.edu.missionutils.Randoms;

public class Racing {
	private List<Car> racingCar;
	private int racingCount;
	private List<Integer> speedList;

	public Racing(List<Car> racingCar, int racingCount) {
		this.racingCar = racingCar;
		this.racingCount = racingCount;
	}

	public void createSpeed() {
		Set<Integer> set = new HashSet<>();
		while (set.size() < racingCount) {
			set.add(Randoms.pickNumberInRange(SPEED_MIN_VALUE, SPEED_MAX_VALUE));
		}
		speedList = new ArrayList<>(set);
	}
}
