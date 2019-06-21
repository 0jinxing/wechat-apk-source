package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3
  implements Runnable
{
  a$3(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24591);
    if (this.qtD.qtv)
    {
      ab.e("MicroMsg.MusicFingerPrintRecorder", "tryStartNetscene clientid: %d but netscene is running.", new Object[] { Integer.valueOf(this.qtD.qtx) });
      AppMethodBeat.o(24591);
      return;
    }
    while (true)
    {
      long l;
      int i;
      int j;
      int k;
      boolean bool;
      int m;
      synchronized (this.qtD.qtn)
      {
        if (this.qtD.qto <= 0)
        {
          AppMethodBeat.o(24591);
          break;
        }
        byte[] arrayOfByte1 = new byte[this.qtD.qto];
        System.arraycopy(this.qtD.qtn, 0, arrayOfByte1, 0, this.qtD.qto);
        this.qtD.qto = 0;
        l = this.qtD.qtq;
        this.qtD.qtv = true;
        i = this.qtD.qtr;
        j = this.qtD.qtp;
        k = this.qtD.qtx;
        bool = this.qtD.qtw;
        m = this.qtD.qty;
        if (i == 367)
        {
          ??? = new f(arrayOfByte1, j, l, k, bool, m);
          aw.Rg().a((m)???, 0);
          AppMethodBeat.o(24591);
        }
      }
      if (i == 408)
        ??? = new g(arrayOfByte2, j, l, k, bool, m);
      else
        ??? = null;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(24592);
    String str = super.toString() + "|tryStartNetscene";
    AppMethodBeat.o(24592);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.a.3
 * JD-Core Version:    0.6.2
 */