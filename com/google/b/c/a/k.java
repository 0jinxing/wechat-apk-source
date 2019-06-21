package com.google.b.c.a;

import com.google.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class k
{
  static final k[] bzT;
  private static k[] bzU;
  private final int bAa;
  private final int bAb;
  final int bAc;
  private final boolean bzV;
  final int bzW;
  final int bzX;
  public final int bzY;
  public final int bzZ;

  static
  {
    AppMethodBeat.i(57312);
    k[] arrayOfk = new k[30];
    arrayOfk[0] = new k(false, 3, 5, 8, 8, 1);
    arrayOfk[1] = new k(false, 5, 7, 10, 10, 1);
    arrayOfk[2] = new k(true, 5, 7, 16, 6, 1);
    arrayOfk[3] = new k(false, 8, 10, 12, 12, 1);
    arrayOfk[4] = new k(true, 10, 11, 14, 6, 2);
    arrayOfk[5] = new k(false, 12, 12, 14, 14, 1);
    arrayOfk[6] = new k(true, 16, 14, 24, 10, 1);
    arrayOfk[7] = new k(false, 18, 14, 16, 16, 1);
    arrayOfk[8] = new k(false, 22, 18, 18, 18, 1);
    arrayOfk[9] = new k(true, 22, 18, 16, 10, 2);
    arrayOfk[10] = new k(false, 30, 20, 20, 20, 1);
    arrayOfk[11] = new k(true, 32, 24, 16, 14, 2);
    arrayOfk[12] = new k(false, 36, 24, 22, 22, 1);
    arrayOfk[13] = new k(false, 44, 28, 24, 24, 1);
    arrayOfk[14] = new k(true, 49, 28, 22, 14, 2);
    arrayOfk[15] = new k(false, 62, 36, 14, 14, 4);
    arrayOfk[16] = new k(false, 86, 42, 16, 16, 4);
    arrayOfk[17] = new k(false, 114, 48, 18, 18, 4);
    arrayOfk[18] = new k(false, 144, 56, 20, 20, 4);
    arrayOfk[19] = new k(false, 174, 68, 22, 22, 4);
    arrayOfk[20] = new k(false, 204, 84, 24, 24, 4, 102, 42);
    arrayOfk[21] = new k(false, 280, 112, 14, 14, 16, 140, 56);
    arrayOfk[22] = new k(false, 368, 144, 16, 16, 16, 92, 36);
    arrayOfk[23] = new k(false, 456, 192, 18, 18, 16, 114, 48);
    arrayOfk[24] = new k(false, 576, 224, 20, 20, 16, 144, 56);
    arrayOfk[25] = new k(false, 696, 272, 22, 22, 16, 174, 68);
    arrayOfk[26] = new k(false, 816, 336, 24, 24, 16, 136, 56);
    arrayOfk[27] = new k(false, 1050, 408, 18, 18, 36, 175, 68);
    arrayOfk[28] = new k(false, 1304, 496, 20, 20, 36, 163, 62);
    arrayOfk[29] = new d();
    bzT = arrayOfk;
    bzU = arrayOfk;
    AppMethodBeat.o(57312);
  }

  private k(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt1, paramInt2);
  }

  k(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.bzV = paramBoolean;
    this.bzW = paramInt1;
    this.bzX = paramInt2;
    this.bzY = paramInt3;
    this.bzZ = paramInt4;
    this.bAa = paramInt5;
    this.bAb = paramInt6;
    this.bAc = paramInt7;
  }

  public static k a(int paramInt, l paraml, b paramb1, b paramb2)
  {
    AppMethodBeat.i(57304);
    for (k localk : bzU)
      if (((paraml != l.bAe) || (!localk.bzV)) && ((paraml != l.bAf) || (localk.bzV)) && ((paramb1 == null) || ((localk.vG() >= paramb1.width) && (localk.vH() >= paramb1.height))) && ((paramb2 == null) || ((localk.vG() <= paramb2.width) && (localk.vH() <= paramb2.height))) && (paramInt <= localk.bzW))
      {
        AppMethodBeat.o(57304);
        return localk;
      }
    paraml = new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(57304);
    throw paraml;
  }

  private int vC()
  {
    AppMethodBeat.i(57305);
    int i;
    switch (this.bAa)
    {
    default:
      IllegalStateException localIllegalStateException = new IllegalStateException("Cannot handle this number of data regions");
      AppMethodBeat.o(57305);
      throw localIllegalStateException;
    case 1:
      i = 1;
      AppMethodBeat.o(57305);
    case 2:
    case 4:
    case 16:
    case 36:
    }
    while (true)
    {
      return i;
      i = 2;
      AppMethodBeat.o(57305);
      continue;
      i = 4;
      AppMethodBeat.o(57305);
      continue;
      i = 6;
      AppMethodBeat.o(57305);
    }
  }

  private int vD()
  {
    AppMethodBeat.i(57306);
    int i;
    switch (this.bAa)
    {
    default:
      IllegalStateException localIllegalStateException = new IllegalStateException("Cannot handle this number of data regions");
      AppMethodBeat.o(57306);
      throw localIllegalStateException;
    case 1:
    case 2:
      i = 1;
      AppMethodBeat.o(57306);
    case 4:
    case 16:
    case 36:
    }
    while (true)
    {
      return i;
      i = 2;
      AppMethodBeat.o(57306);
      continue;
      i = 4;
      AppMethodBeat.o(57306);
      continue;
      i = 6;
      AppMethodBeat.o(57306);
    }
  }

  public int fE(int paramInt)
  {
    return this.bAb;
  }

  public final String toString()
  {
    AppMethodBeat.i(57311);
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.bzV);
    for (String str = "Rectangular Symbol:"; ; str = "Square Symbol:")
    {
      str = str + " data region " + this.bzY + 'x' + this.bzZ + ", symbol size " + vG() + 'x' + vH() + ", symbol data size " + vE() + 'x' + vF() + ", codewords " + this.bzW + '+' + this.bzX;
      AppMethodBeat.o(57311);
      return str;
    }
  }

  public final int vE()
  {
    AppMethodBeat.i(57307);
    int i = vC();
    int j = this.bzY;
    AppMethodBeat.o(57307);
    return i * j;
  }

  public final int vF()
  {
    AppMethodBeat.i(57308);
    int i = vD();
    int j = this.bzZ;
    AppMethodBeat.o(57308);
    return i * j;
  }

  public final int vG()
  {
    AppMethodBeat.i(57309);
    int i = vE();
    int j = vC();
    AppMethodBeat.o(57309);
    return i + (j << 1);
  }

  public final int vH()
  {
    AppMethodBeat.i(57310);
    int i = vF();
    int j = vD();
    AppMethodBeat.o(57310);
    return i + (j << 1);
  }

  public int vv()
  {
    return this.bzW / this.bAb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.k
 * JD-Core Version:    0.6.2
 */