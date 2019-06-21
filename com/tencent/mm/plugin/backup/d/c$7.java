package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$7
  implements Runnable
{
  c$7(c paramc, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17252);
    if (this.bVv == 11)
    {
      c.a(this.jtN, this.eRK, this.jrs);
      AppMethodBeat.o(17252);
    }
    while (true)
    {
      return;
      if (this.bVv == 6)
      {
        c.b(this.jtN, this.eRK, this.jrs);
        AppMethodBeat.o(17252);
      }
      else if (this.bVv == 13)
      {
        c.I(this.eRK, this.jrs);
        AppMethodBeat.o(17252);
      }
      else if (this.bVv == 15)
      {
        c.c(this.jtN, this.eRK, this.jrs);
        AppMethodBeat.o(17252);
      }
      else if (this.bVv == 8)
      {
        c.a(this.jtN, this.eRK);
        AppMethodBeat.o(17252);
      }
      else
      {
        AppMethodBeat.o(17252);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.c.7
 * JD-Core Version:    0.6.2
 */