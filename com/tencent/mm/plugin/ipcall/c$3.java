package com.tencent.mm.plugin.ipcall;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class c$3
  implements Runnable
{
  c$3(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21667);
    if (!i.bHu().bHn())
    {
      ab.i("MicroMsg.IPCallManager", "timeout! still not accept!");
      if (this.nvi.eo(9, 12))
        this.nvi.d(9, null, ah.getContext().getString(2131297771), 2);
    }
    AppMethodBeat.o(21667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.c.3
 * JD-Core Version:    0.6.2
 */