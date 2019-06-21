package com.tencent.mm.plugin.expt.c;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.k;
import com.tencent.mm.g.b.a.q;
import com.tencent.mm.g.b.a.w;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class d
  implements Application.ActivityLifecycleCallbacks, com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.expt.a.c
{
  private static int[] lNU = { 10, 1000, 10000, 100000 };
  private static boolean lNV = false;
  private static d lNW;
  private boolean lNX;
  private boolean lNY;
  private String lNZ;
  private HashSet<String> lOa;
  private com.tencent.mm.sdk.b.c<k> lOb;
  private com.tencent.mm.sdk.b.c lOc;

  private d()
  {
    AppMethodBeat.i(73537);
    this.lNX = false;
    this.lNY = false;
    this.lNZ = "";
    this.lOa = new HashSet();
    this.lOb = new d.2(this);
    this.lOc = new d.3(this);
    if (!ah.bqo())
      lNV = true;
    AppMethodBeat.o(73537);
  }

  private void a(Activity paramActivity, com.tencent.mm.plugin.expt.a.c.a parama)
  {
    AppMethodBeat.i(73540);
    if (paramActivity != null)
      a(paramActivity.getComponentName().getClassName(), parama, paramActivity.hashCode());
    AppMethodBeat.o(73540);
  }

  private void a(String paramString, com.tencent.mm.plugin.expt.a.c.a parama, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(73542);
    long l1 = bo.yz();
    if (!ah.bqo())
    {
      if (c.lNS == null)
        c.lNS = new c();
      Object localObject1 = c.lNS;
      ab.i("MicroMsg.MMPageFlowSenderByIPCInvoker", "%s send page flow [%s-%d-%d] [%s]", new Object[] { localObject1.hashCode(), paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong), parama });
      localObject1 = new Bundle();
      ((Bundle)localObject1).putInt("key_page_flow_type", parama.value);
      ((Bundle)localObject1).putString("key_page_flow_name", paramString);
      ((Bundle)localObject1).putInt("key_page_flow_hashcode", paramInt1);
      ((Bundle)localObject1).putLong("key_page_flow_time_stamp", paramLong);
      com.tencent.mm.plugin.report.service.h.pYm.a(932L, 100L, 1L, false);
      Object localObject2 = ((Bundle)localObject1).getString("key_page_flow_name");
      int i = ((Bundle)localObject1).getInt("key_page_flow_type");
      int j = ((Bundle)localObject1).getInt("key_page_flow_hashcode", 0);
      long l2 = ((Bundle)localObject1).getLong("key_page_flow_time_stamp", 0L);
      String str = new StringBuilder().append(j).append("_").append(l2).toString().hashCode();
      Object localObject3 = new q();
      ((q)localObject3).cWU = j;
      localObject2 = ((q)localObject3).eN((String)localObject2);
      ((q)localObject2).cWS = i;
      ((q)localObject2).aP(l2);
      localObject2 = b.bqZ();
      localObject3 = ((q)localObject3).Fj();
      localObject2 = ((b)localObject2).bra();
      if (localObject2 != null)
        ((as)localObject2).putString(str, (String)localObject3);
      f.a("com.tencent.mm", (Parcelable)localObject1, c.a.class, null);
      ab.d("MicroMsg.MMPageFlowService", "reportPageFlow: mm-process NOT");
      lNV = true;
    }
    if (!lNV)
    {
      ab.e("MicroMsg.MMPageFlowService", "reportPageFlow: mm-process isAccReady = FALSE");
      AppMethodBeat.o(73542);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.MMPageFlowService", "reportPageFlow: mm-process YES");
      if (ah.bqo())
        brd();
      a(paramString, parama, paramInt1, paramLong, paramInt2);
      ab.v("MicroMsg.MMPageFlowService", "report page Flow cost[%d]", new Object[] { Long.valueOf(bo.az(l1)) });
      AppMethodBeat.o(73542);
    }
  }

  private void a(String paramString, com.tencent.mm.plugin.expt.a.c.a parama, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(73545);
    if ((paramString.contains("WeChatSplashActivity")) || (paramString.contains("FakeSwitchAccountUI")))
    {
      AppMethodBeat.o(73545);
      return;
    }
    int i;
    if (parama.value <= 2)
      i = 0;
    while (true)
    {
      if (parama == com.tencent.mm.plugin.expt.a.c.a.lMc)
        this.lNY = true;
      if (parama == com.tencent.mm.plugin.expt.a.c.a.lMd)
        this.lNY = false;
      Object localObject = new w();
      ((w)localObject).cWc = paramInt2;
      paramString = ((w)localObject).eS(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).eHT).eT(paramString);
      localObject = lNU;
      paramInt2 = localObject[i];
      localObject[i] = (paramInt2 + 1);
      paramString.cYc = paramInt2;
      paramString.cWS = parama.value;
      paramString = paramString.aQ(paramLong);
      paramString.cWU = paramInt1;
      e.brf().a(paramString);
      ab.d("MicroMsg.MMPageFlowService", "%s pure report [%s]", new Object[] { aZm(), paramString.Fk() });
      if ((parama == com.tencent.mm.plugin.expt.a.c.a.lMc) || (parama == com.tencent.mm.plugin.expt.a.c.a.lMd))
        ab.i("MicroMsg.MMPageFlowService", "habbyge-mali, %s frontback-pure-report [%s]", new Object[] { aZm(), paramString.Fk() });
      if ((ah.bqo()) && ((parama == com.tencent.mm.plugin.expt.a.c.a.lMc) || (parama == com.tencent.mm.plugin.expt.a.c.a.lMd)))
      {
        q(paramLong, this.lNY);
        com.tencent.mm.plugin.expt.hellhound.core.a.b.putInt("page_hell_seq_mmkv_key", lNU[3]);
      }
      AppMethodBeat.o(73545);
      break;
      if (parama.value <= 4)
        i = 1;
      else if (parama.value <= 6)
        i = 2;
      else
        i = 3;
    }
  }

  private String aZm()
  {
    AppMethodBeat.i(73539);
    String str = hashCode();
    AppMethodBeat.o(73539);
    return str;
  }

  public static d brb()
  {
    AppMethodBeat.i(73538);
    if (lNW == null)
      lNW = new d();
    d locald = lNW;
    AppMethodBeat.o(73538);
    return locald;
  }

  public static boolean brc()
  {
    return lNV;
  }

  private void q(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(73552);
    if (!lNV)
      AppMethodBeat.o(73552);
    while (true)
    {
      return;
      int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIi, 0);
      if (i <= 0)
      {
        AppMethodBeat.o(73552);
      }
      else
      {
        long l = com.tencent.mm.kernel.g.RP().Ry().a(ac.a.xWI, 0L);
        if (bo.anT() - l < i)
        {
          AppMethodBeat.o(73552);
        }
        else
        {
          com.tencent.mm.sdk.g.d.xDG.remove("calc_unread_task");
          com.tencent.mm.sdk.g.d.xDG.b(new d.4(this, paramLong, paramBoolean), "calc_unread_task", 5000L);
          AppMethodBeat.o(73552);
        }
      }
    }
  }

  private static void reset()
  {
    lNU = new int[] { 10, 1000, 10000, 100000 };
    lNV = false;
  }

  public final void a(String paramString, com.tencent.mm.plugin.expt.a.c.a parama, int paramInt)
  {
    AppMethodBeat.i(73543);
    a(paramString, parama, paramInt, Process.myPid(), System.currentTimeMillis());
    AppMethodBeat.o(73543);
  }

  public final void a(String paramString, com.tencent.mm.plugin.expt.a.c.a parama, int paramInt, long paramLong)
  {
    AppMethodBeat.i(73546);
    a(paramString, parama, paramInt, paramLong, Process.myPid());
    AppMethodBeat.o(73546);
  }

  protected final void brd()
  {
    AppMethodBeat.i(73544);
    if (!ah.bqo())
      AppMethodBeat.o(73544);
    while (true)
    {
      return;
      long l = bo.yz();
      Object localObject1 = b.bqZ().allKeys();
      ArrayList localArrayList = new ArrayList();
      q localq;
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        int i = localObject1.length;
        int j = 0;
        if (j < i)
        {
          Object localObject2 = localObject1[j];
          if (!this.lOa.contains(localObject2))
          {
            String str = b.bqZ().get(localObject2, "");
            if (!bo.isNullOrNil(str))
            {
              localq = new q(str);
              if ((localq.cWU > 0L) && (localq.cWT > 0L))
              {
                localArrayList.add(new q(str));
                this.lOa.add(localObject2);
              }
              b.bqZ().remove(localObject2);
            }
          }
          while (true)
          {
            j++;
            break;
            b.bqZ().remove(localObject2);
          }
        }
      }
      if (!localArrayList.isEmpty())
      {
        Collections.sort(localArrayList, new d.1(this));
        localObject1 = localArrayList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localq = (q)((Iterator)localObject1).next();
          a(localq.cWR, com.tencent.mm.plugin.expt.a.c.a.uW((int)localq.cWS), (int)localq.cWU, localq.cWT);
        }
        com.tencent.mm.plugin.report.service.h.pYm.a(932L, 102L, localArrayList.size(), false);
        ab.i("MicroMsg.MMPageFlowService", "check mmkv list[%d] cost[%d]", new Object[] { Integer.valueOf(localArrayList.size()), Long.valueOf(bo.az(l)) });
      }
      ab.d("MicroMsg.MMPageFlowService", "check mm kv cost[%d]", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(73544);
    }
  }

  public final void logout()
  {
    AppMethodBeat.i(73541);
    lNV = false;
    com.tencent.mm.plugin.expt.hellhound.a.a.b.s(106, null, null);
    com.tencent.mm.plugin.expt.hellhound.a.a.b.bqF();
    com.tencent.mm.plugin.expt.hellhound.a.a.a.uY(8);
    com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.uX(8);
    com.tencent.mm.plugin.expt.hellhound.a.a.a.gR(true);
    ab.i("MicroMsg.MMPageFlowService", "habbyge-mali, MMPageFlowService: logout补偿上报");
    AppMethodBeat.o(73541);
  }

  public final void onAccountInitialized(e.c paramc)
  {
    int i = 1;
    AppMethodBeat.i(73547);
    reset();
    lNV = true;
    com.tencent.mm.plugin.expt.e.c.bru();
    if (bo.getInt(com.tencent.mm.plugin.expt.e.c.a(a.a.lIq, "", false), 0) > 0);
    while (true)
    {
      if (i != 0)
        com.tencent.mm.sdk.b.a.xxA.b(this.lOb);
      com.tencent.mm.sdk.b.a.xxA.b(this.lOc);
      AppMethodBeat.o(73547);
      return;
      i = 0;
    }
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(73548);
    reset();
    com.tencent.mm.sdk.b.a.xxA.d(this.lOb);
    com.tencent.mm.sdk.b.a.xxA.d(this.lOc);
    this.lNX = false;
    AppMethodBeat.o(73548);
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(73551);
    String str = paramActivity.getComponentName().getClassName();
    if ((lNV) && ("com.tencent.mm.ui.LauncherUI".equals(str)) && (this.lNY))
    {
      str = aZm();
      if (paramActivity == null)
        break label82;
    }
    label82: for (int i = paramActivity.hashCode(); ; i = -1)
    {
      ab.i("MicroMsg.MMPageFlowService", "%s launcher ui ondestroyed but wechat in foreground hashcode[%d]", new Object[] { str, Integer.valueOf(i) });
      AppMethodBeat.o(73551);
      return;
    }
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    AppMethodBeat.i(73550);
    a(paramActivity, com.tencent.mm.plugin.expt.a.c.a.lLZ);
    AppMethodBeat.o(73550);
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    AppMethodBeat.i(73549);
    a(paramActivity, com.tencent.mm.plugin.expt.a.c.a.lLY);
    AppMethodBeat.o(73549);
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
  }

  public final void onActivityStopped(Activity paramActivity)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.c.d
 * JD-Core Version:    0.6.2
 */