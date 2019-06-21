package com.tencent.mm.plugin.offline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.auth.a.a;
import com.tencent.mm.protocal.j.f;
import com.tencent.mm.protocal.j.g;
import com.tencent.mm.protocal.v.b;
import com.tencent.mm.sdk.platformtools.ab;

final class k$3
  implements a
{
  k$3(k paramk)
  {
  }

  public final void a(j.f paramf, j.g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(43355);
    ab.i("MicroMsg.SubCoreOffline", "autoAuth: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
      k.bXj().eO(7, 7);
    AppMethodBeat.o(43355);
  }

  public final void a(v.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.k.3
 * JD-Core Version:    0.6.2
 */