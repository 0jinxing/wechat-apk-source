package com.tencent.mm.plugin.expt.b;

import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.b.a.ct;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.expt.e.c;
import com.tencent.mm.plugin.expt.e.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.aip;
import com.tencent.mm.protocal.protobuf.aiq;
import com.tencent.mm.protocal.protobuf.zf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b extends m
  implements k
{
  private f ehi;
  private int lNQ = 0;

  public b(int paramInt)
  {
    this.lNQ = paramInt;
  }

  private static void vb(int paramInt)
  {
    AppMethodBeat.i(73519);
    int i = (int)bo.anT();
    if (i > paramInt)
    {
      g.RP().Ry().set(ac.a.xVj, Integer.valueOf(i));
      AppMethodBeat.o(73519);
    }
    while (true)
    {
      return;
      g.RP().Ry().set(ac.a.xVj, Integer.valueOf(paramInt));
      AppMethodBeat.o(73519);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(73517);
    this.ehi = paramf;
    long l;
    Object localObject1;
    aip localaip;
    try
    {
      l = bo.yz();
      paramf = new com/tencent/mm/ai/b$a;
      paramf.<init>();
      localObject1 = new com/tencent/mm/protocal/protobuf/aip;
      ((aip)localObject1).<init>();
      paramf.fsJ = ((com.tencent.mm.bt.a)localObject1);
      localObject1 = new com/tencent/mm/protocal/protobuf/aiq;
      ((aiq)localObject1).<init>();
      paramf.fsK = ((com.tencent.mm.bt.a)localObject1);
      paramf.uri = "/cgi-bin/mmexptappsvr-bin/getexptconfig";
      paramf.fsI = 2738;
      paramf.fsL = 0;
      paramf.fsM = 0;
      localObject1 = paramf.acD();
      localaip = (aip)((com.tencent.mm.ai.b)localObject1).fsG.fsP;
      localaip.Scene = this.lNQ;
      localaip.woB = ((Integer)g.RP().Ry().get(ac.a.xVj, Integer.valueOf(0))).intValue();
      paramf = a.bqR().lNF.brw();
      if ((paramf == null) || (paramf.size() <= 0))
        break label303;
      Object localObject2 = new java/util/LinkedList;
      ((LinkedList)localObject2).<init>();
      localaip.woC = ((LinkedList)localObject2);
      Iterator localIterator = paramf.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.expt.d.a locala = (com.tencent.mm.plugin.expt.d.a)localIterator.next();
        localObject2 = new com/tencent/mm/protocal/protobuf/zf;
        ((zf)localObject2).<init>();
        ((zf)localObject2).weA = locala.field_exptId;
        ((zf)localObject2).weB = locala.field_groupId;
        ((zf)localObject2).weC = locala.field_exptSeq;
        localaip.woC.add(localObject2);
      }
    }
    catch (Exception parame)
    {
      ab.printErrStackTrace("MicroMsg.NetSceneGetExpt", parame, "get expt error", new Object[0]);
      i = -1;
      AppMethodBeat.o(73517);
    }
    return i;
    ab.i("MicroMsg.NetSceneGetExpt", "req local exptList [%s] ", new Object[] { Arrays.toString(paramf.toArray()) });
    label303: h.pYm.a(863L, 0L, 1L, false);
    int j = localaip.Scene;
    int k = localaip.woB;
    if (localaip.woC != null);
    for (int i = localaip.woC.size(); ; i = 0)
    {
      ab.i("MicroMsg.NetSceneGetExpt", "get expt config scene[%d] lastGetSvrSec[%d] localExptList[%d] cost[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Long.valueOf(bo.az(l)) });
      i = a(parame, (q)localObject1, this);
      AppMethodBeat.o(73517);
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(73518);
    ab.i("MicroMsg.NetSceneGetExpt", "get expt on gy end. errType[%d] erroCode[%d] errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    long l1;
    int i;
    int j;
    LinkedList localLinkedList1;
    LinkedList localLinkedList2;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aiq)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (paramq != null)
      {
        if (paramq.getBaseResponse().Ret != 0)
        {
          ab.w("MicroMsg.NetSceneGetExpt", "get expt error. resp baseResp [%d] [%s]", new Object[] { Integer.valueOf(paramq.getBaseResponse().Ret), paramq.getBaseResponse().ErrMsg });
          h.pYm.a(863L, 2L, 1L, false);
        }
      }
      else
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(73518);
        return;
      }
      l1 = bo.yz();
      vb(paramq.woD);
      i = paramq.woE;
      g.RP().Ry().set(ac.a.xVi, Integer.valueOf(i));
      if (paramq.woH == 1)
      {
        h.pYm.a(863L, 7L, 1L, false);
        long l2 = bo.yz();
        paramArrayOfByte = a.bqR();
        paramInt1 = paramArrayOfByte.lNF.brt();
        ab.i("MicroMsg.ExptService", "delete all expt count[%d] map count[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramArrayOfByte.lNG.brt()) });
        paramArrayOfByte.bqQ();
        if (c.bru().brv())
        {
          paramArrayOfByte = c.brs();
          if (paramArrayOfByte != null)
            paramArrayOfByte.clear().commit();
        }
        ab.i("MicroMsg.NetSceneGetExpt", "check need del all expt count[%d] cost[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(bo.az(l2)) });
      }
      for (j = 1; ; j = 0)
      {
        paramArrayOfByte = new LinkedList();
        localLinkedList1 = new LinkedList();
        localLinkedList2 = paramq.woF;
        if ((localLinkedList2 == null) || (localLinkedList2.size() <= 0))
          break label1026;
        ab.i("MicroMsg.NetSceneGetExpt", "delete expt [%s]", new Object[] { Arrays.toString(localLinkedList2.toArray()) });
        localObject1 = localLinkedList2.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Integer)((Iterator)localObject1).next();
          localObject3 = a.bqR().uZ(((Integer)localObject2).intValue());
          if ((localObject3 != null) && (((com.tencent.mm.plugin.expt.d.a)localObject3).bro()))
            localLinkedList1.add(localObject2);
        }
      }
    }
    label1026: for (paramInt1 = a.bqR().bB(localLinkedList2); ; paramInt1 = 0)
    {
      localObject2 = paramq.woG;
      if ((localObject2 != null) && (((List)localObject2).size() > 0))
      {
        localObject1 = new LinkedList();
        ct localct = new ct();
        localObject3 = ((List)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          zf localzf = (zf)((Iterator)localObject3).next();
          com.tencent.mm.plugin.expt.d.a locala = new com.tencent.mm.plugin.expt.d.a();
          locala.La(localzf.weD);
          if ((locala.field_exptId != localzf.weA) || (locala.field_groupId != localzf.weB) || (locala.field_exptSeq != localzf.weC))
          {
            ab.w("MicroMsg.NetSceneGetExpt", "expt item proto[%d %d %d] is different expt content[%d %d %d]", new Object[] { Integer.valueOf(localzf.weA), Integer.valueOf(localzf.weB), Integer.valueOf(localzf.weC), Integer.valueOf(locala.field_exptId), Integer.valueOf(locala.field_groupId), Integer.valueOf(locala.field_exptSeq) });
            h.pYm.a(863L, 6L, 1L, false);
          }
          ((List)localObject1).add(locala);
          ab.i("MicroMsg.NetSceneGetExpt", "get expt item [%s]", new Object[] { locala.toString() });
          if (locala.bro())
            paramArrayOfByte.add(locala);
          localct.dig = locala.field_exptId;
          localct.dih = locala.field_groupId;
          localct.dii = locala.field_exptSeq;
          localct.ajK();
        }
      }
      for (int k = a.bqR().bA((List)localObject1); ; k = 0)
      {
        if ((j != 0) || (paramInt1 > 0) || (k > 0))
          a.bqR().bqS();
        a.bqR();
        a.a(paramArrayOfByte, paramq.vHk, localLinkedList1);
        h.pYm.a(863L, 1L, 1L, false);
        int m = paramq.woD;
        int n = paramq.woH;
        if (localLinkedList2 != null)
        {
          j = localLinkedList2.size();
          label879: if (localObject2 == null)
            break label983;
        }
        label983: for (int i1 = ((List)localObject2).size(); ; i1 = 0)
        {
          ab.i("MicroMsg.NetSceneGetExpt", "update expt svrTime:%d interval:%d exptFlag:%d  deleteCount:[svr:%d local:%d] replaceCount:[svr:%d local:%d] cost[%d]", new Object[] { Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(i1), Integer.valueOf(k), Long.valueOf(bo.az(l1)) });
          break;
          j = 0;
          break label879;
        }
        h.pYm.a(863L, 2L, 1L, false);
        ab.w("MicroMsg.NetSceneGetExpt", "get expt error");
        vb((int)bo.anT());
        break;
      }
    }
  }

  public final int getType()
  {
    return 2738;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.b.b
 * JD-Core Version:    0.6.2
 */