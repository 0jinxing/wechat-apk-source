package com.tencent.mm.plugin.ext.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.fi;
import com.tencent.mm.g.a.fi.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;

final class ExtControlProviderMsg$2
  implements Runnable
{
  ExtControlProviderMsg$2(ExtControlProviderMsg paramExtControlProviderMsg, ad paramad, String[] paramArrayOfString, com.tencent.mm.pluginsdk.d.a.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20350);
    Object localObject = new fi();
    ((fi)localObject).cza.toUserName = this.lQo.field_username;
    ((fi)localObject).cza.content = this.ewE[1];
    ((fi)localObject).cza.type = t.nK(this.lQo.field_username);
    ((fi)localObject).cza.flags = 0;
    if (!com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject))
    {
      this.lQn.vf(4);
      this.jDX.countDown();
      AppMethodBeat.o(20350);
    }
    while (true)
    {
      return;
      m localm = ((fi)localObject).czb.czc;
      try
      {
        localObject = com.tencent.mm.plugin.ext.a.a.ii(((fi)localObject).czb.cvx);
        ExtControlProviderMsg.2.1 local1 = new com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg$2$1;
        local1.<init>(this, (String)localObject);
        aw.Rg().a(522, local1);
        aw.Rg().a(localm, 0);
        AppMethodBeat.o(20350);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ExtControlProviderMsg", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", localException, "", new Object[0]);
        this.lQn.vf(4);
        this.jDX.countDown();
        AppMethodBeat.o(20350);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg.2
 * JD-Core Version:    0.6.2
 */