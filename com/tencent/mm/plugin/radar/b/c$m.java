package com.tencent.mm.plugin.radar.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/model/RadarAddContact$verifyContact$add$1", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$IOnAddContactHelper;", "canAddContact", "", "ok", "", "hasSentVerify", "respUsername", "", "errMsg", "plugin-radar_release"})
public final class c$m
  implements c.d
{
  public c$m(String paramString, long paramLong)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(102883);
    if (paramBoolean1)
    {
      Object localObject1 = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject1, "service(IMessengerStorage::class.java)");
      Object localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject1).XM().aoO(paramString1);
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        paramBoolean2 = paramBoolean1;
        if (((ad)localObject2).Oh() != 0);
      }
      else
      {
        localObject1 = c.a(bi.d.apF(this.pBi));
        localObject2 = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
        a.f.b.j.o(localObject2, "service(IMessengerStorage::class.java)");
        if (!((com.tencent.mm.plugin.messenger.foundation.a.j)localObject2).XM().Z((ad)localObject1))
        {
          ab.e(c.access$getTAG$cp(), "canAddContact fail, insert fail");
          paramBoolean1 = false;
        }
        localObject2 = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
        a.f.b.j.o(localObject2, "service(IMessengerStorage::class.java)");
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject2).XM().aoO(((ad)localObject1).getUsername());
        paramBoolean2 = paramBoolean1;
      }
      ab.d(c.access$getTAG$cp(), "verifyContact return ok");
      t.q((ad)localObject1);
      c.cS(paramString1, 1);
    }
    while (true)
    {
      c.a(this.pAV, paramBoolean2, paramString2, paramString1, this.pBb);
      AppMethodBeat.o(102883);
      return;
      ab.d(c.access$getTAG$cp(), "verifyContact return not ok");
      paramBoolean2 = paramBoolean1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.c.m
 * JD-Core Version:    0.6.2
 */