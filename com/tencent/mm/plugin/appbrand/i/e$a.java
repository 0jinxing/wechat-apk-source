package com.tencent.mm.plugin.appbrand.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.k.a;
import com.tencent.mm.sdk.platformtools.ab;

final class e$a
{
  public String appId;
  public String bQi;
  public int iny;
  public k.a inz;
  public long lastUpdateTime;

  private long aIw()
  {
    AppMethodBeat.i(132278);
    long l = System.currentTimeMillis() - this.lastUpdateTime;
    ab.d("MicroMsg.WxaUpdateableMsgService", "consumeTime:%d", new Object[] { Long.valueOf(l) });
    AppMethodBeat.o(132278);
    return l;
  }

  public final boolean aIv()
  {
    boolean bool = false;
    AppMethodBeat.i(132277);
    if (this.iny < 0)
      AppMethodBeat.o(132277);
    while (true)
    {
      return bool;
      if (this.iny == 0)
      {
        if (aIw() > 10000L)
        {
          AppMethodBeat.o(132277);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(132277);
        }
      }
      else if (aIw() > this.iny * 1000L)
      {
        AppMethodBeat.o(132277);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(132277);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.e.a
 * JD-Core Version:    0.6.2
 */