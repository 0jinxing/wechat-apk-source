package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum l$a
{
  int bTx;

  static
  {
    AppMethodBeat.i(129561);
    gZo = new a("FORCE_OFF", 0, 0);
    gZp = new a("FORCE_ON", 1, 1);
    gZq = new a[] { gZo, gZp };
    AppMethodBeat.o(129561);
  }

  private l$a(int paramInt)
  {
    this.bTx = paramInt;
  }

  public static a ny(int paramInt)
  {
    AppMethodBeat.i(129560);
    a[] arrayOfa = values();
    int i = arrayOfa.length;
    int j = 0;
    a locala;
    if (j < i)
    {
      locala = arrayOfa[j];
      if (locala.bTx == paramInt)
        AppMethodBeat.o(129560);
    }
    while (true)
    {
      return locala;
      j++;
      break;
      locala = null;
      AppMethodBeat.o(129560);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.l.a
 * JD-Core Version:    0.6.2
 */