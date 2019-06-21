package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;

final class w$11
  implements n.b
{
  w$11(w paramw)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(29670);
    int i = ah.bh(paramObject);
    ab.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    aw.ZK();
    if ((paramn != c.Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(29670);
    }
    while (true)
    {
      return;
      this.yoa.dyE();
      if (i == 143618)
      {
        w.a(this.yoa);
        AppMethodBeat.o(29670);
      }
      else
      {
        if ((i == 204817) || (i == 204820))
          w.b(this.yoa);
        AppMethodBeat.o(29670);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.w.11
 * JD-Core Version:    0.6.2
 */