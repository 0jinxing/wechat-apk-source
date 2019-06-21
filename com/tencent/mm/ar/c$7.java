package com.tencent.mm.ar;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.n;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.ahu;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.cnj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

final class c$7
  implements ap.a
{
  c$7(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(16477);
    boolean bool;
    if (this.fCH.fCB.isEmpty())
    {
      ab.i("MicroMsg.GetContactService", "tryStartNetscene respHandler queue maybe this time is null , wait doscene!");
      bool = false;
      AppMethodBeat.o(16477);
      return bool;
    }
    long l1 = bo.anU();
    int i;
    ArrayList localArrayList;
    int j;
    label71: c.a locala;
    if (this.fCH.frc)
    {
      i = 5;
      localArrayList = new ArrayList(i * 2);
      j = 0;
      if (j >= i)
        break label983;
      locala = (c.a)this.fCH.fCB.peek();
      if (locala != null)
        break label183;
      ab.i("MicroMsg.GetContactService", "tryStartNetscene respHandler queue maybe this time is null , break and wait doscene!");
      bool = false;
    }
    while (true)
    {
      label109: int k = localArrayList.size();
      if (k > 0)
      {
        aw.ZK();
        long l2 = com.tencent.mm.model.c.Ru().iV(Thread.currentThread().getId());
        Object localObject1 = d.agM();
        j = 0;
        while (true)
          if (j < k)
          {
            ((b)localObject1).rY((String)localArrayList.get(j));
            j++;
            continue;
            i = 15;
            break;
            label183: Object localObject2 = locala.fCO.woe;
            localObject1 = locala.fCO.wof;
            k = locala.fCP;
            if (((LinkedList)localObject1).size() != ((LinkedList)localObject2).size())
              ab.w("MicroMsg.GetContactService", "find warn %s %s", new Object[] { Integer.valueOf(((LinkedList)localObject1).size()), Integer.valueOf(((LinkedList)localObject2).size()) });
            int m = Math.min(((LinkedList)localObject1).size(), ((LinkedList)localObject2).size());
            if (m <= k)
            {
              this.fCH.fCB.poll();
              if (this.fCH.fCB.isEmpty())
              {
                ab.i("MicroMsg.GetContactService", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is empty break", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
                this.fCH.fCC = 0L;
                this.fCH.fCF.ae(0L, 0L);
                bool = false;
                break label109;
              }
              ab.i("MicroMsg.GetContactService", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is not empty continue next", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
              j++;
              break label71;
            }
            localObject2 = (bbv)((LinkedList)localObject2).get(k);
            m = ((Integer)((LinkedList)localObject1).get(k)).intValue();
            String str1 = bo.bc(aa.a(((bbv)localObject2).wcB), "");
            String str2 = bo.bc(((bbv)localObject2).guS, "");
            localArrayList.add(str1);
            localArrayList.add(str2);
            switch (m)
            {
            default:
              ab.e("MicroMsg.GetContactService", "respHandler getFailed :%d ErrName: %s %s %s", new Object[] { Integer.valueOf(m), str1, str2, Boolean.valueOf(n.mu(str1)) });
              e.pXa.a(832L, 2L, 1L, false);
              bool = false;
            case 0:
            case -477:
            }
            while (true)
            {
              new ak(Looper.getMainLooper()).post(new c.7.1(this, str1, str2, bool));
              locala.fCP += 1;
              break;
              if ((locala.fCO.wog == null) || (locala.fCO.wog.size() <= k) || (!str1.equals(((cnj)locala.fCO.wog.get(k)).username)))
                if (locala.fCO.wog == null)
                {
                  localObject1 = "null";
                  label656: ab.w("MicroMsg.GetContactService", "get antispamticket from resp failed: list:%s idx:%d  user:%s", new Object[] { localObject1, Integer.valueOf(k), str1 });
                }
              for (localObject1 = ""; ; localObject1 = bo.bc(((cnj)locala.fCO.wog.get(k)).xkS, ""))
              {
                ab.i("MicroMsg.GetContactService", "dkverify respHandler mod contact: %s %s %s", new Object[] { str1, str2, localObject1 });
                com.tencent.mm.plugin.subapp.b.gkF.a((bbv)localObject2, (String)localObject1);
                e.pXa.a(832L, 0L, 1L, false);
                bool = true;
                break;
                localObject1 = Integer.valueOf(locala.fCO.wog.size());
                break label656;
              }
              ab.e("MicroMsg.GetContactService", "respHandler getFailed USERNAME_INVAILD :%d ErrName: %s %s %s %s %s", new Object[] { Integer.valueOf(m), str1, str2, Boolean.valueOf(d.agM().rY(str1)), Boolean.valueOf(d.agM().rY(str2)), Boolean.valueOf(n.mu(str1)) });
              e.pXa.a(832L, 1L, 1L, false);
              bool = false;
            }
          }
        aw.ZK();
        com.tencent.mm.model.c.Ru().mB(l2);
      }
      ab.i("MicroMsg.GetContactService", "tryStartNetscene respHandler onTimerExpired netSceneRunning : " + this.fCH.frc + " ret: " + bool + " maxCnt: " + i + " deleteCount: " + k + " take: " + (bo.anU() - l1) + "ms");
      AppMethodBeat.o(16477);
      break;
      label983: bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.c.7
 * JD-Core Version:    0.6.2
 */