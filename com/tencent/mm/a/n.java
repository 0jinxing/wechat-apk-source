package com.tencent.mm.a;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

public final class n
{
  private static String bytesToHex(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = new char[16];
    char[] tmp6_5 = arrayOfChar1;
    tmp6_5[0] = 48;
    char[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 49;
    char[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 50;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 51;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 52;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 53;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 54;
    char[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 55;
    char[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 56;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 57;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 97;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 98;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 99;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 100;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 101;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 102;
    tmp90_84;
    int i = paramArrayOfByte.length;
    char[] arrayOfChar2 = new char[i * 2];
    int j = 0;
    int n;
    for (int k = 0; j < i; k = n + 1)
    {
      int m = paramArrayOfByte[j];
      n = k + 1;
      arrayOfChar2[k] = ((char)arrayOfChar1[(m >>> 4 & 0xF)]);
      arrayOfChar2[n] = ((char)arrayOfChar1[(m & 0xF)]);
      j++;
    }
    return new String(arrayOfChar2);
  }

  public static String getSHA1(String paramString)
  {
    MessageDigest localMessageDigest = MessageDigest.getInstance("SHA1");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localByteArrayOutputStream.write(paramString.getBytes("UTF-8"));
    return bytesToHex(localMessageDigest.digest(localByteArrayOutputStream.toByteArray()));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.n
 * JD-Core Version:    0.6.2
 */