package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class at$1
  implements ao.b.a
{
  at$1(at.a parama, String paramString1, Context paramContext, String paramString2)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(6802);
    ab.i("MicroMsg.WebviewShrotcutManager", "getContactCallBack, suc = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      if (this.unA == null)
        break label138;
      this.unA.hJ(false);
      AppMethodBeat.o(6802);
    }
    while (true)
    {
      return;
      paramString = ((j)g.K(j.class)).XM().aoO(this.eiH);
      if ((paramString == null) || (bo.isNullOrNil(paramString.Oi())))
      {
        if (this.unA != null)
        {
          this.unA.hJ(false);
          AppMethodBeat.o(6802);
        }
      }
      else
      {
        at.a(this.val$context, this.eiH, this.hxh, paramString.Oi(), this.unA);
        label138: AppMethodBeat.o(6802);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.at.1
 * JD-Core Version:    0.6.2
 */