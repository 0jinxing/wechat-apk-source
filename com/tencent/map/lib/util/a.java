package com.tencent.map.lib.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

public class a
{
  static final byte[] a = { -128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

  public static String a(File paramFile)
  {
    AppMethodBeat.i(98240);
    Object localObject1 = new FileInputStream(paramFile);
    Object localObject2 = new byte[1024];
    paramFile = new char[16];
    paramFile[0] = 48;
    paramFile[1] = 49;
    paramFile[2] = 50;
    paramFile[3] = 51;
    paramFile[4] = 52;
    paramFile[5] = 53;
    paramFile[6] = 54;
    paramFile[7] = 55;
    paramFile[8] = 56;
    paramFile[9] = 57;
    paramFile[10] = 97;
    paramFile[11] = 98;
    paramFile[12] = 99;
    paramFile[13] = 100;
    paramFile[14] = 101;
    paramFile[15] = 102;
    paramFile;
    MessageDigest localMessageDigest;
    int i;
    try
    {
      localMessageDigest = MessageDigest.getInstance("MD5");
      while (true)
      {
        i = ((FileInputStream)localObject1).read((byte[])localObject2, 0, 1024);
        if (i == -1)
          break;
        localMessageDigest.update((byte[])localObject2, 0, i);
      }
    }
    catch (Exception paramFile)
    {
      paramFile = null;
    }
    while (true)
    {
      AppMethodBeat.o(98240);
      return paramFile;
      ((FileInputStream)localObject1).close();
      localObject1 = localMessageDigest.digest();
      localObject2 = new char[32];
      int j = 0;
      for (i = 0; i < 16; i++)
      {
        int k = localObject1[i];
        int m = j + 1;
        localObject2[j] = ((char)paramFile[(k >>> 4 & 0xF)]);
        j = m + 1;
        localObject2[m] = ((char)paramFile[(k & 0xF)]);
      }
      paramFile = new String((char[])localObject2);
    }
  }

  public static String a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98239);
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
      localObject = new char[32];
      int i = 0;
      int m;
      for (int j = 0; i < 16; j = m + 1)
      {
        int k = paramArrayOfByte[i];
        m = j + 1;
        localObject[j] = ((char)arrayOfChar[(k >>> 4 & 0xF)]);
        localObject[m] = ((char)arrayOfChar[(k & 0xF)]);
        i++;
      }
      paramArrayOfByte = new java/lang/String;
      paramArrayOfByte.<init>((char[])localObject);
      AppMethodBeat.o(98239);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.util.a
 * JD-Core Version:    0.6.2
 */