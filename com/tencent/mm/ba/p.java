package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.kernel.a;
import com.tencent.mm.model.bv;
import com.tencent.mm.protocal.protobuf.axd;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class p extends c<mp>
{
  public p()
  {
    AppMethodBeat.i(78501);
    this.xxI = mp.class.getName().hashCode();
    AppMethodBeat.o(78501);
  }

  private static boolean aiv()
  {
    AppMethodBeat.i(78502);
    int i;
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      com.tencent.mm.kernel.g.RN();
      if (!a.QT())
      {
        i = 1;
        if (i == 0)
          break label360;
        if (bo.fp(bo.a((Long)com.tencent.mm.kernel.g.RP().Ry().get(68097, null), 0L)) * 1000L <= 3600000L)
          break label123;
        i = 1;
      }
    }
    LinkedList localLinkedList;
    while (true)
      if (i != 0)
      {
        localLinkedList = new LinkedList();
        Object localObject1 = com.tencent.mm.a.e.f(com.tencent.mm.kernel.g.RP().cachePath + "eggresult.rep", 0, -1);
        if (localObject1 == null)
        {
          AppMethodBeat.o(78502);
          return false;
          i = 0;
          break;
          label123: i = 0;
          continue;
        }
        try
        {
          Object localObject2 = new com/tencent/mm/ba/h;
          ((h)localObject2).<init>();
          localObject1 = ((h)((h)localObject2).parseFrom((byte[])localObject1)).fMm.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (g)((Iterator)localObject1).next();
            Object localObject3;
            Object localObject4;
            if (((g)localObject2).fMk != 0)
            {
              localObject3 = new com/tencent/mm/protocal/protobuf/axd;
              ((axd)localObject3).<init>();
              ((axd)localObject3).pXC = 17;
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((axd)localObject3).pXM = (((g)localObject2).cKB + "," + ((g)localObject2).fMk);
              localLinkedList.add(localObject3);
            }
            if (((g)localObject2).fMl != 0)
            {
              localObject4 = new com/tencent/mm/protocal/protobuf/axd;
              ((axd)localObject4).<init>();
              ((axd)localObject4).pXC = 18;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((axd)localObject4).pXM = (((g)localObject2).cKB + "," + ((g)localObject2).fMl);
              localLinkedList.add(localObject4);
            }
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.PostTaskReportEgg", "exception:%s", new Object[] { bo.l(localException) });
        }
      }
    while (true)
    {
      if (!localLinkedList.isEmpty())
      {
        bv.b(localLinkedList);
        com.tencent.mm.kernel.g.RP().Ry().set(68097, Long.valueOf(bo.anT()));
      }
      label360: ab.d("MicroMsg.PostTaskReportEgg", "report egg done");
      AppMethodBeat.o(78502);
      break;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      com.tencent.mm.a.e.deleteFile(com.tencent.mm.kernel.g.RP().cachePath + "eggresult.rep");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.p
 * JD-Core Version:    0.6.2
 */