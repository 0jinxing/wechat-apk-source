package com.tencent.mm.plugin.ext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;

final class b$10
  implements n.b
{
  b$10(b paramb)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(20269);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("MicroMsg.SubCoreExt", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(20269);
    }
    while (true)
    {
      return;
      if (!aw.RK())
      {
        ab.i("MicroMsg.SubCoreExt", "onNotifyChange acc not ready");
        AppMethodBeat.o(20269);
      }
      else
      {
        aw.ZK();
        if (paramn == c.XM())
          b.d(this.lPx);
        AppMethodBeat.o(20269);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.10
 * JD-Core Version:    0.6.2
 */