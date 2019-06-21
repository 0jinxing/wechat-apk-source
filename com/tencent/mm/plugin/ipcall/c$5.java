package com.tencent.mm.plugin.ipcall;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.ui.a;
import com.tencent.mm.plugin.voip.ui.e;
import com.tencent.mm.sdk.platformtools.ah;

final class c$5
  implements a
{
  c$5(c paramc)
  {
  }

  public final void a(Intent paramIntent, e parame)
  {
    AppMethodBeat.i(21670);
    if (!i.bHu().bHn())
    {
      parame.abZ(ah.getContext().getString(2131301582));
      AppMethodBeat.o(21670);
    }
    while (true)
    {
      return;
      int i = this.nvi.bGU();
      parame.aca(String.format("%02d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }));
      AppMethodBeat.o(21670);
    }
  }

  public final boolean bGV()
  {
    AppMethodBeat.i(21669);
    boolean bool;
    if (i.bHu().bHk())
    {
      bool = true;
      AppMethodBeat.o(21669);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(21669);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.c.5
 * JD-Core Version:    0.6.2
 */