package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hn;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bo;

final class am$4 extends c<hn>
{
  am$4(am paramam)
  {
    AppMethodBeat.i(27414);
    this.xxI = hn.class.getName().hashCode();
    AppMethodBeat.o(27414);
  }

  private static boolean a(hn paramhn)
  {
    AppMethodBeat.i(27415);
    try
    {
      e locale = g.Nu();
      if (locale == null);
      for (i = 0; ; i = bo.getInt(g.Nu().getValue("AndroidUseUnicodeEmoji"), 0))
      {
        paramhn.cCr.cwb = i;
        AppMethodBeat.o(27415);
        return false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        int i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.am.4
 * JD-Core Version:    0.6.2
 */