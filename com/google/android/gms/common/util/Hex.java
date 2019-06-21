package com.google.android.gms.common.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Hex
{
  private static final char[] zzaaa = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final char[] zzzz = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };

  public static String bytesToColonDelimitedStringLowercase(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90206);
    if (paramArrayOfByte.length == 0)
    {
      paramArrayOfByte = new String();
      AppMethodBeat.o(90206);
    }
    while (true)
    {
      return paramArrayOfByte;
      char[] arrayOfChar = new char[paramArrayOfByte.length * 3 - 1];
      int i = 0;
      for (int j = 0; i < paramArrayOfByte.length - 1; j++)
      {
        int k = paramArrayOfByte[i] & 0xFF;
        int m = j + 1;
        arrayOfChar[j] = ((char)zzaaa[(k >>> 4)]);
        j = m + 1;
        arrayOfChar[m] = ((char)zzaaa[(k & 0xF)]);
        arrayOfChar[j] = ((char)58);
        i++;
      }
      i = paramArrayOfByte[(paramArrayOfByte.length - 1)] & 0xFF;
      arrayOfChar[j] = ((char)zzaaa[(i >>> 4)]);
      arrayOfChar[(j + 1)] = ((char)zzaaa[(i & 0xF)]);
      paramArrayOfByte = new String(arrayOfChar);
      AppMethodBeat.o(90206);
    }
  }

  public static String bytesToColonDelimitedStringUppercase(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90205);
    if (paramArrayOfByte.length == 0)
    {
      paramArrayOfByte = new String();
      AppMethodBeat.o(90205);
    }
    while (true)
    {
      return paramArrayOfByte;
      char[] arrayOfChar = new char[paramArrayOfByte.length * 3 - 1];
      int i = 0;
      for (int j = 0; i < paramArrayOfByte.length - 1; j++)
      {
        int k = paramArrayOfByte[i] & 0xFF;
        int m = j + 1;
        arrayOfChar[j] = ((char)zzzz[(k >>> 4)]);
        j = m + 1;
        arrayOfChar[m] = ((char)zzzz[(k & 0xF)]);
        arrayOfChar[j] = ((char)58);
        i++;
      }
      i = paramArrayOfByte[(paramArrayOfByte.length - 1)] & 0xFF;
      arrayOfChar[j] = ((char)zzzz[(i >>> 4)]);
      arrayOfChar[(j + 1)] = ((char)zzzz[(i & 0xF)]);
      paramArrayOfByte = new String(arrayOfChar);
      AppMethodBeat.o(90205);
    }
  }

  public static String bytesToStringLowercase(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90204);
    char[] arrayOfChar = new char[paramArrayOfByte.length << 1];
    int i = 0;
    int m;
    for (int j = 0; i < paramArrayOfByte.length; j = m + 1)
    {
      int k = paramArrayOfByte[i] & 0xFF;
      m = j + 1;
      arrayOfChar[j] = ((char)zzaaa[(k >>> 4)]);
      arrayOfChar[m] = ((char)zzaaa[(k & 0xF)]);
      i++;
    }
    paramArrayOfByte = new String(arrayOfChar);
    AppMethodBeat.o(90204);
    return paramArrayOfByte;
  }

  public static String bytesToStringUppercase(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90202);
    paramArrayOfByte = bytesToStringUppercase(paramArrayOfByte, false);
    AppMethodBeat.o(90202);
    return paramArrayOfByte;
  }

  public static String bytesToStringUppercase(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(90203);
    int i = paramArrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(i << 1);
    for (int j = 0; (j < i) && ((!paramBoolean) || (j != i - 1) || ((paramArrayOfByte[j] & 0xFF) != 0)); j++)
    {
      localStringBuilder.append(zzzz[((paramArrayOfByte[j] & 0xF0) >>> 4)]);
      localStringBuilder.append(zzzz[(paramArrayOfByte[j] & 0xF)]);
    }
    paramArrayOfByte = localStringBuilder.toString();
    AppMethodBeat.o(90203);
    return paramArrayOfByte;
  }

  public static byte[] colonDelimitedStringToBytes(String paramString)
  {
    AppMethodBeat.i(90207);
    paramString = stringToBytes(paramString.replace(":", ""));
    AppMethodBeat.o(90207);
    return paramString;
  }

  public static byte[] stringToBytes(String paramString)
  {
    AppMethodBeat.i(90208);
    int i = paramString.length();
    if (i % 2 != 0)
    {
      paramString = new IllegalArgumentException("Hex string has odd number of characters");
      AppMethodBeat.o(90208);
      throw paramString;
    }
    byte[] arrayOfByte = new byte[i / 2];
    for (int j = 0; j < i; j += 2)
      arrayOfByte[(j / 2)] = ((byte)(byte)Integer.parseInt(paramString.substring(j, j + 2), 16));
    AppMethodBeat.o(90208);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.Hex
 * JD-Core Version:    0.6.2
 */