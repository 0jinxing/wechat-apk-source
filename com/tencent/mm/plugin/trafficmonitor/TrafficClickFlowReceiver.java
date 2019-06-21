package com.tencent.mm.plugin.trafficmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TrafficClickFlowReceiver extends BroadcastReceiver
{
  private static boolean hop;
  private static TrafficClickFlowReceiver.c sJP;
  private static String sJQ;
  private static Map<Long, TrafficClickFlowReceiver.b> sJR;
  private static List<TrafficClickFlowReceiver.c> sJS;
  private static List<TrafficClickFlowReceiver.b> sJT;
  private static List<TrafficClickFlowReceiver.a> sJU;
  private static int sJW;
  private static b sJX;
  private int sJV = 0;

  static
  {
    AppMethodBeat.i(114777);
    sJP = new TrafficClickFlowReceiver.c();
    sJR = Collections.synchronizedMap(new HashMap());
    sJS = Collections.synchronizedList(new ArrayList());
    sJT = Collections.synchronizedList(new ArrayList());
    sJU = Collections.synchronizedList(new ArrayList());
    sJW = 0;
    hop = false;
    sJX = new b();
    b.a(new TrafficClickFlowReceiver.1());
    AppMethodBeat.o(114777);
  }

  protected static int a(int paramInt, long paramLong, List<TrafficClickFlowReceiver.c> paramList)
  {
    AppMethodBeat.i(114774);
    int i = 1;
    int j = paramInt;
    paramInt = i;
    try
    {
      TrafficClickFlowReceiver.c localc1;
      if (j < sJS.size())
      {
        localc1 = (TrafficClickFlowReceiver.c)sJS.get(j);
        if ((paramInt != 0) && (localc1.endTime > paramLong))
        {
          TrafficClickFlowReceiver.c localc2 = new com/tencent/mm/plugin/trafficmonitor/TrafficClickFlowReceiver$c;
          localc2.<init>();
          localc2.sJY = localc1.sJY;
          localc2.startTime = paramLong;
          localc2.endTime = localc1.endTime;
          paramList.add(localc2);
          paramInt = 0;
        }
        while (true)
        {
          j++;
          break;
          paramList.add(localc1);
        }
      }
      if (paramList.size() == 0)
      {
        localc1 = new com/tencent/mm/plugin/trafficmonitor/TrafficClickFlowReceiver$c;
        localc1.<init>();
        localc1.sJY = sJQ;
        localc1.startTime = paramLong;
        localc1.endTime = System.currentTimeMillis();
        paramList.add(localc1);
      }
      while (true)
      {
        paramInt = sJS.size();
        AppMethodBeat.o(114774);
        return paramInt;
        localc1 = new com/tencent/mm/plugin/trafficmonitor/TrafficClickFlowReceiver$c;
        localc1.<init>();
        localc1.sJY = sJQ;
        localc1.startTime = sJP.startTime;
        localc1.endTime = System.currentTimeMillis();
        paramList.add(localc1);
      }
    }
    catch (Exception paramList)
    {
      while (true)
      {
        paramInt = -1;
        AppMethodBeat.o(114774);
      }
    }
  }

  protected static void cHC()
  {
    AppMethodBeat.i(114775);
    if (sJS == null)
      AppMethodBeat.o(114775);
    while (true)
    {
      return;
      sJS.clear();
      AppMethodBeat.o(114775);
    }
  }

  protected static boolean lD(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(114771);
    ab.i("MicroMsg.TrafficClickFlow", "hasDownloadObjects downLoadObjects : %s", new Object[] { sJT.toString() });
    int i = 0;
    if (i < sJT.size())
      if (((TrafficClickFlowReceiver.b)sJT.get(i)).endTime > paramLong)
      {
        AppMethodBeat.o(114771);
        bool = true;
      }
    while (true)
    {
      return bool;
      i++;
      break;
      ab.i("MicroMsg.TrafficClickFlow", "hasDownloadObjects currentDownloadMap : %s", new Object[] { sJR.toString() });
      if (sJR.size() > 0)
      {
        AppMethodBeat.o(114771);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(114771);
      }
    }
  }

  protected static boolean lE(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(114772);
    if (sJT == null)
    {
      AppMethodBeat.o(114772);
      bool = true;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.TrafficClickFlow", "isDownloadFileNormal downLoadObjects : %s", new Object[] { sJT.toString() });
      Object localObject;
      for (int i = 0; ; i++)
      {
        if (i >= sJT.size())
          break label105;
        localObject = (TrafficClickFlowReceiver.b)sJT.get(i);
        if ((((TrafficClickFlowReceiver.b)localObject).endTime > paramLong) && (!lF(((TrafficClickFlowReceiver.b)localObject).startTime)))
        {
          AppMethodBeat.o(114772);
          break;
        }
      }
      label105: if (sJR == null)
      {
        AppMethodBeat.o(114772);
        bool = true;
      }
      else
      {
        ab.i("MicroMsg.TrafficClickFlow", "isDownloadFileNormal currentDownloadMap : %s", new Object[] { sJR.toString() });
        if (sJR.size() > 0)
        {
          localObject = sJR.entrySet().iterator();
          while (true)
            if (((Iterator)localObject).hasNext())
              if (!lF(((TrafficClickFlowReceiver.b)((Map.Entry)((Iterator)localObject).next()).getValue()).startTime))
              {
                AppMethodBeat.o(114772);
                break;
              }
        }
        AppMethodBeat.o(114772);
        bool = true;
      }
    }
  }

  private static boolean lF(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(114773);
    if (sJU == null)
      AppMethodBeat.o(114773);
    while (true)
    {
      return bool;
      ab.i("MicroMsg.TrafficClickFlow", "clickObjects : %s", new Object[] { sJU.toString() });
      for (int i = 0; ; i++)
      {
        if (i >= sJU.size())
          break label97;
        if (Math.abs(paramLong - ((TrafficClickFlowReceiver.a)sJU.get(i)).time) < 10000L)
        {
          AppMethodBeat.o(114773);
          bool = true;
          break;
        }
      }
      label97: AppMethodBeat.o(114773);
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(114770);
    if ((paramIntent == null) || (!paramIntent.getAction().equals("com.tencent.mm.Intent.ACTION_NET_STATS")))
      AppMethodBeat.o(114770);
    Object localObject;
    int i;
    while (true)
    {
      return;
      localObject = paramIntent.getStringExtra("ui");
      paramContext = (Context)localObject;
      if (localObject == null)
        paramContext = "null";
      localObject = paramContext;
      if (paramContext.contains("."))
        localObject = paramContext.substring(paramContext.lastIndexOf(".") + 1);
      i = paramIntent.getIntExtra("opCode", 0);
      if (i != 10)
        break;
      paramContext = new TrafficClickFlowReceiver.a();
      paramContext.sJY = ((String)localObject);
      paramContext.time = System.currentTimeMillis();
      sJU.add(paramContext);
      ab.i("MicroMsg.TrafficClickFlow", "onReceive Click : %s", new Object[] { localObject });
      AppMethodBeat.o(114770);
    }
    if (i == 1)
      sJQ = (String)localObject;
    while (true)
    {
      this.sJV = i;
      AppMethodBeat.o(114770);
      break;
      if (i == 3)
      {
        if (hop)
        {
          paramContext = new TrafficClickFlowReceiver.c();
          paramContext.sJY = "Background";
          paramContext.startTime = sJP.startTime;
          paramContext.endTime = System.currentTimeMillis();
          sJS.add(paramContext);
          hop = false;
        }
        sJQ = (String)localObject;
        if (localObject != sJP.sJY)
        {
          sJP.sJY = ((String)localObject);
          sJP.startTime = System.currentTimeMillis();
        }
      }
      else if (i == 4)
      {
        sJP.endTime = System.currentTimeMillis();
        if (sJP.sJY != null)
          sJS.add(sJP);
        sJP = new TrafficClickFlowReceiver.c();
        boolean bool1 = bo.gR(ah.getContext());
        boolean bool2 = o.gl(ah.getContext());
        if ((!bool1) || (!bool2))
        {
          sJP.startTime = System.currentTimeMillis();
          sJQ = "Background";
          hop = true;
          ab.i("MicroMsg.TrafficClickFlow", "come to background isTopApp : %b, isScreenOn : %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        }
      }
      else if ((i == 5) && (sJS.contains(localObject)))
      {
        sJQ = "Background";
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver
 * JD-Core Version:    0.6.2
 */