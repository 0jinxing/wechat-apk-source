package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class q extends com.tencent.mm.sdk.b.c<mp>
{
  private static long ecD = 86400000L;

  public q()
  {
    AppMethodBeat.i(78504);
    this.xxI = mp.class.getName().hashCode();
    AppMethodBeat.o(78504);
  }

  private static boolean Iv()
  {
    AppMethodBeat.i(78506);
    boolean bool;
    if (bo.fp(bo.c((Long)g.RP().Ry().get(81938, null))) * 1000L > ecD)
    {
      bool = true;
      AppMethodBeat.o(78506);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78506);
    }
  }

  private static boolean aiv()
  {
    AppMethodBeat.i(78505);
    ab.d("MicroMsg.PostTaskUpdateConfigListListener", "callback expired : " + Iv());
    if (Iv())
      c.aiq().update();
    AppMethodBeat.o(78505);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.q
 * JD-Core Version:    0.6.2
 */