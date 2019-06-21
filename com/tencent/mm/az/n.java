package com.tencent.mm.az;

import android.content.ContentValues;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.mc.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.openim.b.l;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.i.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bgu;
import com.tencent.mm.protocal.protobuf.bhp;
import com.tencent.mm.protocal.protobuf.bhr;
import com.tencent.mm.protocal.protobuf.bhs;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class n
  implements com.tencent.mm.ai.f, com.tencent.mm.plugin.messenger.foundation.a.a.i
{
  public HashMap<Integer, HashSet<WeakReference<i.a>>> fBy;
  private final int fCD;
  ap fCF;
  com.tencent.mm.a.f<Integer, Integer> fCy;
  private com.tencent.mm.a.f<Integer, Integer> fLI;
  i fLJ;
  boolean frc;
  long frn;

  public n(i parami)
  {
    AppMethodBeat.i(997);
    this.frc = false;
    this.fCy = new c(200);
    this.fLI = new c(200);
    this.fBy = new HashMap();
    this.frn = 0L;
    this.fCD = 500;
    this.fCF = new ap(g.RS().oAl.getLooper(), new n.1(this), false);
    this.fBy = new HashMap();
    this.fLJ = parami;
    g.RQ();
    g.RO().eJo.a(681, this);
    g.RQ();
    g.RO().eJo.a(806, this);
    AppMethodBeat.o(997);
  }

  public final void a(int paramInt, i.a parama)
  {
    AppMethodBeat.i(998);
    HashSet localHashSet = (HashSet)this.fBy.get(Integer.valueOf(paramInt));
    if (localHashSet == null)
      localHashSet = new HashSet();
    while (true)
    {
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null) && (((i.a)localWeakReference.get()).equals(parama)))
          AppMethodBeat.o(998);
      }
      while (true)
      {
        return;
        localHashSet.add(new WeakReference(parama));
        this.fBy.put(Integer.valueOf(paramInt), localHashSet);
        AppMethodBeat.o(998);
      }
    }
  }

  public final void b(int paramInt, i.a parama)
  {
    AppMethodBeat.i(999);
    HashSet localHashSet = (HashSet)this.fBy.get(Integer.valueOf(paramInt));
    if (localHashSet == null)
      AppMethodBeat.o(999);
    while (true)
    {
      return;
      Iterator localIterator = localHashSet.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          if ((localWeakReference != null) && (localWeakReference.get() != null) && (((i.a)localWeakReference.get()).equals(parama)))
          {
            localHashSet.remove(localWeakReference);
            AppMethodBeat.o(999);
            break;
          }
        }
      if (localHashSet.size() == 0)
      {
        this.fBy.remove(Integer.valueOf(paramInt));
        AppMethodBeat.o(999);
      }
      else
      {
        this.fBy.put(Integer.valueOf(paramInt), localHashSet);
        AppMethodBeat.o(999);
      }
    }
  }

  final void c(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(1000);
    Object localObject = (HashSet)this.fBy.get(Integer.valueOf(paramInt1));
    if (localObject == null)
      AppMethodBeat.o(1000);
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = ((HashSet)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (WeakReference)localIterator.next();
        if ((localObject != null) && (((WeakReference)localObject).get() != null))
          localLinkedList.add(((WeakReference)localObject).get());
      }
      localObject = localLinkedList.iterator();
      while (((Iterator)localObject).hasNext())
        ((i.a)((Iterator)localObject).next()).x(paramInt2, paramString1, paramString2);
      localLinkedList.clear();
      AppMethodBeat.o(1000);
    }
  }

  public final void c(j.b paramb)
  {
    AppMethodBeat.i(1001);
    int j;
    if (paramb != null)
    {
      int i = paramb.getCmdId();
      if (paramb.getBuffer() == null)
      {
        j = -1;
        ab.i("MicroMsg.OplogService", "summeroplog dealWith option cmdId= %d, buf len:%d, stack=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), bo.dpG() });
        paramb.fCv = bo.anU();
        i locali = this.fLJ;
        if (paramb != null)
        {
          paramb.bJt = -1;
          ContentValues localContentValues = new ContentValues();
          if ((paramb.bJt & 0x2) != 0)
            localContentValues.put("inserTime", Long.valueOf(paramb.fCv));
          if ((paramb.bJt & 0x4) != 0)
            localContentValues.put("cmdId", Integer.valueOf(paramb.getCmdId()));
          if ((paramb.bJt & 0x8) != 0)
            localContentValues.put("buffer", paramb.getBuffer());
          if ((paramb.bJt & 0x10) != 0)
            localContentValues.put("reserved1", Integer.valueOf(paramb.oqP));
          if ((paramb.bJt & 0x20) != 0)
            localContentValues.put("reserved2", Long.valueOf(paramb.oqQ));
          if ((paramb.bJt & 0x40) != 0)
            localContentValues.put("reserved3", paramb.oqR);
          if ((paramb.bJt & 0x80) != 0)
            localContentValues.put("reserved4", paramb.oqS);
          j = (int)locali.fni.insert("oplog2", "id", localContentValues);
          if (j > 0)
            paramb.id = j;
        }
      }
    }
    while (true)
    {
      this.fCF.ae(0L, 0L);
      AppMethodBeat.o(1001);
      return;
      j = paramb.getBuffer().length;
      break;
      ab.i("MicroMsg.OplogService", "summeroplog dealWith option null");
    }
  }

  public final void d(j.b paramb)
  {
    AppMethodBeat.i(1002);
    g.RQ();
    long l = g.RP().eJN.iV(Thread.currentThread().getId());
    this.fLJ.b(paramb);
    g.RQ();
    g.RP().eJN.mB(l);
    AppMethodBeat.o(1002);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(1003);
    ab.i("MicroMsg.OplogService", "oplog onsceneEnd errType:%d,errCode:%d,errMsg:%s, sceneType %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.getType()) });
    Object localObject1;
    Object localObject2;
    if (paramm.getType() == 806)
    {
      localObject1 = (bgu)((com.tencent.mm.ai.b)paramm.ftl).fsH.fsP;
      localObject2 = ((l)paramm).gfe;
      if ((paramInt1 == 0) || (paramInt2 == 0))
      {
        if (!(paramm instanceof l))
        {
          AppMethodBeat.o(1003);
          return;
        }
        if (((bgu)localObject1).getBaseResponse() == null)
          break label1002;
      }
    }
    label961: label976: label1002: for (paramInt1 = ((bgu)localObject1).getBaseResponse().Ret; ; paramInt1 = 0)
    {
      paramString = new mc();
      paramString.cHU.ret = paramInt1;
      a.xxA.m(paramString);
      c(((j.b)localObject2).getCmdId(), paramInt1, "", "");
      ab.i("MicroMsg.OplogService", "openim op success, type:%d id %d", new Object[] { Integer.valueOf(((j.b)localObject2).oqP), Integer.valueOf(((j.b)localObject2).getCmdId()) });
      this.fLJ.b((j.b)localObject2);
      this.frc = false;
      paramString = this.fCF;
      if (this.fCy.size() > 0);
      for (long l = 500L; ; l = 0L)
      {
        paramString.ae(l, l);
        AppMethodBeat.o(1003);
        break;
      }
      if ((localObject1 != null) && (((bgu)localObject1).getBaseResponse() != null));
      for (paramm = aa.a(((bgu)localObject1).getBaseResponse().ErrMsg); ; paramm = "")
      {
        if (bo.isNullOrNil(paramm));
        while (true)
        {
          paramInt1 = ((j.b)localObject2).getCmdId();
          c(((j.b)localObject2).getCmdId(), -1, "", paramString);
          this.frc = false;
          paramString = (Integer)this.fLI.ai(Integer.valueOf(paramInt1));
          ab.d("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(((j.b)localObject2).fCv), paramString });
          if (paramString == null)
          {
            this.fLI.k(Integer.valueOf(paramInt1), Integer.valueOf(1));
            AppMethodBeat.o(1003);
            break;
          }
          if (paramString.intValue() < 2)
          {
            this.fLI.k(Integer.valueOf(paramInt1), Integer.valueOf(paramString.intValue() + 1));
            AppMethodBeat.o(1003);
            break;
          }
          ab.d("MicroMsg.OplogService", "summeroplog LRUMap Max now id:%d, inserttime:%d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(((j.b)localObject2).fCv) });
          this.fLJ.b((j.b)localObject2);
          AppMethodBeat.o(1003);
          break;
          if (paramm.getType() != 681)
          {
            AppMethodBeat.o(1003);
            break;
          }
          if ((paramInt1 != 0) || (paramInt2 != 0) || (((b)paramm).fLr == null))
          {
            ab.e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd errType:%d, errCode:%d, rr:%s not retry", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ((b)paramm).fLr.toString() });
            this.frc = false;
            AppMethodBeat.o(1003);
            break;
          }
          localObject2 = ((b.c)((b)paramm).fLr.fLu).fLw;
          if ((((bhr)localObject2).Ret != 0) || (((bhr)localObject2).wKS == null) || (((bhr)localObject2).wKS.wof == null))
          {
            ab.e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", new Object[] { Integer.valueOf(((bhr)localObject2).Ret) });
            this.frc = false;
            AppMethodBeat.o(1003);
            break;
          }
          if ((((bhr)localObject2).wKS == null) || (((bhr)localObject2).wKS.wof.size() == 0));
          while (true)
          {
            new n.a(this, this, ((b)paramm).fLs, ((bhr)localObject2).wKS.wof, ((bhr)localObject2).wKS.wKT).ae(50L, 50L);
            AppMethodBeat.o(1003);
            break;
            localObject1 = new mc();
            ((mc)localObject1).cHU.ret = ((Integer)((bhr)localObject2).wKS.wof.getLast()).intValue();
            LinkedList localLinkedList = ((bhr)localObject2).wKS.wKT;
            mc.a locala = ((mc)localObject1).cHU;
            if (localLinkedList.isEmpty())
            {
              paramString = "";
              locala.cHV = paramString;
              locala = ((mc)localObject1).cHU;
              if (!localLinkedList.isEmpty())
                break label961;
            }
            for (paramString = ""; ; paramString = ((bhp)localLinkedList.getLast()).ncM)
            {
              locala.cHW = paramString;
              if ((!bo.isNullOrNil(((mc)localObject1).cHU.cHV)) || (!bo.isNullOrNil(((mc)localObject1).cHU.cHW)))
                break label976;
              for (paramInt1 = localLinkedList.size() - 1; paramInt1 >= 0; paramInt1--)
              {
                ((mc)localObject1).cHU.cHV = ((bhp)localLinkedList.get(paramInt1)).Title;
                ((mc)localObject1).cHU.cHW = ((bhp)localLinkedList.get(paramInt1)).ncM;
                if ((!bo.isNullOrNil(((mc)localObject1).cHU.cHV)) || (!bo.isNullOrNil(((mc)localObject1).cHU.cHW)))
                  break;
              }
              paramString = ((bhp)localLinkedList.getLast()).Title;
              break;
            }
            a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          }
          paramString = paramm;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.n
 * JD-Core Version:    0.6.2
 */