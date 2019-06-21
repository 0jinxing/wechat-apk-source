package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$1
  implements Runnable
{
  j$1(j.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68484);
    try
    {
      j.b(this.vvi);
      AppMethodBeat.o(68484);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.QQMailUnreadHelper", localException, "", new Object[0]);
        ab.e("MicroMsg.QQMailUnreadHelper", "getUnreadCountAsync exception");
        AppMethodBeat.o(68484);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.j.1
 * JD-Core Version:    0.6.2
 */