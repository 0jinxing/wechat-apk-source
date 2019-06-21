package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cs$a
{
  final int value;

  static
  {
    AppMethodBeat.i(51098);
    dhH = new a("undefined", 0, 0);
    dhI = new a("normal", 1, 1000);
    dhJ = new a("plugin", 2, 1001);
    dhK = new a("wxstore", 3, 1002);
    dhL = new a("merchant", 4, 1003);
    dhM = new a("wagame", 5, 1004);
    dhN = new a("gift", 6, 1005);
    dhO = new a[] { dhH, dhI, dhJ, dhK, dhL, dhM, dhN };
    AppMethodBeat.o(51098);
  }

  private cs$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hp(int paramInt)
  {
    a locala;
    switch (paramInt)
    {
    default:
      locala = null;
    case 0:
    case 1000:
    case 1001:
    case 1002:
    case 1003:
    case 1004:
    case 1005:
    }
    while (true)
    {
      return locala;
      locala = dhH;
      continue;
      locala = dhI;
      continue;
      locala = dhJ;
      continue;
      locala = dhK;
      continue;
      locala = dhL;
      continue;
      locala = dhM;
      continue;
      locala = dhN;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cs.a
 * JD-Core Version:    0.6.2
 */