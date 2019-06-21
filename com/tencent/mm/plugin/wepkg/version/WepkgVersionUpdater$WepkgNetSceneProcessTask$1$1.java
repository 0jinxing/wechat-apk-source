package com.tencent.mm.plugin.wepkg.version;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ho;
import com.tencent.mm.g.a.ho.a;
import com.tencent.mm.plugin.wepkg.c.a.a;
import com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.wepkg.model.g;
import com.tencent.mm.plugin.wepkg.model.h.6;
import com.tencent.mm.plugin.wepkg.model.h.7;
import com.tencent.mm.plugin.wepkg.model.i;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.protocal.protobuf.bkj;
import com.tencent.mm.protocal.protobuf.cvn;
import com.tencent.mm.protocal.protobuf.cvo;
import com.tencent.mm.protocal.protobuf.cvr;
import com.tencent.mm.protocal.protobuf.cvu;
import com.tencent.mm.protocal.protobuf.si;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

final class WepkgVersionUpdater$WepkgNetSceneProcessTask$1$1
  implements Runnable
{
  WepkgVersionUpdater$WepkgNetSceneProcessTask$1$1(WepkgVersionUpdater.WepkgNetSceneProcessTask.1 param1, si paramsi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63667);
    Object localObject1 = this.uYl;
    int i = WepkgVersionUpdater.WepkgNetSceneProcessTask.b(this.uYm.uYk);
    boolean bool1 = WepkgVersionUpdater.WepkgNetSceneProcessTask.c(this.uYm.uYk);
    if (localObject1 != null)
      if (bo.ek(((si)localObject1).vZE))
      {
        ab.e("MicroMsg.Wepkg.WepkgManager", "response.PkgList.size() is empty");
        AppMethodBeat.o(63667);
      }
    while (true)
    {
      return;
      Object localObject2 = new HashSet();
      Object localObject3 = new ArrayList();
      localObject1 = ((si)localObject1).vZE.iterator();
      Object localObject4;
      Object localObject5;
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (bkj)((Iterator)localObject1).next();
        if (localObject4 != null)
        {
          localObject5 = ((bkj)localObject4).mZV;
          cvr localcvr = ((bkj)localObject4).wNv;
          Object localObject6 = ((bkj)localObject4).wNx;
          if (!bo.isNullOrNil((String)localObject5))
            if (localObject6 != null)
            {
              if (((cvn)localObject6).xrz)
              {
                ab.i("MicroMsg.Wepkg.WepkgManager", "wepkg reload now");
                com.tencent.mm.plugin.report.service.h.pYm.a(859L, 17L, 1L, false);
                if (((bkj)localObject4).wNw != null)
                  ForceUpdateNotify.wy(((bkj)localObject4).mZV);
              }
              if (((cvn)localObject6).xry)
                com.tencent.mm.plugin.wepkg.model.b.dgz().dP((String)localObject5, 2);
            }
            else if ((localcvr != null) && (localcvr.xrH != null))
            {
              if (bo.isNullOrNil(localcvr.xrH.xrA))
              {
                localObject4 = new WepkgCrossProcessTask();
                ((WepkgCrossProcessTask)localObject4).Cn = 2004;
                ((WepkgCrossProcessTask)localObject4).uWY.eBS = ((String)localObject5);
                if (ah.bqo())
                  d.aNS().aa(new h.6((WepkgCrossProcessTask)localObject4));
                while (true)
                {
                  com.tencent.mm.plugin.report.service.h.pYm.a(859L, 18L, 1L, false);
                  break;
                  ((WepkgCrossProcessTask)localObject4).hww = new h.7((WepkgCrossProcessTask)localObject4);
                  ((WepkgCrossProcessTask)localObject4).aBV();
                  WepkgMainProcessService.a((WepkgMainProcessTask)localObject4);
                }
              }
              boolean bool2 = localcvr.xrH.xrB;
              long l1 = localcvr.xrH.xrC;
              long l2 = localcvr.xrH.xrD;
              localObject6 = new WepkgCrossProcessTask();
              ((WepkgCrossProcessTask)localObject6).Cn = 3004;
              ((WepkgCrossProcessTask)localObject6).uWY.eBS = ((String)localObject5);
              ((WepkgCrossProcessTask)localObject6).uWY.uXG = bool2;
              ((WepkgCrossProcessTask)localObject6).uWY.uXH = l1;
              ((WepkgCrossProcessTask)localObject6).uWY.uXI = l2;
              if (ah.bqo())
              {
                ((WepkgCrossProcessTask)localObject6).asP();
                label429: localObject6 = new WepkgCrossProcessTask();
                ((WepkgCrossProcessTask)localObject6).Cn = 3009;
                ((WepkgCrossProcessTask)localObject6).uWY.eBS = ((String)localObject5);
                if (!ah.bqo())
                  break label556;
                ((WepkgCrossProcessTask)localObject6).asP();
                label467: localObject6 = new WepkgCrossProcessTask();
                ((WepkgCrossProcessTask)localObject6).Cn = 4006;
                ((WepkgCrossProcessTask)localObject6).uXb.eBS = ((String)localObject5);
                if (!ah.bqo())
                  break label565;
                ((WepkgCrossProcessTask)localObject6).asP();
              }
              while (true)
              {
                if (bool1)
                {
                  localObject5 = g.a((bkj)localObject4);
                  if (!bo.ek((List)localObject5))
                    ((Set)localObject2).addAll((Collection)localObject5);
                }
                ((List)localObject3).add(localObject4);
                break;
                WepkgMainProcessService.b((WepkgMainProcessTask)localObject6);
                break label429;
                label556: WepkgMainProcessService.b((WepkgMainProcessTask)localObject6);
                break label467;
                label565: WepkgMainProcessService.b((WepkgMainProcessTask)localObject6);
              }
            }
        }
      }
      ForceUpdateNotify.bny();
      a.a.dgE().l((Set)localObject2);
      if (!bo.ek((List)localObject3))
      {
        localObject1 = ((List)localObject3).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (bkj)((Iterator)localObject1).next();
          localObject3 = i.dgD();
          if ((localObject2 == null) || (((bkj)localObject2).wNw == null))
          {
            ab.i("MicroMsg.Wepkg.WepkgUpdater", "dont need to update wepkg");
            if (localObject2 != null)
              ((i)localObject3).bQ(((bkj)localObject2).mZV, false);
          }
          else
          {
            localObject4 = ((bkj)localObject2).wNw.xrL;
            localObject5 = ((bkj)localObject2).wNw.xrM;
            if ((localObject4 == null) && (localObject5 == null))
            {
              ab.i("MicroMsg.Wepkg.WepkgUpdater", "bigPackage is null and preloadFiles is null");
              com.tencent.mm.plugin.wepkg.model.b.dgz().dP(((bkj)localObject2).mZV, 2);
            }
            else
            {
              com.tencent.mm.plugin.wepkg.model.h.a((bkj)localObject2, i);
              ab.i("MicroMsg.Wepkg.WepkgUpdater", "downloadTriggerType:%d", new Object[] { Integer.valueOf(i) });
              switch (i)
              {
              default:
                break;
              case -1:
              case 0:
                ((i)localObject3).bQ(((bkj)localObject2).mZV, false);
                break;
              case 1:
                if (d.eA(ah.getContext()))
                  ((i)localObject3).bQ(((bkj)localObject2).mZV, false);
                break;
              case 2:
                localObject4 = new ho();
                com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject4);
                if (((ho)localObject4).cCs.cCt)
                  ((i)localObject3).bQ(((bkj)localObject2).mZV, false);
                break;
              }
            }
          }
        }
      }
      AppMethodBeat.o(63667);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater.WepkgNetSceneProcessTask.1.1
 * JD-Core Version:    0.6.2
 */