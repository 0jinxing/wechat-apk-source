package com.tencent.mm.plugin.appbrand.task;

import android.app.Activity;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.i;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService;
import com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService1;
import com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService2;
import com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService3;
import com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService4;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.f.a;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI1;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI2;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI3;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI4;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class h
{
  private static final LinkedList<j> iFk;
  private static final LinkedList<j> iFl;
  private static final j iFm;
  private static final j iFn;
  private static final j iFo;

  static
  {
    AppMethodBeat.i(132872);
    if (!h.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      LinkedList localLinkedList = new LinkedList();
      iFk = localLinkedList;
      localLinkedList.add(new j(AppBrandUI.class, AppBrandTaskPreloadReceiver.class, AppBrandKeepAliveService.class));
      iFk.add(new j(AppBrandUI1.class, AppBrandTaskPreloadReceiver1.class, AppBrandKeepAliveService1.class));
      iFk.add(new j(AppBrandUI2.class, AppBrandTaskPreloadReceiver2.class, AppBrandKeepAliveService2.class));
      iFk.add(new j(AppBrandUI3.class, AppBrandTaskPreloadReceiver3.class, AppBrandKeepAliveService3.class));
      iFk.add(new j(AppBrandUI4.class, AppBrandTaskPreloadReceiver4.class, AppBrandKeepAliveService4.class));
      iFm = new d();
      iFn = new c();
      iFo = new k();
      localLinkedList = new LinkedList();
      iFl = localLinkedList;
      localLinkedList.addAll(iFk);
      iFl.add(iFm);
      iFl.add(iFn);
      iFl.add(iFo);
      AppMethodBeat.o(132872);
      return;
    }
  }

  static void DI(String arg0)
  {
    AppMethodBeat.i(132870);
    j localj = DQ(???);
    if (localj != null)
    {
      localj.DI(???);
      if (localj.iFt.keySet().isEmpty())
        if (!(localj instanceof a));
    }
    while (true)
    {
      synchronized (iFl)
      {
        iFl.remove(localj);
        AppMethodBeat.o(132870);
        return;
      }
      synchronized (iFl)
      {
        iFl.remove(localObject1);
        iFl.addFirst(localObject1);
      }
      synchronized (iFk)
      {
        if (iFk.contains(localObject1))
        {
          iFk.remove(localObject1);
          iFk.addFirst(localObject1);
        }
        AppMethodBeat.o(132870);
        continue;
        localObject2 = finally;
        AppMethodBeat.o(132870);
        throw localObject2;
      }
      AppMethodBeat.o(132870);
    }
  }

  public static void DN(String paramString)
  {
    AppMethodBeat.i(132852);
    j localj = DQ(paramString);
    if ((localj != null) && (localj.DU(paramString) != null))
      localj.DU(paramString).DM(paramString);
    AppMethodBeat.o(132852);
  }

  public static void DO(String paramString)
  {
    AppMethodBeat.i(132855);
    paramString = DR(paramString);
    if (paramString == null)
      AppMethodBeat.o(132855);
    while (true)
    {
      return;
      al.n(new h.1(paramString), 500L);
      AppMethodBeat.o(132855);
    }
  }

  public static Class DP(String paramString)
  {
    AppMethodBeat.i(132857);
    int i = 0;
    if (i < iFl.size())
    {
      j localj = (j)iFl.get(i);
      if (localj.iFq.equals(paramString))
      {
        paramString = localj.ifs;
        AppMethodBeat.o(132857);
      }
    }
    while (true)
    {
      return paramString;
      i++;
      break;
      paramString = null;
      AppMethodBeat.o(132857);
    }
  }

  private static j DQ(String paramString)
  {
    AppMethodBeat.i(132862);
    Iterator localIterator = aLX().iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if (localj.iFt.keySet().contains(paramString))
      {
        AppMethodBeat.o(132862);
        paramString = localj;
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(132862);
    }
  }

  static j DR(String paramString)
  {
    AppMethodBeat.i(132863);
    Iterator localIterator = aLX().iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if (localj.iFq.equals(paramString))
      {
        AppMethodBeat.o(132863);
        paramString = localj;
      }
    }
    while (true)
    {
      return paramString;
      Assert.assertTrue(true);
      paramString = null;
      AppMethodBeat.o(132863);
    }
  }

  public static boolean DS(String paramString)
  {
    AppMethodBeat.i(138697);
    boolean bool = bu(paramString, -1);
    AppMethodBeat.o(138697);
    return bool;
  }

  static j a(h.a parama)
  {
    AppMethodBeat.i(132864);
    Iterator localIterator = aLX().iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if (parama.a(localj))
      {
        AppMethodBeat.o(132864);
        parama = localj;
      }
    }
    while (true)
    {
      return parama;
      parama = null;
      AppMethodBeat.o(132864);
    }
  }

  private static j a(List<j> paramList, g paramg)
  {
    AppMethodBeat.i(132858);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (j)localIterator.next();
      if (paramList.iFv == paramg)
        AppMethodBeat.o(132858);
    }
    while (true)
    {
      return paramList;
      paramList = null;
      AppMethodBeat.o(132858);
    }
  }

  static void a(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(132854);
    if (!i.axb())
      AppMethodBeat.o(132854);
    while (true)
    {
      return;
      if ((!paramBoolean) && (com.tencent.mm.plugin.appbrand.task.a.a.g(paramg)))
      {
        ab.w("MicroMsg.AppBrandTaskManager", "tryPreloadNextTaskProcess %s, hit interval limit", new Object[] { paramg });
        if (paramg == g.iFf)
        {
          com.tencent.mm.plugin.report.service.h.pYm.k(915L, 22L, 1L);
          AppMethodBeat.o(132854);
        }
        else
        {
          if (paramg == g.iFg)
            com.tencent.mm.plugin.report.service.h.pYm.k(915L, 23L, 1L);
          AppMethodBeat.o(132854);
        }
      }
      else
      {
        if (paramg == g.iFh)
        {
          paramg = new IllegalStateException("serviceType == nil");
          AppMethodBeat.o(132854);
          throw paramg;
        }
        ab.i("MicroMsg.AppBrandTaskManager", "tryPreloadNextTaskProcess serviceType = [%s]", new Object[] { paramg });
        j localj = d(paramg);
        if (localj != null)
        {
          localj.f(paramg);
          localj.Dw();
        }
        AppMethodBeat.o(132854);
      }
    }
  }

  private static LinkedList<j> aLX()
  {
    AppMethodBeat.i(132869);
    synchronized (iFl)
    {
      LinkedList localLinkedList2 = new java/util/LinkedList;
      localLinkedList2.<init>(iFl);
      AppMethodBeat.o(132869);
      return localLinkedList2;
    }
  }

  public static void b(g paramg)
  {
    AppMethodBeat.i(138696);
    a(paramg, false);
    AppMethodBeat.o(138696);
  }

  static void b(j paramj)
  {
    AppMethodBeat.i(132871);
    synchronized (iFl)
    {
      iFl.remove(paramj);
      iFl.addLast(paramj);
    }
    synchronized (iFk)
    {
      if (iFk.contains(paramj))
      {
        iFk.remove(paramj);
        iFk.addLast(paramj);
      }
      AppMethodBeat.o(132871);
      return;
      paramj = finally;
      AppMethodBeat.o(132871);
      throw paramj;
    }
  }

  public static void bt(String paramString, int paramInt)
  {
    AppMethodBeat.i(132850);
    j localj = DQ(paramString);
    if (localj == null)
      AppMethodBeat.o(132850);
    while (true)
    {
      return;
      if ((localj.DT(paramString).intValue() == paramInt) && (localj.DU(paramString) != null))
        localj.DU(paramString).DM(paramString);
      AppMethodBeat.o(132850);
    }
  }

  public static boolean bu(String paramString, int paramInt)
  {
    AppMethodBeat.i(132866);
    j localj = DQ(paramString);
    boolean bool;
    if ((localj != null) && ((paramInt < 0) || (bo.a(localj.DT(paramString), -1) == paramInt)) && (localj.DU(paramString) != null) && (localj.DU(paramString).aLU()))
    {
      bool = true;
      AppMethodBeat.o(132866);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(132866);
    }
  }

  public static String bv(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(132868);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(132868);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        synchronized (iFl)
        {
          if (bu(paramString, paramInt))
          {
            paramString = DQ(paramString).DU(paramString).iEO;
            AppMethodBeat.o(132868);
            continue;
          }
          AppMethodBeat.o(132868);
          paramString = localObject;
        }
      }
      catch (NullPointerException paramString)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AppBrandTaskManager", paramString, "[NOT CRASH]getAliveInstanceId", new Object[0]);
      }
    }
  }

  private static boolean c(g paramg)
  {
    boolean bool = false;
    AppMethodBeat.i(132859);
    Iterator localIterator = iFk.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      if (((j)localIterator.next()).iFv != paramg)
        break label133;
      i++;
    }
    label133: 
    while (true)
    {
      break;
      if (i > paramg.iFi)
      {
        paramg = new IllegalStateException(bo.t("TaskManager count the serviceType [%s] in TASK_LIST, count = [%d], but max limit = [%d]", new Object[] { paramg.name(), Integer.valueOf(i), Integer.valueOf(paramg.iFi) }));
        AppMethodBeat.o(132859);
        throw paramg;
      }
      if (i == paramg.iFi)
      {
        AppMethodBeat.o(132859);
        bool = true;
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(132859);
      }
    }
  }

  static j cN(String paramString1, String paramString2)
  {
    AppMethodBeat.i(132865);
    Iterator localIterator = aLX().iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((localj.iFt.keySet().contains(paramString1)) && (localj.iFq.equals(paramString2)))
      {
        AppMethodBeat.o(132865);
        paramString1 = localj;
      }
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(132865);
    }
  }

  public static int d(Context paramContext, AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(132849);
    int i;
    if (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f.c(paramContext, paramAppBrandInitConfigWC, paramAppBrandStatObject))
    {
      i = 1;
      AppMethodBeat.o(132849);
      return i;
    }
    Object localObject1 = com.tencent.mm.plugin.appbrand.report.model.f.iBe;
    Object localObject2 = paramAppBrandInitConfigWC.appId;
    int j = paramAppBrandInitConfigWC.axy;
    boolean bool = bu((String)localObject2, -1);
    Object localObject3 = (f.a)((com.tencent.mm.plugin.appbrand.report.model.f)localObject1).iBf.get(localObject2);
    label103: long l;
    if (localObject3 == null)
    {
      localObject3 = new f.a((byte)0);
      ((f.a)localObject3).iBi = 1L;
      ((com.tencent.mm.plugin.appbrand.report.model.f)localObject1).iBf.put(localObject2, localObject3);
      if (((f.a)localObject3).iBh <= 0L)
        break label473;
      l = bo.anU() - ((f.a)localObject3).iBh;
      label124: localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
      if (!bool)
        break label479;
      i = 1;
      label136: ((com.tencent.mm.plugin.report.service.h)localObject1).e(16064, new Object[] { Integer.valueOf(1), localObject2, Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(((f.a)localObject3).iBi), Long.valueOf(l) });
      if (!"wxfe02ecfe70800f46".equalsIgnoreCase(paramAppBrandInitConfigWC.appId))
        break label484;
      localObject3 = iFo;
      i = 1;
      label215: ((j)localObject3).a(paramAppBrandInitConfigWC.appId, paramAppBrandInitConfigWC.gVs, null);
      if (paramContext != null)
        break label625;
      paramContext = ah.getContext();
    }
    label473: label479: label484: label625: 
    while (true)
    {
      localObject1 = new Intent(paramContext, ((j)localObject3).iFr);
      ((Intent)localObject1).putExtra("key_appbrand_init_config", paramAppBrandInitConfigWC);
      ((Intent)localObject1).putExtra("key_appbrand_stat_object", paramAppBrandStatObject);
      if ((com.tencent.mm.plugin.appbrand.s.a.al(((j)localObject3).iFr)) || (!(paramContext instanceof Activity)));
      for (j = 268435456; ; j = 0)
      {
        ((Intent)localObject1).addFlags(j);
        if ((paramContext instanceof Activity))
        {
          localObject2 = bo.av(paramContext, ((Activity)paramContext).getTaskId());
          if ((localObject2 != null) && (((ActivityManager.RunningTaskInfo)localObject2).baseActivity != null) && (bo.nullAsNil(((ActivityManager.RunningTaskInfo)localObject2).baseActivity.getClassName()).equals(((j)localObject3).iFq)))
          {
            ((Intent)localObject1).putExtra("key_appbrand_bring_ui_to_front_from_task_Base_by_task_top_ui", true);
            ((Intent)localObject1).addFlags(603979776);
          }
        }
        paramAppBrandInitConfigWC.hgK = bo.anU();
        paramContext.startActivity((Intent)localObject1);
        if (i == 1)
          DN(paramAppBrandInitConfigWC.appId);
        ab.i("MicroMsg.AppBrandTaskManager", "startApp appId[%s] type[%d] scene[%d] strategy[%d]", new Object[] { paramAppBrandInitConfigWC.appId, Integer.valueOf(paramAppBrandInitConfigWC.gVs), Integer.valueOf(paramAppBrandStatObject.scene), Integer.valueOf(i) });
        AppMethodBeat.o(132849);
        break;
        ((f.a)localObject3).iBi += 1L;
        break label103;
        l = 0L;
        break label124;
        i = 0;
        break label136;
        if (paramAppBrandInitConfigWC.hgJ)
        {
          localObject3 = iFm;
          i = 1;
          break label215;
        }
        localObject3 = DQ(paramAppBrandInitConfigWC.appId);
        if ((localObject3 == null) || (localObject3 == iFm) || ((localObject3 instanceof a)))
        {
          if (paramAppBrandInitConfigWC.hgI)
          {
            localObject3 = iFn;
            b((j)localObject3);
            i = 1;
            break label215;
          }
          if (paramAppBrandInitConfigWC.xy())
          {
            localObject3 = g.iFg;
            localObject2 = e((g)localObject3);
            if (!paramAppBrandInitConfigWC.xy())
              break label606;
          }
          for (localObject3 = g.iFg; ; localObject3 = g.iFf)
          {
            ((j)localObject2).f((g)localObject3);
            localObject3 = localObject2;
            break;
            localObject3 = g.iFf;
            break label565;
          }
        }
        i = 2;
        break label215;
      }
    }
  }

  private static j d(g paramg)
  {
    AppMethodBeat.i(132860);
    synchronized (iFk)
    {
      if (c(paramg))
      {
        ab.i("MicroMsg.AppBrandTaskManager", "tryPreloadNextTaskProcess serviceType = [%s] reachedMaxLimit", new Object[] { paramg });
        paramg = null;
        AppMethodBeat.o(132860);
      }
      Object localObject1;
      while (true)
      {
        return paramg;
        localObject1 = iFk.iterator();
        while (true)
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (j)((Iterator)localObject1).next();
            if ((((j)localObject2).iFt.isEmpty()) && (((j)localObject2).iFv == paramg))
            {
              ab.i("MicroMsg.AppBrandTaskManager", "getAvailableTaskToStartup found empty task, which can be used as [%s]", new Object[] { paramg });
              AppMethodBeat.o(132860);
              paramg = (g)localObject2;
              break;
            }
          }
        localObject1 = a(iFk, g.iFh);
        if (localObject1 != null)
          break;
        localObject2 = "null";
        ab.i("MicroMsg.AppBrandTaskManager", "tryPreloadNextTaskProcess serviceType = [%s] not reached max limit , got ui task = [%s]", new Object[] { paramg, localObject2 });
        AppMethodBeat.o(132860);
        paramg = (g)localObject1;
      }
      Object localObject2 = ((j)localObject1).iFq;
    }
  }

  private static j e(g paramg)
  {
    AppMethodBeat.i(132861);
    while (true)
    {
      synchronized (iFk)
      {
        Iterator localIterator = iFk.iterator();
        if (localIterator.hasNext())
        {
          localj = (j)localIterator.next();
          if ((!localj.iFt.isEmpty()) || (localj.iFv != paramg))
            continue;
          ab.i("MicroMsg.AppBrandTaskManager", "getAvailableTaskToStartup found empty task, which can be used as [%s]", new Object[] { paramg });
          paramg = localj;
          AppMethodBeat.o(132861);
          return paramg;
        }
        if (c(paramg))
        {
          ab.i("MicroMsg.AppBrandTaskManager", "getAvailableTaskToStartup [%s] task reached maxLimit", new Object[] { paramg });
          localj = a(iFk, paramg);
          paramg = localj;
          if ($assertionsDisabled)
            continue;
          paramg = localj;
          if (localj != null)
            continue;
          paramg = new java/lang/AssertionError;
          paramg.<init>();
          AppMethodBeat.o(132861);
          throw paramg;
        }
      }
      j localj = a(iFk, g.iFh);
      if (localj != null)
      {
        ab.i("MicroMsg.AppBrandTaskManager", "getAvailableTaskToStartup found not used task, which can be used as [%s]", new Object[] { paramg });
        paramg = localj;
      }
      else
      {
        ab.i("MicroMsg.AppBrandTaskManager", "getAvailableTaskToStartup all full for [%s]", new Object[] { paramg });
        paramg = (j)iFk.getFirst();
      }
    }
  }

  public static void onNetworkChange()
  {
    AppMethodBeat.i(132856);
    Iterator localIterator1 = aLX().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((j)localIterator1.next()).iFu.values().iterator();
      while (localIterator2.hasNext())
      {
        AppBrandRemoteTaskController localAppBrandRemoteTaskController = (AppBrandRemoteTaskController)localIterator2.next();
        if (localAppBrandRemoteTaskController != null)
        {
          localAppBrandRemoteTaskController.iEK = AppBrandRemoteTaskController.a.iFa;
          localAppBrandRemoteTaskController.aCb();
        }
      }
    }
    AppMethodBeat.o(132856);
  }

  public static void pN(int paramInt)
  {
    AppMethodBeat.i(132851);
    Iterator localIterator;
    if (2 == paramInt)
    {
      localIterator = aLX().iterator();
      while (localIterator.hasNext())
        ((j)localIterator.next()).aLJ();
      ab.i("MicroMsg.AppBrandTaskManager", "killAll SILENT_IF_INACTIVE tryPreloadNextTaskProcess(both waservice and wagame)");
      a(g.iFf, false);
      a(g.iFg, false);
      AppMethodBeat.o(132851);
    }
    while (true)
    {
      return;
      localIterator = aLX().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (j)localIterator.next();
        ((j)localObject).aLJ();
        localObject = ((j)localObject).iFu.values().iterator();
        while (((Iterator)localObject).hasNext())
        {
          AppBrandRemoteTaskController localAppBrandRemoteTaskController = (AppBrandRemoteTaskController)((Iterator)localObject).next();
          if (localAppBrandRemoteTaskController != null)
          {
            localAppBrandRemoteTaskController.iEK = AppBrandRemoteTaskController.a.iEW;
            localAppBrandRemoteTaskController.iEL = paramInt;
            localAppBrandRemoteTaskController.aCb();
          }
        }
      }
      AppMethodBeat.o(132851);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.h
 * JD-Core Version:    0.6.2
 */