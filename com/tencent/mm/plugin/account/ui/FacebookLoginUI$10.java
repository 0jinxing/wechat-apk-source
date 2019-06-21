package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.n;

final class FacebookLoginUI$10
  implements Runnable
{
  FacebookLoginUI$10(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124843);
    Object localObject = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gBp);
    ((Intent)localObject).addFlags(67108864);
    this.gBp.startActivity((Intent)localObject);
    localObject = new StringBuilder();
    g.RN();
    localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gBp.getClass().getName()).append(",L14,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("L14") + ",4");
    this.gBp.finish();
    AppMethodBeat.o(124843);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookLoginUI.10
 * JD-Core Version:    0.6.2
 */