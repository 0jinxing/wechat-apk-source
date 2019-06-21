package com.tencent.mm.plugin.voip_cs.b.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.ui.VoipBigIconButton;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.plugin.voip_cs.b.e;
import com.tencent.mm.plugin.voip_cs.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$3
  implements View.OnClickListener
{
  b$3(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(135320);
    ab.i("MicroMsg.voipcs.VoipCSViewManager", "switch camera");
    b.d(this.tet).setEnabled(false);
    if (c.cMf().tdM > 1)
      b.e(this.tet);
    b.d(this.tet).setEnabled(true);
    if (b.f(this.tet) != null)
      b.f(this.tet).cLB();
    AppMethodBeat.o(135320);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.3
 * JD-Core Version:    0.6.2
 */