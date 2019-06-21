package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;

public final class j
{
  public static void aIt()
  {
    AppMethodBeat.i(105642);
    h.pYm.a(689L, 0L, 1L, true);
    AppMethodBeat.o(105642);
  }

  public static void pj(int paramInt)
  {
    AppMethodBeat.i(105643);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(689);
    localIDKey1.SetKey(1);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(689);
    localIDKey2.SetKey(i.pi(paramInt));
    localIDKey2.SetValue(1L);
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    h.pYm.b(localArrayList, true);
    AppMethodBeat.o(105643);
  }

  public static void pk(int paramInt)
  {
    AppMethodBeat.i(105644);
    h.pYm.a(689L, i.pi(paramInt), 1L, true);
    AppMethodBeat.o(105644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.j
 * JD-Core Version:    0.6.2
 */