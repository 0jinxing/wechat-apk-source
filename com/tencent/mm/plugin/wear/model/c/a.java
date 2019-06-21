package com.tencent.mm.plugin.wear.model.c;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.protocal.protobuf.ctv;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class a
{
  public static final void HH(int paramInt)
  {
    AppMethodBeat.i(26370);
    h.pYm.a(249L, paramInt, 1L, false);
    AppMethodBeat.o(26370);
  }

  public static final void gn(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26369);
    ctv localctv = com.tencent.mm.plugin.wear.model.a.cUn().tXt.tXK.tYz;
    if (localctv != null)
    {
      ab.v("MicroMsg.Wear.ReportKVUtil", "report kv operation=%d scene=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      h.pYm.e(11632, new Object[] { Integer.valueOf(paramInt1), localctv.jBG, localctv.xqt, Integer.valueOf(paramInt2) });
    }
    AppMethodBeat.o(26369);
  }

  public static final void nD(boolean paramBoolean)
  {
    AppMethodBeat.i(26371);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(249);
    localIDKey.SetKey(12);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(249);
      localIDKey.SetKey(13);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    h.pYm.b(localArrayList, false);
    AppMethodBeat.o(26371);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.c.a
 * JD-Core Version:    0.6.2
 */