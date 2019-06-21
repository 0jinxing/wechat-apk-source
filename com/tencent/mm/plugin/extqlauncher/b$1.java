package com.tencent.mm.plugin.extqlauncher;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class b$1
  implements n.b
{
  b$1(b paramb)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(20473);
    ab.d("MicroMsg.SubCoreExtQLauncher", "onNotifyChange");
    if (this.lRT.lRK)
      AppMethodBeat.o(20473);
    while (true)
    {
      return;
      aw.ZK();
      if (paramn != c.XR())
      {
        AppMethodBeat.o(20473);
      }
      else if ((paramn == null) || (paramObject == null))
      {
        ab.e("MicroMsg.SubCoreExtQLauncher", "onConversationChange, wrong args");
        AppMethodBeat.o(20473);
      }
      else if ((ah.getContext() == null) || (!aw.RK()))
      {
        ab.w("MicroMsg.SubCoreExtQLauncher", "wrong account status");
        AppMethodBeat.o(20473);
      }
      else
      {
        this.lRT.bsc();
        AppMethodBeat.o(20473);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.b.1
 * JD-Core Version:    0.6.2
 */