package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.pluginsdk.n;

final class RegByMobileSendSmsUI$4
  implements Runnable
{
  RegByMobileSendSmsUI$4(RegByMobileSendSmsUI paramRegByMobileSendSmsUI, s params, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125401);
    RegByMobileSendSmsUI.a(this.gGq, this.gGr.ajw());
    av.fly.ak("login_user_name", this.gEB);
    com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.compatible.util.e.euY + "temp.avatar");
    Object localObject = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gGq);
    ((Intent)localObject).addFlags(67108864);
    this.gGq.startActivity((Intent)localObject);
    localObject = new StringBuilder();
    g.RN();
    localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_600,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_600") + ",4");
    this.gGq.finish();
    AppMethodBeat.o(125401);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI.4
 * JD-Core Version:    0.6.2
 */