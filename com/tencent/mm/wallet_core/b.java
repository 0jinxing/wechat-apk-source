package com.tencent.mm.wallet_core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class b
{
  private static b AeS;

  public static b dNA()
  {
    AppMethodBeat.i(49006);
    if (AeS == null)
      AeS = new b();
    b localb = AeS;
    AppMethodBeat.o(49006);
    return localb;
  }

  public static boolean dNB()
  {
    boolean bool = true;
    AppMethodBeat.i(49007);
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100368");
    if ((localc.isValid()) && ("1".equals(localc.dru().get("open"))));
    for (int i = 1; ; i = 0)
    {
      ab.i("MicroMsg.TenPaySdkAbTest", "isPwdOpen2048 %s", new Object[] { Integer.valueOf(i) });
      if (i > 0)
        AppMethodBeat.o(49007);
      while (true)
      {
        return bool;
        AppMethodBeat.o(49007);
        bool = false;
      }
    }
  }

  public static boolean dNC()
  {
    boolean bool = true;
    AppMethodBeat.i(49008);
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100370");
    if ((localc.isValid()) && ("1".equals(localc.dru().get("open"))));
    for (int i = 1; ; i = 0)
    {
      ab.i("MicroMsg.TenPaySdkAbTest", "isOfflineOpen2048 %s", new Object[] { Integer.valueOf(i) });
      if (i > 0)
        AppMethodBeat.o(49008);
      while (true)
      {
        return bool;
        AppMethodBeat.o(49008);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.b
 * JD-Core Version:    0.6.2
 */