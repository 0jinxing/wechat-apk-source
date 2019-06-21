package com.tencent.mm.model.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.adr;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements w.a
{
  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(118160);
    b.Pu();
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.ABTestUpdater", "Update Error: %d, %d, next update will be performed %d(s) later", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(86400) });
      b.access$100();
      b.kN(86400);
      b.BL();
      AppMethodBeat.o(118160);
    }
    while (true)
    {
      return 0;
      paramString = (adr)paramb.fsH.fsP;
      b.access$100();
      b.kO(paramString.Timestamp);
      b.kN(paramString.wlQ);
      b.Y(paramString.wlR);
      b.Z(paramString.wlP);
      b.BL();
      ab.i("MicroMsg.ABTestUpdater", "Update Interval: %d", new Object[] { Integer.valueOf(paramString.wlQ) });
      AppMethodBeat.o(118160);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c.b.1
 * JD-Core Version:    0.6.2
 */