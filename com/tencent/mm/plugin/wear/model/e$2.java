package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;

final class e$2
  implements h.a
{
  e$2(e parame)
  {
  }

  public final void a(h paramh, h.c paramc)
  {
    AppMethodBeat.i(26298);
    if (paramc == null)
      AppMethodBeat.o(26298);
    while (true)
    {
      return;
      if ((paramc.oqM > 0) && (a.cUn().tXt.tXL.tYA.equals(paramc.talker)))
        a.cUn().tXz.a(new e.2.1(this));
      AppMethodBeat.o(26298);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.2
 * JD-Core Version:    0.6.2
 */