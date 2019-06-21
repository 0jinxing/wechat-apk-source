package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.protocal.protobuf.awu;
import com.tencent.mm.protocal.protobuf.awv;
import com.tencent.mm.protocal.protobuf.awx;
import com.tencent.mm.protocal.protobuf.cwa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class h
  implements f
{
  Object cli;
  Set<String> fwm;
  public LinkedList<h.a> fwn;

  public h()
  {
    AppMethodBeat.i(11385);
    this.cli = new Object();
    this.fwm = new HashSet();
    this.fwn = new LinkedList();
    AppMethodBeat.o(11385);
  }

  private void d(LinkedList<cwa> paramLinkedList)
  {
    AppMethodBeat.i(11391);
    synchronized (this.cli)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(this.fwn);
      for (int i = 0; i < localArrayList.size(); i++)
      {
        h.a locala = (h.a)localArrayList.get(i);
        if (locala != null)
          locala.e(paramLinkedList);
      }
      AppMethodBeat.o(11391);
      return;
    }
  }

  public final void a(h.a parama)
  {
    AppMethodBeat.i(11386);
    synchronized (this.cli)
    {
      if (!this.fwn.contains(parama))
      {
        Iterator localIterator = this.fwn.iterator();
        while (localIterator.hasNext())
        {
          h.a locala = (h.a)localIterator.next();
          if ((locala != null) && (bo.nullAsNil(parama.aeI()).equals(bo.nullAsNil(locala.aeI()))))
          {
            ab.i("MicroMsg.BizKFService", "the same callbacker %s, return", new Object[] { parama.aeI() });
            AppMethodBeat.o(11386);
            return;
          }
        }
        this.fwn.add(parama);
      }
      AppMethodBeat.o(11386);
    }
  }

  public final void ax(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11388);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.BizKFService", "doKFGetBindList null brandname");
      AppMethodBeat.o(11388);
    }
    while (true)
    {
      return;
      paramString2 = new u(paramString1, paramString2);
      com.tencent.mm.kernel.g.RO().eJo.a(paramString2, 0);
      ab.v("MicroMsg.BizKFService", "doKFGetBindList %s, %d", new Object[] { paramString1, Integer.valueOf(this.fwn.size()) });
      AppMethodBeat.o(11388);
    }
  }

  public final void ay(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11389);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.BizKFService", "doKFGetDefaultList error args, %s, %s", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(11389);
    }
    while (true)
    {
      return;
      if (this.fwm.contains(paramString2))
      {
        ab.i("MicroMsg.BizKFService", "doKFGetInfoList: same is running, %s", new Object[] { paramString2 });
        AppMethodBeat.o(11389);
      }
      else
      {
        this.fwm.add(paramString2);
        Object localObject = new LinkedList();
        ((LinkedList)localObject).add(paramString2);
        localObject = new w(paramString1, (LinkedList)localObject);
        ((w)localObject).tag = paramString2;
        com.tencent.mm.kernel.g.RO().eJo.a((m)localObject, 0);
        ab.i("MicroMsg.BizKFService", "doKFGetInfoList %s, %s, %d", new Object[] { paramString1, paramString2, Integer.valueOf(this.fwn.size()) });
        AppMethodBeat.o(11389);
      }
    }
  }

  public final void b(h.a parama)
  {
    AppMethodBeat.i(11387);
    synchronized (this.cli)
    {
      if (this.fwn.contains(parama))
        this.fwn.remove(parama);
      AppMethodBeat.o(11387);
      return;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(11390);
    ab.i("MicroMsg.BizKFService", "onSceneEnd errType = %s, errCode = %s, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramm == null)
    {
      ab.e("MicroMsg.BizKFService", "scene == null");
      d(null);
      AppMethodBeat.o(11390);
    }
    com.tencent.mm.ah.i locali;
    LinkedList localLinkedList;
    long l;
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.BizKFService", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
        d(null);
        if (paramm.getType() == 675)
          this.fwm.remove(((w)paramm).tag);
        AppMethodBeat.o(11390);
      }
      else
      {
        ab.i("MicroMsg.BizKFService", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
        locali = o.act();
        localLinkedList = new LinkedList();
        paramString = null;
        l = System.currentTimeMillis();
        if (paramm.getType() != 672)
          break label452;
        if (((v)paramm).aeN() == null)
        {
          ab.e("MicroMsg.BizKFService", "resp is null, type = %s", new Object[] { Integer.valueOf(paramm.getType()) });
          d(null);
          AppMethodBeat.o(11390);
        }
        else
        {
          paramString = ((v)paramm).aeN().wBb;
          if ((paramString != null) && (paramString.size() > 0))
            break;
          ab.e("MicroMsg.BizKFService", "empty workers");
          d(null);
          AppMethodBeat.o(11390);
        }
      }
    }
    Object localObject1 = paramString.iterator();
    Object localObject2;
    com.tencent.mm.ah.h localh;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (cwa)((Iterator)localObject1).next();
      localLinkedList.add(new g(((cwa)localObject2).xrU, ((v)paramm).fwO, ((cwa)localObject2).mZW, ((cwa)localObject2).wCW, 1, l));
      if (locali != null)
      {
        localh = new com.tencent.mm.ah.h();
        localh.username = ((cwa)localObject2).xrU;
        localh.frV = ((cwa)localObject2).mZW;
        localh.cB(false);
        localh.dtR = 3;
        locali.b(localh);
        o.acv().qa(((cwa)localObject2).xrU);
      }
    }
    while (true)
    {
      ab.i("MicroMsg.BizKFService", "insertOrUpdateBizKFs %d", new Object[] { Integer.valueOf(z.aeQ().f(localLinkedList)) });
      d(paramString);
      AppMethodBeat.o(11390);
      break;
      label452: if (paramm.getType() == 675)
      {
        this.fwm.remove(((w)paramm).tag);
        if (((w)paramm).aeO() == null)
        {
          ab.e("MicroMsg.BizKFService", "KFGetInfoList resp is null, type = %s", new Object[] { Integer.valueOf(paramm.getType()) });
          d(null);
          AppMethodBeat.o(11390);
          break;
        }
        paramString = ((w)paramm).aeO().wBb;
        if ((paramString == null) || (paramString.size() <= 0))
        {
          ab.e("MicroMsg.BizKFService", "empty workers");
          d(null);
          AppMethodBeat.o(11390);
          break;
        }
        localObject1 = paramString.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (cwa)((Iterator)localObject1).next();
          ab.i("MicroMsg.BizKFService", "onScenEnd: workers=%s, tag=%s", new Object[] { ((cwa)localObject2).xrU, ((w)paramm).tag });
          localLinkedList.add(new g(((cwa)localObject2).xrU, ((w)paramm).fwO, ((cwa)localObject2).mZW, ((cwa)localObject2).wCW, ((w)paramm).fwP, l));
          if (locali != null)
          {
            localh = new com.tencent.mm.ah.h();
            localh.username = ((cwa)localObject2).xrU;
            localh.frV = ((cwa)localObject2).mZW;
            localh.cB(false);
            localh.dtR = 3;
            locali.b(localh);
            o.acv().qa(((cwa)localObject2).xrU);
          }
        }
        continue;
      }
      if (paramm.getType() == 674)
      {
        if (((u)paramm).aeM() == null)
        {
          ab.e("MicroMsg.BizKFService", "resp is null, type = %s", new Object[] { Integer.valueOf(paramm.getType()) });
          d(null);
          AppMethodBeat.o(11390);
          break;
        }
        paramString = ((u)paramm).aeM().wBb;
        if ((paramString == null) || (paramString.size() <= 0))
        {
          ab.e("MicroMsg.BizKFService", "empty workers");
          d(null);
          AppMethodBeat.o(11390);
          break;
        }
        localObject2 = paramString.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (cwa)((Iterator)localObject2).next();
          localLinkedList.add(new g(((cwa)localObject1).xrU, ((u)paramm).fwO, ((cwa)localObject1).mZW, ((cwa)localObject1).wCW, 2, l));
          if (locali != null)
          {
            localh = new com.tencent.mm.ah.h();
            localh.username = ((cwa)localObject1).xrU;
            localh.frV = ((cwa)localObject1).mZW;
            localh.cB(false);
            localh.dtR = 3;
            locali.b(localh);
            o.acv().qa(((cwa)localObject1).xrU);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.h
 * JD-Core Version:    0.6.2
 */