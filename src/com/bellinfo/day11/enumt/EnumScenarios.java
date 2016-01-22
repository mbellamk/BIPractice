package com.bellinfo.day11.enumt;

public class EnumScenarios {

	public static void main(String[] args) {
		System.out.println(Week.values());
		System.out.println(Week.SUNDAY);
		Week[] weekDays = Week.values();
		for (Week s : weekDays) {
			System.out.println(s.toString());
			System.out.println();
		}
	}

}

enum Week {
	SUNDAY(1, "Funday"), MONDAY(2, "Lazy1"), TUESDAY(3, "Lazy2"), WEDNESDAY(4,
			"Lazy3"), THURSDAY(5, "Lazy4"), FRIDAY(6, "Lazy5"), SATURDAY(7,
			"Lazy6");
	int day;
	String desc;

	Week(int day) {
		this.day = day;
	}

	Week(int day, String desc) {
		this.day = day;
		this.desc = desc;
	}

	@Override
	public String toString() {
		System.out.println("Day: " + day + ", Description:" + desc);
		return super.toString();
	}

}