package com.tencent.mm.console;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.a.c;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.ab;

final class b$13
  implements bk.a
{
  public final void a(e parame)
  {
    AppMethodBeat.i(16094);
    if (parame == null)
      AppMethodBeat.o(16094);
    while (true)
    {
      return;
      String[] arrayOfString = parame.getIPsString(true);
      for (int i = 0; i < arrayOfString.length; i++)
      {
        ab.d("MicroMsg.CommandProcessor", "dkip long:%d  %s", new Object[] { Integer.valueOf(i), arrayOfString[i] });
        ab.d("MicroMsg.CommandProcessor", "dkip long:%d %s", new Object[] { Integer.valueOf(i), c.vd(arrayOfString[i]).toString() });
      }
      parame = parame.getIPsString(false);
      for (i = 0; i < parame.length; i++)
      {
        ab.d("MicroMsg.CommandProcessor", "dkip short:%d %s", new Object[] { Integer.valueOf(i), parame[i] });
        ab.d("MicroMsg.CommandProcessor", "dkip long:%d %s", new Object[] { Integer.valueOf(i), c.vd(parame[i]).toString() });
      }
      AppMethodBeat.o(16094);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.13
 * JD-Core Version:    0.6.2
 */