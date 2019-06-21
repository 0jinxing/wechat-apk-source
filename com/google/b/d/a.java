package com.google.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends n
{
  static final char[] bAh;
  static final int[] bAi;
  private static final char[] bAj;

  static
  {
    AppMethodBeat.i(57325);
    bAh = "0123456789-$:/.+ABCD".toCharArray();
    bAi = new int[] { 3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14 };
    bAj = new char[] { 65, 66, 67, 68 };
    AppMethodBeat.o(57325);
  }

  static boolean a(char[] paramArrayOfChar, char paramChar)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    int i;
    if (paramArrayOfChar != null)
      i = paramArrayOfChar.length;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j < i)
      {
        if (paramArrayOfChar[j] == paramChar)
          bool2 = true;
      }
      else
        return bool2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.b.d.a
 * JD-Core Version:    0.6.2
 */