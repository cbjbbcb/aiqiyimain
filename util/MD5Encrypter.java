package util;

import java.security.MessageDigest;

/***
 * 
 * @author Sam <br />
 *         ���ܹ�����
 *
 */
public class MD5Encrypter {

	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	/***
	 * ʹ��MD5���м���
	 * 
	 * @param text
	 *            , ��Ҫ���ܵ�����
	 * @return, md5����
	 */
	public static String encrypt(String text) {
		byte[] input = text.getBytes();
		return encrypt(input);
	}

	/***
	 * ʹ��MD5���м���
	 * 
	 * @param input
	 *            ,��Ҫ���ܵ�byte����
	 * @return,md5����
	 */
	public static String encrypt(byte[] input) {
		try {
			// ���MD5ժҪ�㷨�� MessageDigest����
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// ʹ��ָ�����ֽڸ���ժҪ
			mdInst.update(input);
			// �������?
			byte[] md = mdInst.digest();
			// ������ת����ʮ����Ƶ��ַ����?
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = HEX_DIGITS[byte0 >>> 4 & 0xf];
				str[k++] = HEX_DIGITS[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}