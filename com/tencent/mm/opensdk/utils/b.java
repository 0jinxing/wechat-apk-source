package com.tencent.mm.opensdk.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

public final class b
{
  public static final String c(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128071);
    char[] arrayOfChar = new char[16];
    char[] tmp11_10 = arrayOfChar;
    tmp11_10[0] = 48;
    char[] tmp16_11 = tmp11_10;
    tmp16_11[1] = 49;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[2] = 50;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[3] = 51;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[4] = 52;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[5] = 53;
    char[] tmp41_36 = tmp36_31;
    tmp41_36[6] = 54;
    char[] tmp47_41 = tmp41_36;
    tmp47_41[7] = 55;
    char[] tmp53_47 = tmp47_41;
    tmp53_47[8] = 56;
    char[] tmp59_53 = tmp53_47;
    tmp59_53[9] = 57;
    char[] tmp65_59 = tmp59_53;
    tmp65_59[10] = 97;
    char[] tmp71_65 = tmp65_59;
    tmp71_65[11] = 98;
    char[] tmp77_71 = tmp71_65;
    tmp77_71[12] = 99;
    char[] tmp83_77 = tmp77_71;
    tmp83_77[13] = 100;
    char[] tmp89_83 = tmp83_77;
    tmp89_83[14] = 101;
    char[] tmp95_89 = tmp89_83;
    tmp95_89[15] = 102;
    tmp95_89;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      paramArrayOfByte = ((MessageDigest)localObject).digest();
      int i = paramArrayOfByte.length;
      localObject = new char[i * 2];
      int j = 0;
      int n;
      for (int k = 0; j < i; k = n + 1)
      {
        int m = paramArrayOfByte[j];
        n = k + 1;
        localObject[k] = ((char)arrayOfChar[(m >>> 4 & 0xF)]);
        localObject[n] = ((char)arrayOfChar[(m & 0xF)]);
        j++;
      }
      paramArrayOfByte = new java/lang/String;
      paramArrayOfByte.<init>((char[])localObject);
      AppMethodBeat.o(128071);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(128071);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.utils.b
 * JD-Core Version:    0.6.2
 */