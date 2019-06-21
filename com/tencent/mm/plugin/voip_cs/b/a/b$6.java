package com.tencent.mm.plugin.voip_cs.b.a;

import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI;
import com.tencent.mm.sdk.platformtools.ab;

final class b$6
  implements Runnable
{
  b$6(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135323);
    ab.i("MicroMsg.voipcs.VoipCSViewManager", "dismiss button");
    if (b.j(this.tet).isFinishing())
      AppMethodBeat.o(135323);
    while (true)
    {
      return;
      b.k(this.tet).setVisibility(8);
      b.l(this.tet).setVisibility(8);
      b.m(this.tet).setVisibility(8);
      b.n(this.tet);
      b.o(this.tet);
      AppMethodBeat.o(135323);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.6
 * JD-Core Version:    0.6.2
 */