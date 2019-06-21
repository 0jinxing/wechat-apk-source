package com.tencent.mm.plugin.multitalk.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.ui.a;
import com.tencent.mm.plugin.voip.ui.e;
import com.tencent.mm.sdk.platformtools.ah;

final class f$14$1
  implements a
{
  f$14$1(f.14 param14)
  {
  }

  public final void a(Intent paramIntent, e parame)
  {
    AppMethodBeat.i(53953);
    if (!this.oGG.oGB.bRc())
    {
      parame.abZ(ah.getContext().getString(2131301582));
      AppMethodBeat.o(53953);
    }
    while (true)
    {
      return;
      int i = this.oGG.oGB.oGk;
      parame.abZ(String.format("%02d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }));
      AppMethodBeat.o(53953);
    }
  }

  public final boolean bGV()
  {
    AppMethodBeat.i(53952);
    boolean bool;
    if ((this.oGG.oGB.bRH()) || (this.oGG.oGB.bRc()))
    {
      bool = true;
      AppMethodBeat.o(53952);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53952);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.14.1
 * JD-Core Version:    0.6.2
 */