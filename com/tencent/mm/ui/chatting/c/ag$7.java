package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.u;
import com.tencent.mm.ui.tools.o.b;

final class ag$7
  implements o.b
{
  private int yRI = 0;

  ag$7(ag paramag)
  {
  }

  public final void apo()
  {
    AppMethodBeat.i(31650);
    new ak().post(new ag.7.1(this));
    AppMethodBeat.o(31650);
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final boolean vN(String paramString)
  {
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(31649);
    if (bo.isNullOrNil(paramString))
    {
      this.yRI = 0;
      this.yRH.OD(-1);
      AppMethodBeat.o(31649);
    }
    while (true)
    {
      return;
      if (paramString.length() > this.yRI)
        h.pYm.e(10451, new Object[] { Integer.valueOf(1) });
      this.yRI = paramString.length();
      h.pYm.e(10456, new Object[] { Integer.valueOf(1) });
      ag.d(this.yRH).vM(paramString);
      AppMethodBeat.o(31649);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ag.7
 * JD-Core Version:    0.6.2
 */