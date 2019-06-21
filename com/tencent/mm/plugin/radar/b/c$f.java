package com.tencent.mm.plugin.radar.b;

import a.f.b.z;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Collection;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/model/RadarAddContact$addContact$add$1", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$IOnAddContactHelper;", "canAddContact", "", "ok", "", "hasSentVerify", "respUsername", "", "errMsg", "plugin-radar_release"})
public final class c$f
  implements c.d
{
  c$f(String paramString, long paramLong)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(102876);
    if (paramBoolean1)
    {
      Object localObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject, "service(IMessengerStorage::class.java)");
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoO(paramString1);
      a.f.b.j.o(localObject, "contact");
      if (((ad)localObject).Oh() > 0)
        t.q((ad)localObject);
      c.cS(paramString1, 1);
      if (a.a.j.a((Iterable)c.a(this.pAV), paramString1))
      {
        localObject = (Collection)c.a(this.pAV);
        if (localObject == null)
        {
          paramString1 = new v("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
          AppMethodBeat.o(102876);
          throw paramString1;
        }
        z.dp(localObject).remove(paramString1);
      }
      ab.d(c.access$getTAG$cp(), "addContact %s return ok", new Object[] { this.hBP });
    }
    while (true)
    {
      c.a(this.pAV, paramBoolean1, paramBoolean2, paramString2, paramString1, this.pBb);
      AppMethodBeat.o(102876);
      return;
      if (paramBoolean2)
      {
        if ((paramString1 != null) && (!c.a(this.pAV).contains(paramString1)))
          c.a(this.pAV).add(paramString1);
        c.cS(paramString1, 2);
        ab.d(c.access$getTAG$cp(), "addContact has sent verify to %s", new Object[] { this.hBP });
      }
      else
      {
        ab.d(c.access$getTAG$cp(), "addContact return not ok, user canceled or error");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.c.f
 * JD-Core Version:    0.6.2
 */