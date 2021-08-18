/*
 * Project Jian
 * Morse Code
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.jian;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<MorseCode> list = new HashSet<>();
		MorseCodeFactory.buildRoman(list);
		MorseCodeFactory.buildNumeral(list);
		//Collections.sort(list);
		for (MorseCode m : list) {
			System.out.println(m.getLetter() + "\t" + m.toString());
		}

		byte[] code = MorseCodeUtil.encode("kang heum".toLowerCase().toCharArray(), list);
		for (byte b : code) {
			switch (b) {
				case MorseCode.SHORT:
					System.out.print('*');
					break;
				case MorseCode.LONG:
					System.out.print('-');
					break;
				case MorseCode.SPACE:
					System.out.print(' ');
					break;
				case MorseCode.SPACE_LETTER:
					System.out.print("   ");
					break;
				case MorseCode.SPACE_WORD:
					System.out.print("       ");
					break;
			}
		}
		System.out.println();
		System.out.println("--------------------");

		System.out.println(MorseCodeUtil.decode(code, list));

		System.out.println(MorseCodeUtil.decode("* *-** * -**-", list));
	}
}
