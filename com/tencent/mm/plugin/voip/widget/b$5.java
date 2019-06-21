package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.ui.a;
import com.tencent.mm.plugin.voip.ui.e;
import com.tencent.mm.sdk.platformtools.ah;

final class b$5
  implements a
{
  b$5(b paramb)
  {
  }

  public final void a(Intent paramIntent, e parame)
  {
    AppMethodBeat.i(5177);
    if (paramIntent.getBooleanExtra("Voip_Is_Talking", false))
    {
      parame.abZ(this.tcB.cLW());
      AppMethodBeat.o(5177);
    }
    while (true)
    {
      return;
      parame.abZ(ah.getContext().getString(2131304438));
      AppMethodBeat.o(5177);
    }
  }

  public final boolean bGV()
  {
    AppMethodBeat.i(5176);
    boolean bool;
    if ((com.tencent.mm.plugin.voip.a.b.GP(b.d(this.tcB))) || (com.tencent.mm.plugin.voip.a.b.GN(b.d(this.tcB))))
    {
      bool = true;
      AppMethodBeat.o(5176);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5176);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.b.5
 * JD-Core Version:    0.6.2
 */