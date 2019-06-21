package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ds;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.aub;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class k$2
  implements ap.a
{
  public final boolean BI()
  {
    AppMethodBeat.i(15856);
    Object localObject2;
    try
    {
      aw.ZK();
      Boolean localBoolean = Boolean.valueOf(bo.a((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xMr, null), false));
      localObject1 = g.Nv().Nl();
      if (localObject1 == null)
        break label382;
      localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("op=false,isInShakeUI:");
        ab.i("MicroMsg.PostTaskStartRangeForIBeacon", localBoolean + ",iBeacon = %s", new Object[] { localObject1 });
        localObject3 = new com/tencent/mm/g/a/ds;
        ((ds)localObject3).<init>();
        ((ds)localObject3).cxg.cxi = ((String)localObject1);
        ((ds)localObject3).cxg.cxf = false;
        if (!localBoolean.booleanValue())
          a.xxA.m((b)localObject3);
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.PostTaskStartRangeForIBeacon", localException.getMessage());
      AppMethodBeat.o(15856);
    }
    return false;
    Object localObject1 = new com/tencent/mm/protocal/protobuf/aub;
    ((aub)localObject1).<init>();
    ((aub)localObject1).latitude = k.Iy();
    ((aub)localObject1).longitude = k.Iz();
    aw.ZK();
    long l = bo.a((Long)com.tencent.mm.model.c.Ry().get(ac.a.xMi, null), 0L);
    if ((k.IA().size() > 0) && (!k.IB().booleanValue()) && (k.IC().size() > 0))
    {
      k.b(Boolean.TRUE);
      com.tencent.mm.modelmulti.c localc = new com/tencent/mm/modelmulti/c;
      localc.<init>(k.IC(), l, (aub)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("[shakezb]PostTaskStartRangeForIBeacon[kevinkma] shopId ");
      ab.d("MicroMsg.PostTaskStartRangeForIBeacon", l + ",beaconInfos size " + k.IC().size() + ",info:" + k.IC().toString());
      localObject1 = aw.Rg();
      localObject2 = new com/tencent/mm/booter/k$2$1;
      ((k.2.1)localObject2).<init>(this, localc);
      ((p)localObject1).a(1708, (f)localObject2);
      aw.Rg().a(localc, 0);
    }
    while (true)
    {
      k.IA().clear();
      k.IC().clear();
      a.xxA.d(k.ID());
      label382: AppMethodBeat.o(15856);
      break;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xMn, "");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.k.2
 * JD-Core Version:    0.6.2
 */