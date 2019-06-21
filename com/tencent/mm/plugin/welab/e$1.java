package com.tencent.mm.plugin.welab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.adr;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1
  implements w.a
{
  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(80543);
    e.Pu();
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.WelabUpdater", "Update Error: %d, %d, next update will be performed %d(s) later", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(86400) });
      e.access$100();
      e.kN(86400);
      e.BL();
      AppMethodBeat.o(80543);
    }
    while (true)
    {
      return 0;
      paramString = (adr)paramb.fsH.fsP;
      e.access$100();
      e.kO(paramString.Timestamp);
      e.kN(paramString.wlQ);
      e.Y(paramString.wlR);
      e.Z(paramString.wlP);
      e.BL();
      ab.i("MicroMsg.WelabUpdater", "Update Interval: %d", new Object[] { Integer.valueOf(paramString.wlQ) });
      AppMethodBeat.o(80543);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.e.1
 * JD-Core Version:    0.6.2
 */