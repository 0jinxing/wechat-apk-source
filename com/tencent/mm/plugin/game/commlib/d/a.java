package com.tencent.mm.plugin.game.commlib.d;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vending.h.g;

public final class a
{
  private static volatile al ftB;
  private static final Object iRa;

  static
  {
    AppMethodBeat.i(59425);
    iRa = new Object();
    AppMethodBeat.o(59425);
  }

  public static void aNR()
  {
    AppMethodBeat.i(59424);
    if (ftB == null)
      AppMethodBeat.o(59424);
    while (true)
    {
      return;
      synchronized (iRa)
      {
        if (ftB != null)
        {
          g.asT("GameCommLib#WorkThread");
          ftB.oAl.quit();
          ftB = null;
        }
        AppMethodBeat.o(59424);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.d.a
 * JD-Core Version:    0.6.2
 */