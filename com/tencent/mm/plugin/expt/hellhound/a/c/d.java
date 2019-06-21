package com.tencent.mm.plugin.expt.hellhound.a.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.caz;
import com.tencent.mm.protocal.protobuf.cci;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vending.j.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static volatile d lMX;
  private int acV;
  private int iJp;
  private AbsListView kSO;
  private Class<?> lMY;
  private Field lMZ;
  private Method lNa;
  private Field lNb;
  private AbsListView.OnScrollListener lNc;
  private d.a lNd;
  private int lNe;
  private Class<?> lNf;
  private Map<String, a> lNg;
  private cci lNh;
  private long lNi;
  private e lNj;
  private c lNk;
  private int lNl;
  private Field lNm;
  private int lNn;
  private int lNo;
  private int lNp;
  private long lNq;
  private String lNr;
  private Class<?> lNs;
  private Field lNt;
  private Field lNu;
  private int lNv;
  private WindowManager lca;
  private long mLastTimestamp;
  private int mScreenHeight;
  private int mScrollState;

  @SuppressLint({"NewApi"})
  private d()
  {
    AppMethodBeat.i(73469);
    this.lNi = 0L;
    this.mScrollState = 0;
    this.kSO = null;
    this.lNl = 0;
    this.lNn = 0;
    this.lNo = 0;
    this.lNp = -1;
    this.lNq = 0L;
    this.mLastTimestamp = -1L;
    this.lNr = "";
    this.acV = -1;
    this.iJp = -1;
    this.mScreenHeight = 0;
    this.lNv = 0;
    this.lca = null;
    this.lNe = ViewConfiguration.get(ah.getContext()).getScaledTouchSlop();
    try
    {
      this.lMY = Class.forName("com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
      this.lNb = this.lMY.getDeclaredField("mUIAction");
      this.lNb.setAccessible(true);
      this.lNa = Class.forName("com.tencent.mm.plugin.sns.ui.SnsUIAction").getDeclaredMethod("getSnsListView", new Class[0]);
      this.lNa.setAccessible(true);
      this.lMZ = AbsListView.class.getDeclaredField("mOnScrollListener");
      this.lMZ.setAccessible(true);
      this.lNf = Class.forName("com.tencent.mm.plugin.sns.ui.AdFrameLayout");
      this.lNm = AbsListView.class.getDeclaredField("mMotionY");
      this.lNm.setAccessible(true);
      this.lNs = Class.forName("com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
      this.lNt = this.lNs.getDeclaredField("timeLineObject");
      this.lNt.setAccessible(true);
      this.lNu = Class.forName("com.tencent.mm.protocal.protobuf.TimeLineObject").getDeclaredField("Id");
      this.lNu.setAccessible(true);
      this.lNd = new d.a(this, (byte)0);
      this.lNg = new HashMap();
      AppMethodBeat.o(73469);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("TimelineMonitor", localException, "habbyge-mali, TimelineMonitor OnScrollListener", new Object[0]);
    }
  }

  private void L(Activity paramActivity)
  {
    AppMethodBeat.i(73475);
    ab.i("TimelineMonitor", "habbyge-mali, restoreScrollListener");
    try
    {
      paramActivity = this.lNb.get(paramActivity);
      paramActivity = (ListView)this.lNa.invoke(paramActivity, new Object[0]);
      this.lMZ.set(paramActivity, this.lNc);
      AppMethodBeat.o(73475);
      return;
    }
    catch (Exception paramActivity)
    {
      while (true)
      {
        ab.printErrStackTrace("TimelineMonitor", paramActivity, "habbyge-mali, restoreScrollListener", new Object[0]);
        AppMethodBeat.o(73475);
      }
    }
  }

  private com.tencent.mm.vending.j.c<Map<a, Boolean>, Integer> a(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(73477);
    HashMap localHashMap = new HashMap();
    int i = paramInt - 1;
    paramInt = 0;
    if (i >= 0)
    {
      Object localObject = paramAbsListView.getChildAt(i);
      if (!this.lNf.isInstance(localObject))
        break label115;
      localObject = di((View)localObject);
      boolean bool = ((Boolean)((com.tencent.mm.vending.j.c)localObject).get(1)).booleanValue();
      localHashMap.put(((b)localObject).get(0), Boolean.valueOf(bool));
      if (!bool)
        break label115;
      paramInt++;
    }
    label115: 
    while (true)
    {
      i--;
      break;
      paramAbsListView = com.tencent.mm.vending.j.a.F(localHashMap, Integer.valueOf(paramInt));
      AppMethodBeat.o(73477);
      return paramAbsListView;
    }
  }

  public static void a(int paramInt, String paramString, Activity paramActivity)
  {
    AppMethodBeat.i(73470);
    if (!"com.tencent.mm.plugin.sns.ui.SnsTimeLineUI".equals(paramString))
      AppMethodBeat.o(73470);
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.expt.hellhound.a.bql())
        break;
      AppMethodBeat.o(73470);
    }
    d locald = bqI();
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      while (true)
      {
        AppMethodBeat.o(73470);
        break;
        ab.i("TimelineMonitor", "habbyge-mali, TimelineMonitor.startMonitor");
        locald.mScrollState = 0;
        if (locald.iJp <= 0)
        {
          paramString = paramActivity.getResources();
          locald.iJp = paramString.getDimensionPixelSize(paramString.getIdentifier("status_bar_height", "dimen", "android"));
          if (locald.iJp <= 0)
            locald.iJp = paramString.getDimensionPixelSize(2131428386);
          ab.i("TimelineMonitor", "habbyge-mali, initStatusBarHeight: " + locald.iJp);
        }
        try
        {
          if (locald.lca == null)
            locald.lca = ((WindowManager)ah.getContext().getSystemService("window"));
          paramString = locald.lca.getDefaultDisplay();
          Point localPoint1 = new Point();
          if (Build.VERSION.SDK_INT >= 13)
            paramString.getSize(localPoint1);
          Point localPoint2 = new Point();
          if (Build.VERSION.SDK_INT >= 17)
            paramString.getRealSize(localPoint2);
          locald.mScreenHeight = localPoint1.y;
          locald.lNv = localPoint2.y;
          ab.i("TimelineMonitor", "habbyge-mali, initScreenHeight = " + locald.mScreenHeight + " / " + locald.lNv);
          paramInt = com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.bqA();
          ab.i("TimelineMonitor", "habbyge-mali, startMonitor activityMethod: ".concat(String.valueOf(paramInt)));
          switch (paramInt)
          {
          default:
            if ((paramActivity == null) || (paramActivity.isFinishing()))
              AppMethodBeat.o(73470);
            break;
          case 0:
          case 1:
          case 7:
          }
        }
        catch (Exception paramString)
        {
          while (true)
          {
            paramString = paramActivity.getWindowManager().getDefaultDisplay();
            continue;
            locald.bqJ();
            continue;
            ab.d("TimelineMonitor", "habbyge-mali, ActivityActionWrapper.FINISH_ACTIVITY");
            continue;
            if (System.currentTimeMillis() - locald.lNi > 30000L)
            {
              ab.i("TimelineMonitor", "habbyge-mali, _handleActivityMethod.BACK_2_FRONT: New Session");
              locald.bqK();
              locald.bqJ();
            }
            else
            {
              ab.i("TimelineMonitor", "habbyge-mali, _handleActivityMethod.BACK_2_FRONT: Old Session");
              continue;
              locald.lNd.activity = paramActivity;
              try
              {
                paramString = locald.lNb.get(paramActivity);
                paramActivity = (ListView)locald.lNa.invoke(paramString, new Object[0]);
                locald.lNc = ((AbsListView.OnScrollListener)locald.lMZ.get(paramActivity));
                if ((locald.lNc instanceof d.a))
                {
                  ab.i("TimelineMonitor", "habbyge-mali, mOldScrollListener is OnProxyScrollListener !!");
                  AppMethodBeat.o(73470);
                  break;
                }
                paramString = new java/lang/StringBuilder;
                paramString.<init>("habbyge-mali, oldScrollListener: ");
                ab.i("TimelineMonitor", locald.lNc);
                paramActivity.setOnScrollListener(locald.lNd);
                AppMethodBeat.o(73470);
              }
              catch (Exception paramString)
              {
                ab.printErrStackTrace("TimelineMonitor", paramString, "habbyge-mali, setProxyScrollListener", new Object[0]);
                AppMethodBeat.o(73470);
              }
            }
          }
        }
      }
      break;
      ab.i("TimelineMonitor", "habbyge-mali, stopMonitor");
      while (true)
      {
        try
        {
          paramInt = com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.bqA();
          switch (paramInt)
          {
          default:
            locald.L(paramActivity);
            if (locald.lNd == null)
              break label758;
            locald.lNd.activity = null;
            AppMethodBeat.o(73470);
            break;
          case 0:
            ab.i("TimelineMonitor", "habbyge-mali, stopMonitor.START_ACTIVITY");
            locald.bqL();
            continue;
          case 1:
          case 8:
          }
        }
        finally
        {
          locald.L(paramActivity);
          if (locald.lNd != null)
            locald.lNd.activity = null;
          AppMethodBeat.o(73470);
        }
        ab.i("TimelineMonitor", "habbyge-mali, stopMonitor.FINISH_ACTIVITY");
        locald.bqK();
        continue;
        locald.bqL();
        locald.lNi = System.currentTimeMillis();
        ab.i("TimelineMonitor", "habbyge-mali, stopMonitor.FRONT_2_BACK");
      }
      label758: AppMethodBeat.o(73470);
      break;
      ab.i("TimelineMonitor", "habbyge-mali, TimelineMonitor, freeOnDestroy !");
      locald.lMY = null;
      locald.lNc = null;
      locald.lNd = null;
      if (locald.lNg != null)
        locald.lNg.clear();
      locald.lNh = null;
      locald.lca = null;
      locald.kSO = null;
      lMX = null;
      AppMethodBeat.o(73470);
      break;
      locald.bqK();
    }
  }

  private void a(AbsListView paramAbsListView, int paramInt, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(73476);
    if (paramAbsListView == null)
      AppMethodBeat.o(73476);
    while (true)
    {
      return;
      if (this.lNk.startTime > 0L)
      {
        this.lNk.endTime = paramLong;
        long l = this.lNk.endTime - this.lNk.startTime;
        if (l <= 0L)
        {
          AppMethodBeat.o(73476);
        }
        else
        {
          paramAbsListView = a(paramAbsListView, paramInt);
          Object localObject1 = (Map)paramAbsListView.get(0);
          paramInt = ((Integer)paramAbsListView.get(1)).intValue();
          if (paramInt <= 0)
          {
            AppMethodBeat.o(73476);
          }
          else
          {
            double d = l / paramInt;
            paramAbsListView = ((Map)localObject1).entrySet().iterator();
            while (paramAbsListView.hasNext())
            {
              Object localObject2 = (Map.Entry)paramAbsListView.next();
              localObject1 = (a)((Map.Entry)localObject2).getKey();
              if (((Boolean)((Map.Entry)localObject2).getValue()).booleanValue())
                if (this.lNg.containsKey(((a)localObject1).lMV.feedId))
                {
                  localObject2 = (a)this.lNg.get(((a)localObject1).lMV.feedId);
                  if (localObject2 != null)
                  {
                    caz localcaz = ((a)localObject2).lMV;
                    localcaz.xai += d;
                    localcaz = ((a)localObject2).lMV;
                    localcaz.xaj += l;
                    a((a)localObject2, (a)localObject1);
                    this.lNg.put(((a)localObject1).lMV.feedId, localObject2);
                  }
                }
                else
                {
                  ((a)localObject1).lMV.xai = d;
                  ((a)localObject1).lMV.xaj = l;
                  this.lNg.put(((a)localObject1).lMV.feedId, localObject1);
                }
            }
            if (paramBoolean)
            {
              this.lNk.startTime = paramLong;
              AppMethodBeat.o(73476);
            }
            else
            {
              this.lNk.startTime = 0L;
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(73476);
      }
    }
  }

  private static void a(a parama1, a parama2)
  {
    parama1.lMV.y = parama2.lMV.y;
    parama1.lMV.height = parama2.lMV.height;
    parama1.lMV.lqq = parama2.lMV.lqq;
    parama1.lMV.rBZ = parama2.lMV.rBZ;
    parama1.lMV.iev = parama2.lMV.iev;
    parama1.lMV.xae = parama2.lMV.xae;
  }

  private static d bqI()
  {
    AppMethodBeat.i(73468);
    if (lMX == null);
    try
    {
      if (lMX == null)
      {
        locald = new com/tencent/mm/plugin/expt/hellhound/a/c/d;
        locald.<init>();
        lMX = locald;
      }
      d locald = lMX;
      AppMethodBeat.o(73468);
      return locald;
    }
    finally
    {
      AppMethodBeat.o(73468);
    }
  }

  private void bqJ()
  {
    AppMethodBeat.i(73471);
    ab.i("TimelineMonitor", "habbyge-mali, reNewSession");
    this.lNh = new cci();
    this.lNh.xbJ = 0L;
    long l = System.currentTimeMillis();
    this.lNh.cvF = "1000".concat(String.valueOf(l));
    this.lNh.xbK = 0L;
    this.lNh.xbL = 0L;
    this.lNg.clear();
    this.lNj = new e();
    this.lNk = new c();
    AppMethodBeat.o(73471);
  }

  private void bqK()
  {
    AppMethodBeat.i(73472);
    if (this.lNh == null)
      AppMethodBeat.o(73472);
    while (true)
    {
      return;
      bqL();
      bqM();
      cci localcci = this.lNh;
      this.lNh = null;
      com.tencent.mm.sdk.g.d.xDG.b(new d.1(this, localcci), "_reportTimeline");
      AppMethodBeat.o(73472);
    }
  }

  private void bqL()
  {
    AppMethodBeat.i(73473);
    ab.i("TimelineMonitor", "habbyge-mali, _stopComputeTimelineSliceTime");
    if (this.lNj == null)
    {
      AppMethodBeat.o(73473);
      return;
    }
    long l1 = System.currentTimeMillis();
    long l2;
    long l3;
    cci localcci;
    if (this.lNj.lNy > 0L)
    {
      this.lNj.lNz = l1;
      if (this.lNh != null)
      {
        l2 = this.lNj.lNz;
        l3 = this.lNj.lNy;
        localcci = this.lNh;
        localcci.xbK = (l2 - l3 + localcci.xbK);
      }
      this.lNj.bqN();
      a(this.kSO, this.lNl, l1, false);
    }
    if (this.lNj.lNA > 0L)
    {
      this.lNj.lNB = l1;
      if (this.lNh != null)
      {
        l2 = this.lNj.lNB;
        l3 = this.lNj.lNA;
        localcci = this.lNh;
        localcci.xbL = (l2 - l3 + localcci.xbL);
        label183: this.lNj.bqO();
      }
    }
    else if (this.lNj.lNC > 0L)
    {
      this.lNj.lND = l1;
      ab.i("TimelineMonitor", "habbyge-mali, _stopComputeTimelineSliceTime mTimelineTime.endTimeFront = ".concat(String.valueOf(l1)));
      if (this.lNh == null)
        break label325;
      l1 = this.lNj.lND;
      l3 = this.lNj.lNC;
      localcci = this.lNh;
      localcci.xbJ = (l1 - l3 + localcci.xbJ);
      ab.i("TimelineMonitor", "habbyge-mali, _stopComputeTimelineSliceTime mTimelineTime.frontTime = " + this.lNh.xbJ);
    }
    while (true)
    {
      this.lNj.bqP();
      AppMethodBeat.o(73473);
      break;
      ab.e("TimelineMonitor", "habbyge-mali, _stopComputeTimelineSliceTime mSnsTimeline = NULL 2");
      break label183;
      label325: ab.e("TimelineMonitor", "habbyge-mali, _stopComputeTimelineSliceTime mSnsTimeline = NULL 3");
    }
  }

  private void bqM()
  {
    AppMethodBeat.i(73474);
    if ((this.lNg == null) || (this.lNg.isEmpty()))
      AppMethodBeat.o(73474);
    while (true)
    {
      return;
      ab.i("TimelineMonitor", "habbyge-mali, _moveMonitoringFeed2ReadyReport");
      Iterator localIterator = this.lNg.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        if (localObject != null)
        {
          localObject = (a)((Map.Entry)localObject).getValue();
          if ((localObject != null) && (this.lNh != null))
            this.lNh.xbM.add(((a)localObject).lMV);
        }
      }
      this.lNg.clear();
      AppMethodBeat.o(73474);
    }
  }

  private com.tencent.mm.vending.j.c<a, Boolean> di(View paramView)
  {
    AppMethodBeat.i(73478);
    Object localObject = dl(paramView);
    paramView = dj(paramView);
    int i = ((Integer)paramView.get(0)).intValue();
    int j = ((Integer)paramView.get(1)).intValue();
    paramView = new a();
    paramView.lMV = new caz();
    paramView.lMV.feedId = ((String)localObject);
    paramView.lMV.y = i;
    paramView.lMV.height = j;
    paramView.lMV.iev = this.lNv;
    paramView.lMV.xae = (this.lNv - this.mScreenHeight);
    paramView.lMV.qDY = this.iJp;
    localObject = paramView.lMV;
    if (this.acV <= 0);
    for (j = 144; ; j = this.acV)
    {
      ((caz)localObject).xaf = j;
      paramView.lMV.lqq = this.mScrollState;
      paramView.lMV.rBZ = this.lNo;
      paramView = com.tencent.mm.vending.j.a.F(paramView, Boolean.valueOf(paramView.bqH()));
      AppMethodBeat.o(73478);
      return paramView;
    }
  }

  private static com.tencent.mm.vending.j.c<Integer, Integer> dj(View paramView)
  {
    AppMethodBeat.i(73479);
    int i = paramView.getHeight();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    paramView = com.tencent.mm.vending.j.a.F(Integer.valueOf(arrayOfInt[1]), Integer.valueOf(i));
    AppMethodBeat.o(73479);
    return paramView;
  }

  private static int dk(View paramView)
  {
    AppMethodBeat.i(73480);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[1];
    AppMethodBeat.o(73480);
    return i;
  }

  private String dl(View paramView)
  {
    Object localObject = null;
    AppMethodBeat.i(73481);
    paramView = paramView.getTag();
    if (paramView == null)
    {
      AppMethodBeat.o(73481);
      paramView = localObject;
    }
    while (true)
    {
      return paramView;
      try
      {
        boolean bool = this.lNs.isInstance(paramView);
        if (!bool)
        {
          AppMethodBeat.o(73481);
          paramView = localObject;
          continue;
        }
        paramView = this.lNt.get(paramView);
        if (paramView != null)
          break label87;
        AppMethodBeat.o(73481);
        paramView = localObject;
      }
      catch (Exception paramView)
      {
        AppMethodBeat.o(73481);
        paramView = localObject;
      }
      continue;
      try
      {
        label87: paramView = (String)this.lNu.get(paramView);
        AppMethodBeat.o(73481);
      }
      catch (Exception paramView)
      {
        while (true)
        {
          ab.printErrStackTrace("TimelineMonitor", paramView, "habbyge-mali, getFeedParams.feedId: ", new Object[0]);
          paramView = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a.c.d
 * JD-Core Version:    0.6.2
 */