package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.pluginsdk.n;

final class MobileLoginOrForceReg$6
  implements Runnable
{
  MobileLoginOrForceReg$6(MobileLoginOrForceReg paramMobileLoginOrForceReg, m paramm, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125209);
    MobileLoginOrForceReg.a(this.gEv, ((s)this.crb).ajw());
    av.fly.ak("login_user_name", this.gEB);
    Object localObject = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gEv);
    ((Intent)localObject).addFlags(67108864);
    this.gEv.startActivity((Intent)localObject);
    localObject = new StringBuilder();
    g.RN();
    localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_600,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_600") + ",4");
    this.gEv.finish();
    AppMethodBeat.o(125209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.6
 * JD-Core Version:    0.6.2
 */