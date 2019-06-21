package com.tencent.tinker.a.b.b;

public final class a
{
  public static String RE(int paramInt)
  {
    char[] arrayOfChar = new char[8];
    for (int i = 0; i < 8; i++)
    {
      arrayOfChar[(7 - i)] = Character.forDigit(paramInt & 0xF, 16);
      paramInt >>= 4;
    }
    return new String(arrayOfChar);
  }

  public static String RF(int paramInt)
  {
    char[] arrayOfChar = new char[4];
    for (int i = 0; i < 4; i++)
    {
      arrayOfChar[(3 - i)] = Character.forDigit(paramInt & 0xF, 16);
      paramInt >>= 4;
    }
    return new String(arrayOfChar);
  }

  public static String RG(int paramInt)
  {
    if (paramInt == (char)paramInt);
    for (String str = RF(paramInt); ; str = RE(paramInt))
      return str;
  }

  public static String RH(int paramInt)
  {
    int i = 0;
    char[] arrayOfChar = new char[9];
    if (paramInt < 0)
    {
      arrayOfChar[0] = ((char)45);
      paramInt = -paramInt;
    }
    while (i < 8)
    {
      arrayOfChar[(8 - i)] = Character.forDigit(paramInt & 0xF, 16);
      paramInt >>= 4;
      i++;
      continue;
      arrayOfChar[0] = ((char)43);
    }
    return new String(arrayOfChar);
  }

  public static String nF(long paramLong)
  {
    char[] arrayOfChar = new char[16];
    for (int i = 0; i < 16; i++)
    {
      arrayOfChar[(15 - i)] = Character.forDigit((int)paramLong & 0xF, 16);
      paramLong >>= 4;
    }
    return new String(arrayOfChar);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.b.b.a
 * JD-Core Version:    0.6.2
 */