/*
 * Project Jian
 * Morse Code
 *
 * Copyright (c) 2014-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.jian;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Elex on 2014-07-12.
 */
public class MorseCodeUtil {

	public static byte[] encode(char[] chars, Set<MorseCode> dict) {
		ArrayList<Byte> out = new ArrayList<Byte>();
		for (char c : chars) {
			if (c == ' ') {
				out.add(MorseCode.SPACE_WORD);
			}
			for (MorseCode m : dict) {
				if (c == m.getLetter()) {
					for (byte b : m.getMorseCode()) {
						out.add(b);
						out.add(MorseCode.SPACE);
					}
					if (out.get(out.size() - 1) == MorseCode.SPACE) {
						out.remove(out.size() - 1);
					}
					out.add(MorseCode.SPACE_LETTER);
					break;
				}
			}
		}

		byte[] data = new byte[out.size()];
		for (int i = 0; i < data.length; i++) {
			data[i] = out.get(i);
		}
		return data;
	}

	public static String decode(byte[] code, Set<MorseCode> dict) {
		ArrayList<Byte> buffer = new ArrayList<>();
		StringBuilder str = new StringBuilder();
		for (byte b : code) {
			switch (b) {
				case MorseCode.SHORT:
				case MorseCode.LONG:
					buffer.add(b);
					break;
				case MorseCode.SPACE:
					break;
				case MorseCode.SPACE_LETTER:
					str.append(parse(buffer, dict));
					buffer.clear();
					break;
				case MorseCode.SPACE_WORD:
					str.append(parse(buffer, dict));
					str.append(' ');
					buffer.clear();
					break;
			}
		}

		// 버퍼에 남아있는 데이터 처리
		if (buffer.size() > 0) {
			str.append(parse(buffer, dict));
		}

		return str.toString();
	}

	private static char parse(ArrayList<Byte> buffer, Set<MorseCode> dict) {
		MorseCode search = new MorseCode(buffer);
		for (MorseCode m : dict) {
			if (m.equals(search)) {
				return m.getLetter();
			}
		}
		return '□';
	}

	public static String decode(String code, Set<MorseCode> dict) {
		ArrayList<Byte> bytes = new ArrayList<Byte>();
		for (char c : code.toCharArray()) {
			switch (c) {
				case '*':
					bytes.add(MorseCode.SHORT);
					break;
				case '-':
					bytes.add(MorseCode.LONG);
					break;
				case ' ':
					if (bytes.get(bytes.size() - 1) == MorseCode.SPACE_LETTER) {
						bytes.remove(bytes.size() - 1);
						bytes.add(MorseCode.SPACE_WORD);
					} else {
						bytes.add(MorseCode.SPACE_LETTER);
					}

					break;
			}
		}
		byte[] out = new byte[bytes.size()];
		for (int i = 0; i < out.length; i++) {
			out[i] = bytes.get(i);
		}

		return decode(out, dict);
	}
}
