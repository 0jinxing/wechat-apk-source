package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.o;

final class c$1
  implements ap.a
{
  c$1(c paramc)
  {
  }

  public final boolean BI()
  {
    boolean bool1 = true;
    AppMethodBeat.i(78658);
    boolean bool2 = o.gl(ah.getContext());
    String str = c.cd(ah.getContext());
    if (!bo.isNullOrNil(str))
    {
      bool3 = true;
      ab.d("MicroMsg.ClickFlowStatReceiver", "monitorHandler ScreenOn:%s isTop:%s top:%s ", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), str });
      if ((bool2) && (bool3))
        break label106;
      c.b(this.fRJ).post(new c.1.1(this));
      AppMethodBeat.o(78658);
    }
    for (boolean bool3 = false; ; bool3 = bool1)
    {
      return bool3;
      bool3 = false;
      break;
      label106: AppMethodBeat.o(78658);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.c.1
 * JD-Core Version:    0.6.2
 */