package com.tencent.mm.plugin.performance;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.a;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ad;

final class b$1
  implements a
{
  public final boolean UC(String paramString)
  {
    AppMethodBeat.i(111039);
    boolean bool = ad.a(paramString, r.Yz(), true, false);
    AppMethodBeat.o(111039);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.b.1
 * JD-Core Version:    0.6.2
 */