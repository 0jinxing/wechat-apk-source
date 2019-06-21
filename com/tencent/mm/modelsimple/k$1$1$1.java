package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.ui.DisasterUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class k$1$1$1
  implements Runnable
{
  k$1$1$1(k.1.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16578);
    ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony[%b]", new Object[] { Boolean.valueOf(ah.dox()) });
    Intent localIntent = new Intent();
    localIntent.putExtra("key_disaster_content", this.fON.fOK);
    localIntent.putExtra("key_disaster_url", this.fON.fOL);
    localIntent.setClass(ah.getContext(), DisasterUI.class).addFlags(268435456);
    ah.getContext().startActivity(localIntent);
    AppMethodBeat.o(16578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.k.1.1.1
 * JD-Core Version:    0.6.2
 */