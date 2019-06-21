package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.n;

final class RegByMobileRegAIOUI$15
  implements Runnable
{
  RegByMobileRegAIOUI$15(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125357);
    Object localObject = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gGd);
    ((Intent)localObject).addFlags(67108864);
    this.gGd.startActivity((Intent)localObject);
    localObject = new StringBuilder();
    g.RN();
    localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gGd.getClass().getName()).append(",L14,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("L14") + ",4");
    this.gGd.finish();
    AppMethodBeat.o(125357);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.15
 * JD-Core Version:    0.6.2
 */