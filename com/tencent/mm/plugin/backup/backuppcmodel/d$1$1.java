package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1$1
  implements Runnable
{
  d$1$1(d.1 param1, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17520);
    if (this.bVv == 3)
    {
      d.a(this.jws.jwr, this.eRK, this.jrs);
      AppMethodBeat.o(17520);
    }
    while (true)
    {
      return;
      if (this.bVv == 11)
      {
        d.b(this.jws.jwr, this.eRK, this.jrs);
        AppMethodBeat.o(17520);
      }
      else if (this.bVv == 6)
      {
        d.c(this.jws.jwr, this.eRK, this.jrs);
        AppMethodBeat.o(17520);
      }
      else if (this.bVv == 13)
      {
        d.J(this.eRK, this.jrs);
        AppMethodBeat.o(17520);
      }
      else if (this.bVv == 15)
      {
        d.d(this.jws.jwr, this.eRK, this.jrs);
        AppMethodBeat.o(17520);
      }
      else if (this.bVv == 8)
      {
        d.a(this.jws.jwr, this.eRK);
        AppMethodBeat.o(17520);
      }
      else
      {
        AppMethodBeat.o(17520);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.d.1.1
 * JD-Core Version:    0.6.2
 */