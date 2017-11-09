package com.telusko;

import java.util.Random;

public class AlienModel {
	private String name;
	private String age;
	private String address;
	private String allienId;

	public String getUserId() {
		return allienId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void generateUserId() {

		// The order of appearance for the name and 0 for Name appearing first,
		// 1 for age appearing first. // Note: nextInt(x) excludes x
		Random random = new Random();
		int randomOrder = random.nextInt(2);

		String nameText = name;
		if (name.length() > 4) {

			// If name is shorter than 5 letters (Id <=6), display it as it is,
			// otherwise, choose randomely between 4 and 8.
			int randomNameLength = random.nextInt(5) + 4;

			if (name.length() > randomNameLength) {
				nameText = name.substring(0, randomNameLength);
			}
		}

		if (randomOrder == 0) {
			allienId = nameText + age;
		} else {
			allienId = age + nameText;
		}

	}
}
