package com.tencent.mm.plugin.setting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;

final class c$1
  implements n.b
{
  c$1(c paramc)
  {
  }

  public final void a(int paramInt, n paramn, final Object paramObject)
  {
    AppMethodBeat.i(126825);
    if (paramInt == 2)
    {
      paramObject = (String)paramObject;
      paramn = ((j)g.K(j.class)).XM().aoI(paramObject);
      if ((paramn != null) && (!a.jh(paramn.field_type)) && (paramn.NY()) && (!paramn.NZ()))
        g.RS().m(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(126824);
            Object localObject = ((j)g.K(j.class)).XM().aoO(paramObject);
            if ((localObject != null) && (!a.jh(((ap)localObject).field_type)) && (((ad)localObject).NY()) && (!((ad)localObject).NZ()))
            {
              localObject = new bi();
              ((bi)localObject).hO(0);
              ((bi)localObject).ju(paramObject);
              ((bi)localObject).setStatus(6);
              ((bi)localObject).setContent(ah.getContext().getString(2131303114));
              ((bi)localObject).eJ(bf.q(paramObject, System.currentTimeMillis() / 1000L));
              ((bi)localObject).setType(10000);
              ((j)g.K(j.class)).bOr().Z((bi)localObject);
              ab.i("MicroMsg.SubCoreSetting", "insert chatcontact verify sysmsg. %s", new Object[] { paramObject });
            }
            AppMethodBeat.o(126824);
          }
        }
        , 5000L);
    }
    AppMethodBeat.o(126825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.c.1
 * JD-Core Version:    0.6.2
 */