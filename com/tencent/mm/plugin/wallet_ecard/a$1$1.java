package com.tencent.mm.plugin.wallet_ecard;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.cr;
import com.tencent.mm.g.a.cr.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class a$1$1
  implements com.tencent.mm.ai.f
{
  a$1$1(a.1 param1, cr.a parama, cr paramcr, String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48038);
    g.RQ();
    g.RO().eJo.b(580, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.SubCoreECard", "jsapi check success");
      com.tencent.mm.pluginsdk.wallet.f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
      paramString = (Context)this.tPy.aIq.get();
      if ((paramString != null) && ((paramString instanceof Activity)))
      {
        a.a(this.tPB.tPx, new a.a(this.tPB.tPx, this.tPz));
        com.tencent.mm.plugin.wallet_ecard.a.b.a(bo.getInt(this.tPz.cvM.cvR, 0), this.tPz.cvM.token, this.tPz.cvM.cvQ, this.tPA, paramString, a.a(this.tPB.tPx));
        AppMethodBeat.o(48038);
      }
    }
    while (true)
    {
      return;
      this.tPz.cvN.retCode = -1;
      this.tPz.cvM.callback.run();
      AppMethodBeat.o(48038);
      continue;
      ab.e("MicroMsg.SubCoreECard", "jsapi check fail");
      this.tPz.cvN.retCode = -1;
      this.tPz.cvM.callback.run();
      AppMethodBeat.o(48038);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.1.1
 * JD-Core Version:    0.6.2
 */