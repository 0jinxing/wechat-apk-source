package com.tencent.mm.plugin.appbrand.appusage;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vending.c.a;
import java.util.concurrent.TimeUnit;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/FetchStarListLogic;", "", "()V", "Companion", "plugin-appbrand-integration_release"})
public final class ae
{
  public static final a haH;
  private static final long haj;

  static
  {
    AppMethodBeat.i(134558);
    haH = new a((byte)0);
    haj = TimeUnit.DAYS.toSeconds(1L);
    AppMethodBeat.o(134558);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/FetchStarListLogic$Companion;", "", "()V", "FETCH_FREQUENCY", "", "TAG", "", "fetchListFromServer", "", "reason", "", "prescene", "plugin-appbrand-integration_release"})
  public static final class a
  {
    public static void cP(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(134556);
      int i;
      if ((paramInt1 == 2) || (paramInt1 == 7) || (paramInt1 == 8))
        i = 1;
      Object localObject;
      while (true)
        if (i != 0)
        {
          localObject = g.RP();
          j.o(localObject, "MMKernel.storage()");
          localObject = ((e)localObject).Ry().get(ac.a.xNX, Long.valueOf(0L));
          if (localObject == null)
          {
            localObject = new v("null cannot be cast to non-null type kotlin.Long");
            AppMethodBeat.o(134556);
            throw ((Throwable)localObject);
            i = 0;
          }
          else if (((Long)localObject).longValue() > bo.anT())
          {
            ab.d("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "daily fetch blocked by frequency");
            AppMethodBeat.o(134556);
          }
        }
      while (true)
      {
        return;
        localObject = g.RP();
        j.o(localObject, "MMKernel.storage()");
        ((e)localObject).Ry().set(ac.a.xNX, Long.valueOf(bo.anT() + ae.axO()));
        ab.i("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "fetchList reason=" + paramInt1 + ", prescene=" + paramInt2);
        long l = bo.anU();
        new y(paramInt1, paramInt2, 2, 2147483647, 0).acy().j((a)new ae.a.a(paramInt1, l));
        AppMethodBeat.o(134556);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.ae
 * JD-Core Version:    0.6.2
 */