package com.tencent.mm.plugin.nearby.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;

final class f$7
  implements bd.a
{
  f$7(f paramf)
  {
  }

  public final void a(bd parambd, ad paramad)
  {
    AppMethodBeat.i(55389);
    if ((parambd != null) && (paramad != null) && (paramad.Oa()))
    {
      g.RN().QU();
      ((j)g.K(j.class)).bOo().QU(paramad.field_username);
    }
    AppMethodBeat.o(55389);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.a.f.7
 * JD-Core Version:    0.6.2
 */