package com.tencent.mm.plugin.appbrand.appusage;

import a.aa;
import a.f.b.j;
import a.l;
import android.support.v7.h.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.cda;
import com.tencent.mm.protocal.protobuf.cdb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionModifyQueue$applyDiff$1$1", "Landroid/support/v7/util/ListUpdateCallback;", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "plugin-appbrand-integration_release"})
public final class c$c
  implements d
{
  c$c(c paramc, android.support.v7.h.c.b paramb, PInt paramPInt, List paramList, c.b paramb1, ArrayList paramArrayList)
  {
  }

  public final void G(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134491);
    Object localObject1 = this.gYN;
    ((PInt)localObject1).value += paramInt2;
    ab.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onInserted position=" + paramInt1 + " count=" + paramInt2);
    label78: Object localObject2;
    if (paramInt1 + paramInt2 == this.gYO.size())
    {
      localObject1 = null;
      paramInt2 = paramInt1 + paramInt2 - 1;
      if (paramInt1 > paramInt2)
        break label215;
      localObject2 = (LocalUsageInfo)this.gYO.get(paramInt1);
      if (paramInt1 != 0)
        break label195;
    }
    label195: for (LocalUsageInfo localLocalUsageInfo = null; ; localLocalUsageInfo = (LocalUsageInfo)this.gYO.get(paramInt1 - 1))
    {
      Object localObject3 = this.gYP;
      if (localObject3 != null)
        ((c.b)localObject3).b((LocalUsageInfo)localObject2);
      localObject3 = this.gYL;
      z.a locala = z.hax;
      localObject2 = c.a((LocalUsageInfo)localObject2);
      if (localObject2 == null)
        j.dWJ();
      c.a((c)localObject3, z.a.a((cda)localObject2, c.a(localLocalUsageInfo), c.a((LocalUsageInfo)localObject1)));
      if (paramInt1 == paramInt2)
        break label215;
      paramInt1++;
      break label78;
      localObject1 = (LocalUsageInfo)this.gYO.get(paramInt1 + paramInt2);
      break;
    }
    label215: AppMethodBeat.o(134491);
  }

  public final void H(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134492);
    Object localObject1 = this.gYN;
    ((PInt)localObject1).value += paramInt2;
    ab.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onRemoved position=" + paramInt1 + " count=" + paramInt2);
    int i = paramInt1 + paramInt2 - 1;
    if (paramInt1 <= i)
      for (paramInt2 = paramInt1; ; paramInt2++)
      {
        Object localObject2 = (LocalUsageInfo)this.gYQ.remove(paramInt1);
        localObject1 = this.gYP;
        if (localObject1 != null)
        {
          j.o(localObject2, "info");
          ((c.b)localObject1).d((LocalUsageInfo)localObject2);
        }
        localObject1 = this.gYL;
        z.a locala = z.hax;
        localObject2 = c.a((LocalUsageInfo)localObject2);
        if (localObject2 == null)
          j.dWJ();
        c.a((c)localObject1, z.a.b((cda)localObject2));
        if (paramInt2 == i)
          break;
      }
    AppMethodBeat.o(134492);
  }

  public final void I(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(134493);
    Object localObject2 = this.gYN;
    ((PInt)localObject2).value += 1;
    ab.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onMoved from " + paramInt1 + " to " + paramInt2);
    localObject2 = (LocalUsageInfo)this.gYQ.remove(paramInt1);
    this.gYQ.add(paramInt2, localObject2);
    localObject2 = this.gYQ.get(paramInt2);
    j.o(localObject2, "tempList[toPosition]");
    Object localObject3 = (LocalUsageInfo)localObject2;
    label122: Object localObject4;
    if (paramInt2 == 0)
    {
      localObject2 = null;
      if (paramInt2 + 1 != this.gYQ.size())
        break label254;
      localObject4 = this.gYP;
      if (localObject4 != null)
        ((c.b)localObject4).c((LocalUsageInfo)localObject3);
      localObject4 = this.gYL;
      localObject5 = z.hax;
      localObject3 = c.a((LocalUsageInfo)localObject3);
      if (localObject3 == null)
        j.dWJ();
      localObject2 = c.a((LocalUsageInfo)localObject2);
      localObject1 = c.a((LocalUsageInfo)localObject1);
      j.p(localObject3, "self");
      if (!z.a.axN())
        break label276;
      if ((localObject2 == null) && (localObject1 == null))
        break label271;
    }
    label271: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      if ((!aa.AUz) || (paramInt1 != 0))
        break label276;
      localObject2 = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(134493);
      throw ((Throwable)localObject2);
      localObject2 = (LocalUsageInfo)this.gYQ.get(paramInt2 - 1);
      break;
      label254: localObject1 = (LocalUsageInfo)this.gYQ.get(paramInt2 + 1);
      break label122;
    }
    label276: Object localObject5 = new cdb();
    ((cdb)localObject5).xcI = ((cda)localObject3);
    ((cdb)localObject5).xcL = 3;
    ((cdb)localObject5).xcJ = ((cda)localObject2);
    ((cdb)localObject5).xcK = ((cda)localObject1);
    c.a((c)localObject4, (cdb)localObject5);
    AppMethodBeat.o(134493);
  }

  public final void a(int paramInt1, int paramInt2, Object paramObject)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.c.c
 * JD-Core Version:    0.6.2
 */