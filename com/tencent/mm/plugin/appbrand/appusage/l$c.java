package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum l$c
{
  private int bTx;

  static
  {
    AppMethodBeat.i(129565);
    gZr = new c("WXAPP", 0, 1);
    gZs = new c("H5", 1, 2);
    gZt = new c[] { gZr, gZs };
    AppMethodBeat.o(129565);
  }

  private l$c(int paramInt)
  {
    this.bTx = paramInt;
  }

  public static c nz(int paramInt)
  {
    AppMethodBeat.i(129564);
    c[] arrayOfc = values();
    int i = arrayOfc.length;
    int j = 0;
    c localc;
    if (j < i)
    {
      localc = arrayOfc[j];
      if (paramInt == localc.bTx)
        AppMethodBeat.o(129564);
    }
    while (true)
    {
      return localc;
      j++;
      break;
      localc = null;
      AppMethodBeat.o(129564);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.l.c
 * JD-Core Version:    0.6.2
 */