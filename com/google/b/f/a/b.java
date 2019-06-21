package com.google.b.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b
{
  public final int bBk;
  private final int[] bBw;

  static
  {
    AppMethodBeat.i(57242);
    bBm = new b("TERMINATOR", 0, new int[] { 0, 0, 0 }, 0);
    bBn = new b("NUMERIC", 1, new int[] { 10, 12, 14 }, 1);
    bBo = new b("ALPHANUMERIC", 2, new int[] { 9, 11, 13 }, 2);
    bBp = new b("STRUCTURED_APPEND", 3, new int[] { 0, 0, 0 }, 3);
    bBq = new b("BYTE", 4, new int[] { 8, 16, 16 }, 4);
    bBr = new b("ECI", 5, new int[] { 0, 0, 0 }, 7);
    bBs = new b("KANJI", 6, new int[] { 8, 10, 12 }, 8);
    bBt = new b("FNC1_FIRST_POSITION", 7, new int[] { 0, 0, 0 }, 5);
    bBu = new b("FNC1_SECOND_POSITION", 8, new int[] { 0, 0, 0 }, 9);
    bBv = new b("HANZI", 9, new int[] { 8, 10, 12 }, 13);
    bBx = new b[] { bBm, bBn, bBo, bBp, bBq, bBr, bBs, bBt, bBu, bBv };
    AppMethodBeat.o(57242);
  }

  private b(int[] paramArrayOfInt, int paramInt)
  {
    this.bBw = paramArrayOfInt;
    this.bBk = paramInt;
  }

  public final int a(c paramc)
  {
    int i = paramc.bBA;
    if (i <= 9)
      i = 0;
    while (true)
    {
      return this.bBw[i];
      if (i <= 26)
        i = 1;
      else
        i = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.b.f.a.b
 * JD-Core Version:    0.6.2
 */