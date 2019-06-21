package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;

final class l$4
  implements Runnable
{
  l$4(l paraml)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125136);
    ab.d("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd, in runnable");
    Intent localIntent = a.gkE.bh(this.gDD.gDo);
    localIntent.addFlags(67108864);
    this.gDD.gDo.startActivity(localIntent);
    this.gDD.gDo.finish();
    AppMethodBeat.o(125136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.l.4
 * JD-Core Version:    0.6.2
 */