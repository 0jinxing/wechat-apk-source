package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;

final class LoginIndepPass$6
  implements Runnable
{
  LoginIndepPass$6(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124974);
    ab.d("MicroMsg.LoginIndepPass", "onSceneEnd, in runnable");
    Intent localIntent = a.gkE.bh(this.gCE);
    localIntent.addFlags(67108864);
    this.gCE.startActivity(localIntent);
    this.gCE.finish();
    AppMethodBeat.o(124974);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginIndepPass.6
 * JD-Core Version:    0.6.2
 */