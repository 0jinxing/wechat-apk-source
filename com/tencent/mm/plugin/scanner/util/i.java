package com.tencent.mm.plugin.scanner.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class i
{
  public static boolean cig()
  {
    boolean bool = false;
    AppMethodBeat.i(81450);
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100027");
    if (!((com.tencent.mm.storage.c)localObject).isValid())
    {
      ab.e("MicroMsg.ScanHistoryUtil", "shouldShowHistoryList item.isValid is false");
      AppMethodBeat.o(81450);
    }
    while (true)
    {
      return bool;
      localObject = ((com.tencent.mm.storage.c)localObject).dru();
      if (localObject == null)
      {
        ab.e("MicroMsg.ScanHistoryUtil", "shouldShowHistoryList args == null");
        AppMethodBeat.o(81450);
      }
      else if ((((Map)localObject).containsKey("showEntrance")) && ("1".equals(((Map)localObject).get("showEntrance"))))
      {
        bool = true;
        AppMethodBeat.o(81450);
      }
      else
      {
        ab.e("MicroMsg.ScanHistoryUtil", "not contain the showEntrance key or the value is not 1");
        AppMethodBeat.o(81450);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.i
 * JD-Core Version:    0.6.2
 */