package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class i
{
  public static boolean Iv()
  {
    AppMethodBeat.i(4368);
    boolean bool;
    if (bo.fp(bo.a((Long)g.RP().Ry().get(77828, null), 0L)) * 1000L > 1800000L)
    {
      bool = true;
      AppMethodBeat.o(4368);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4368);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.i
 * JD-Core Version:    0.6.2
 */