package com.tencent.mm.plugin.report.service;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.l;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

public class KVCommCrossProcessReceiver extends BroadcastReceiver
{
  private static String className;
  private static Object lock;
  private static ak pXF;
  private static int pXG;
  private static volatile long pXH;
  private static volatile int pXI;
  private static BroadCastData pXJ;

  static
  {
    AppMethodBeat.i(72717);
    HandlerThread localHandlerThread = d.anM("kv_report");
    localHandlerThread.start();
    pXF = new ak(localHandlerThread.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(72703);
        super.handleMessage(paramAnonymousMessage);
        if (paramAnonymousMessage.what == 1)
          KVCommCrossProcessReceiver.access$000();
        AppMethodBeat.o(72703);
      }
    };
    className = "";
    pXG = 10000;
    pXH = 10000L;
    pXI = -1;
    pXJ = new BroadCastData();
    lock = new Object();
    AppMethodBeat.o(72717);
  }

  public static void P(ArrayList<IDKey> paramArrayList)
  {
    AppMethodBeat.i(72711);
    ab.d("MicroMsg.ReportManagerKvCheck", "receive group id size:%d, isImportant:%b", new Object[] { Integer.valueOf(paramArrayList.size()), Boolean.FALSE });
    while (true)
    {
      synchronized (lock)
      {
        BroadCastData localBroadCastData = pXJ;
        GroupIDKeyDataInfo localGroupIDKeyDataInfo = new com/tencent/mm/plugin/report/service/GroupIDKeyDataInfo;
        localGroupIDKeyDataInfo.<init>(paramArrayList);
        localBroadCastData.pXy.add(localGroupIDKeyDataInfo);
        if ((pXH == 0L) || (cgm()))
        {
          cgl();
          AppMethodBeat.o(72711);
          return;
        }
      }
      if (pXF.hasMessages(1))
      {
        AppMethodBeat.o(72711);
      }
      else
      {
        pXF.sendEmptyMessageDelayed(1, pXH);
        AppMethodBeat.o(72711);
      }
    }
  }

  public static void a(KVReportDataInfo paramKVReportDataInfo)
  {
    AppMethodBeat.i(72709);
    ab.d("MicroMsg.ReportManagerKvCheck", "receive kv logid:%d, type:%d, isImportant: %b,isReportNow: %b, ignoreFreqLimit", new Object[] { Long.valueOf(paramKVReportDataInfo.pXX), Long.valueOf(paramKVReportDataInfo.ctk), Boolean.valueOf(paramKVReportDataInfo.pXA), Boolean.valueOf(paramKVReportDataInfo.pXY) });
    while (true)
    {
      synchronized (lock)
      {
        pXJ.pXw.add(paramKVReportDataInfo);
        if (pXH == 0L)
        {
          cgl();
          AppMethodBeat.o(72709);
          return;
        }
      }
      if (pXF.hasMessages(1))
      {
        AppMethodBeat.o(72709);
      }
      else
      {
        pXF.sendEmptyMessageDelayed(1, pXH);
        AppMethodBeat.o(72709);
      }
    }
  }

  public static void a(StIDKeyDataInfo paramStIDKeyDataInfo)
  {
    AppMethodBeat.i(72710);
    ab.d("MicroMsg.ReportManagerKvCheck", "receive id ID:%d, key:%d,value:%d, isImportant:%b", new Object[] { Long.valueOf(paramStIDKeyDataInfo.lhy), Long.valueOf(paramStIDKeyDataInfo.key), Long.valueOf(paramStIDKeyDataInfo.value), Boolean.valueOf(paramStIDKeyDataInfo.pXA) });
    while (true)
    {
      synchronized (lock)
      {
        pXJ.pXx.add(paramStIDKeyDataInfo);
        if ((pXH == 0L) || (cgm()))
        {
          cgl();
          AppMethodBeat.o(72710);
          return;
        }
      }
      if (pXF.hasMessages(1))
      {
        AppMethodBeat.o(72710);
      }
      else
      {
        pXF.sendEmptyMessageDelayed(1, pXH);
        AppMethodBeat.o(72710);
      }
    }
  }

  public static void cgj()
  {
    if (100L < 0L);
    while (true)
    {
      return;
      pXH = 100L;
    }
  }

  public static void cgk()
  {
    pXI = 1000;
  }

  private static void cgl()
  {
    AppMethodBeat.i(72707);
    Object localObject4;
    ArrayList localArrayList;
    Object localObject5;
    synchronized (lock)
    {
      Object localObject2 = new com/tencent/mm/plugin/report/service/BroadCastData;
      ((BroadCastData)localObject2).<init>(pXJ);
      localObject4 = pXJ;
      ((BroadCastData)localObject4).pXw.clear();
      ((BroadCastData)localObject4).pXx.clear();
      ((BroadCastData)localObject4).pXy.clear();
      localArrayList = ((BroadCastData)localObject2).pXy;
      localObject4 = ((BroadCastData)localObject2).pXx;
      ??? = ((BroadCastData)localObject2).pXw;
      if ((!l.bM(ah.getContext())) && (ah.doI()))
        break label252;
      ab.i("MicroMsg.ReportManagerKvCheck", "sendKVBroadcast shut_down_weixin, no need to notify worker");
      localObject5 = localArrayList.iterator();
      if (((Iterator)localObject5).hasNext())
      {
        localObject2 = (GroupIDKeyDataInfo)((Iterator)localObject5).next();
        f.e(((GroupIDKeyDataInfo)localObject2).pXz, ((GroupIDKeyDataInfo)localObject2).pXA);
      }
    }
    Iterator localIterator = ((ArrayList)localObject4).iterator();
    while (localIterator.hasNext())
    {
      localObject4 = (StIDKeyDataInfo)localIterator.next();
      f.d((int)((StIDKeyDataInfo)localObject4).lhy, (int)((StIDKeyDataInfo)localObject4).key, (int)((StIDKeyDataInfo)localObject4).value, ((StIDKeyDataInfo)localObject4).pXA);
    }
    localIterator = ((ArrayList)???).iterator();
    while (localIterator.hasNext())
    {
      ??? = (KVReportDataInfo)localIterator.next();
      f.a((int)((KVReportDataInfo)???).pXX, (int)((KVReportDataInfo)???).ctk, ((KVReportDataInfo)???).value, ((KVReportDataInfo)???).pXY, ((KVReportDataInfo)???).pXA, ((KVReportDataInfo)???).pXZ);
    }
    AppMethodBeat.o(72707);
    while (true)
    {
      return;
      label252: localObject5 = new Intent();
      ((Intent)localObject5).setAction("com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver");
      ((Intent)localObject5).setComponent(new ComponentName(ah.getPackageName(), getClassName()));
      ((Intent)localObject5).putExtra("type", 1);
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("BUNDLE_IDKEYGROUP", localIterator);
      ((Intent)localObject5).putExtra("INTENT_IDKEYGROUP", localBundle);
      ab.d("MicroMsg.ReportManagerKvCheck", "try sendBroadcast kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", new Object[] { Integer.valueOf(((ArrayList)???).size()), Integer.valueOf(((ArrayList)localObject4).size()), Integer.valueOf(localArrayList.size()) });
      try
      {
        ah.getContext().sendBroadcast((Intent)localObject5);
        AppMethodBeat.o(72707);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.ReportManagerKvCheck", localException, "sendBroadcastMessageDirectly", new Object[0]);
        AppMethodBeat.o(72707);
      }
    }
  }

  private static boolean cgm()
  {
    boolean bool = false;
    AppMethodBeat.i(72712);
    if (pXI <= 0)
      AppMethodBeat.o(72712);
    while (true)
    {
      return bool;
      if (pXJ == null)
        AppMethodBeat.o(72712);
      else
        try
        {
          int i = pXJ.pXx.size();
          int j = pXJ.pXy.size();
          int k = pXJ.pXw.size();
          int m = pXI;
          if (i + j + k >= m)
          {
            AppMethodBeat.o(72712);
            bool = true;
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.ReportManagerKvCheck", "checkExceedCacheItemCountLimit e = %s", new Object[] { localException });
          AppMethodBeat.o(72712);
        }
    }
  }

  public static void cgn()
  {
    AppMethodBeat.i(72713);
    if ((l.bM(ah.getContext())) || (!ah.doI()))
    {
      ab.w("MicroMsg.ReportManagerKvCheck", "sendOnCrashOrExceptionBroadCast shut_down_weixin, NO MM Process , return.");
      AppMethodBeat.o(72713);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver");
      localIntent.setComponent(new ComponentName(ah.getPackageName(), getClassName()));
      localIntent.putExtra("type", 2);
      ah.getContext().sendBroadcast(localIntent);
      AppMethodBeat.o(72713);
    }
  }

  public static void cgo()
  {
    AppMethodBeat.i(72714);
    if (pXF == null)
      AppMethodBeat.o(72714);
    while (true)
    {
      return;
      pXF.removeMessages(1);
      ak localak = pXF;
      localak.handleMessage(localak.obtainMessage(1));
      AppMethodBeat.o(72714);
    }
  }

  private static String getClassName()
  {
    AppMethodBeat.i(72708);
    if (bo.isNullOrNil(className))
      className = ah.getPackageName() + ".plugin.report.service.KVCommCrossProcessReceiver";
    String str = className;
    AppMethodBeat.o(72708);
    return str;
  }

  public void onReceive(Context paramContext, final Intent paramIntent)
  {
    AppMethodBeat.i(72706);
    if (paramIntent == null)
    {
      ab.e("MicroMsg.ReportManagerKvCheck", "onReceive intent == null");
      AppMethodBeat.o(72706);
    }
    while (true)
    {
      return;
      pXF.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(72704);
          ab.i("MicroMsg.ReportManagerKvCheck", "summeranrt true report runnable run tid:%d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
          KVCommCrossProcessReceiver.a(KVCommCrossProcessReceiver.this, paramIntent);
          AppMethodBeat.o(72704);
        }
      });
      AppMethodBeat.o(72706);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver
 * JD-Core Version:    0.6.2
 */