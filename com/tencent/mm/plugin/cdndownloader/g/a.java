package com.tencent.mm.plugin.cdndownloader.g;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.g;
import com.tencent.mm.vending.h.h;

public final class a
{
  private static volatile al ftB;
  private static final Object iRa;

  static
  {
    AppMethodBeat.i(965);
    iRa = new Object();
    AppMethodBeat.o(965);
  }

  public static al aNS()
  {
    AppMethodBeat.i(964);
    if (ftB == null);
    synchronized (iRa)
    {
      if (ftB == null)
      {
        Object localObject2 = new com/tencent/mm/sdk/platformtools/al;
        ((al)localObject2).<init>("CDNDownloader#WorkThread");
        ftB = (al)localObject2;
        localObject2 = new com/tencent/mm/vending/h/h;
        ((h)localObject2).<init>(ftB.oAl.getLooper(), "CDNDownloader#WorkThread");
        g.a("CDNDownloader#WorkThread", (d)localObject2);
      }
      ??? = ftB;
      AppMethodBeat.o(964);
      return ???;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.g.a
 * JD-Core Version:    0.6.2
 */