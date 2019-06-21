package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.ui.k;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"DefaultLocale"})
public class AppBrandPerformanceManager
{
  protected static final SparseArray<AppBrandPerformanceManager.a> ivB;

  static
  {
    AppMethodBeat.i(102241);
    ivB = new SparseArray();
    AppMethodBeat.o(102241);
  }

  public static void Dl(String paramString)
  {
    AppMethodBeat.i(102230);
    ab.d("MicroMsg.AppBrandPerformanceManager", "stopMonitoring, appId: %s", new Object[] { paramString });
    int i = paramString.hashCode();
    paramString = (AppBrandPerformanceManager.a)ivB.get(i);
    if (paramString != null)
    {
      ivB.remove(i);
      paramString.stop();
    }
    AppMethodBeat.o(102230);
  }

  public static void Dm(String paramString)
  {
    AppMethodBeat.i(102231);
    ab.d("MicroMsg.AppBrandPerformanceManager", "enablePanel for AppId %s", new Object[] { paramString });
    SetAppPerformanceModeTask localSetAppPerformanceModeTask = new SetAppPerformanceModeTask((byte)0);
    SetAppPerformanceModeTask.a(localSetAppPerformanceModeTask, paramString);
    SetAppPerformanceModeTask.a(localSetAppPerformanceModeTask, true);
    AppBrandMainProcessService.a(localSetAppPerformanceModeTask);
    AppMethodBeat.o(102231);
  }

  public static void Dn(String paramString)
  {
    AppMethodBeat.i(102232);
    ab.d("MicroMsg.AppBrandPerformanceManager", "disablePanel for AppId %s", new Object[] { paramString });
    SetAppPerformanceModeTask localSetAppPerformanceModeTask = new SetAppPerformanceModeTask((byte)0);
    SetAppPerformanceModeTask.a(localSetAppPerformanceModeTask, paramString);
    SetAppPerformanceModeTask.a(localSetAppPerformanceModeTask, false);
    AppBrandMainProcessService.a(localSetAppPerformanceModeTask);
    AppMethodBeat.o(102232);
  }

  public static void a(com.tencent.luggage.sdk.b.b paramb)
  {
    AppMethodBeat.i(102229);
    String str = paramb.mAppId;
    ab.d("MicroMsg.AppBrandPerformanceManager", "startMonitoring, appId: %s", new Object[] { str });
    AppBrandPerformanceManager.a locala1 = (AppBrandPerformanceManager.a)ivB.get(str.hashCode());
    AppBrandPerformanceManager.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new AppBrandPerformanceManager.a(paramb);
      ivB.put(str.hashCode(), locala2);
    }
    locala2.start();
    AppMethodBeat.o(102229);
  }

  public static void a(com.tencent.luggage.sdk.b.b paramb, int paramInt, long paramLong)
  {
    AppMethodBeat.i(102234);
    a(paramb, paramInt, String.format("%d ms", new Object[] { Long.valueOf(paramLong) }));
    AppMethodBeat.o(102234);
  }

  public static void a(com.tencent.luggage.sdk.b.b paramb, int paramInt, String paramString)
  {
    AppMethodBeat.i(102235);
    String str = paramb.mAppId;
    paramb = paramb.bRn;
    if (paramb == null)
    {
      v.Zp().y(str.hashCode() + "performance_data", true).j(String.valueOf(paramInt), paramString);
      AppMethodBeat.o(102235);
    }
    while (true)
    {
      return;
      paramb.ae(paramInt, paramString);
      AppMethodBeat.o(102235);
    }
  }

  public static void a(com.tencent.luggage.sdk.b.b paramb, long paramLong)
  {
    AppMethodBeat.i(102239);
    a(paramb, 201, paramLong);
    AppMethodBeat.o(102239);
  }

  public static void a(com.tencent.luggage.sdk.b.b paramb, String paramString1, String paramString2)
  {
    AppMethodBeat.i(102236);
    String str = paramb.mAppId;
    paramb = paramb.bRn;
    if (paramb == null)
    {
      v.Zp().y(str.hashCode() + "performance_custom_data", true).j(paramString1, paramString2);
      AppMethodBeat.o(102236);
    }
    while (true)
    {
      return;
      paramb.cP(paramString1, paramString2);
      AppMethodBeat.o(102236);
    }
  }

  public static boolean b(com.tencent.luggage.sdk.b.b paramb)
  {
    AppMethodBeat.i(102233);
    paramb = (a)paramb.aa(a.class);
    boolean bool;
    if ((paramb != null) && (paramb.ivy))
    {
      bool = true;
      AppMethodBeat.o(102233);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102233);
    }
  }

  public static void c(com.tencent.luggage.sdk.b.b paramb)
  {
    AppMethodBeat.i(102237);
    Object localObject = paramb.mAppId;
    k localk = paramb.bRn;
    localObject = v.Zp().nV(((String)localObject).hashCode() + "performance_data");
    if (localk == null)
      ab.e("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData panel is not ready.");
    while (true)
    {
      d(paramb);
      AppMethodBeat.o(102237);
      return;
      if (localObject == null)
      {
        ab.d("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData cache is empty.");
      }
      else
      {
        Iterator localIterator = ((v.b)localObject).getKeySet().iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = (String)((v.b)localObject).get(str1);
          if (str2 != null)
            localk.ae(Integer.valueOf(str1).intValue(), str2);
        }
      }
    }
  }

  private static void d(com.tencent.luggage.sdk.b.b paramb)
  {
    AppMethodBeat.i(102238);
    Object localObject = paramb.mAppId;
    paramb = paramb.bRn;
    localObject = v.Zp().nV(((String)localObject).hashCode() + "performance_custom_data");
    if (paramb == null)
    {
      ab.e("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData panel is not ready.");
      AppMethodBeat.o(102238);
    }
    while (true)
    {
      return;
      if (localObject == null)
      {
        ab.d("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData cache is empty.");
        AppMethodBeat.o(102238);
      }
      else
      {
        Iterator localIterator = ((v.b)localObject).getKeySet().iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = (String)((v.b)localObject).get(str1);
          if (str2 != null)
            paramb.cP(str1, str2);
        }
        AppMethodBeat.o(102238);
      }
    }
  }

  public static boolean e(com.tencent.luggage.sdk.b.b paramb)
  {
    AppMethodBeat.i(102240);
    boolean bool;
    if (!b(paramb))
    {
      bool = false;
      AppMethodBeat.o(102240);
    }
    while (true)
    {
      return bool;
      bool = c.Do(paramb.mAppId);
      AppMethodBeat.o(102240);
    }
  }

  static class SetAppPerformanceModeTask extends MainProcessTask
  {
    public static final Parcelable.Creator<SetAppPerformanceModeTask> CREATOR;
    private String mAppId;
    private boolean mEnable;

    static
    {
      AppMethodBeat.i(102228);
      CREATOR = new Parcelable.Creator()
      {
      };
      AppMethodBeat.o(102228);
    }

    public final void asP()
    {
      AppMethodBeat.i(102225);
      com.tencent.mm.plugin.appbrand.config.c localc = ((com.tencent.luggage.sdk.customize.b)e.B(com.tencent.luggage.sdk.customize.b.class)).xH();
      String str1 = this.mAppId + "_PerformancePanelEnabled";
      if (this.mEnable);
      for (String str2 = "1"; ; str2 = "0")
      {
        localc.bG(str1, str2);
        AppMethodBeat.o(102225);
        return;
      }
    }

    public final void g(Parcel paramParcel)
    {
      AppMethodBeat.i(102226);
      this.mAppId = paramParcel.readString();
      if (paramParcel.readByte() != 0);
      for (boolean bool = true; ; bool = false)
      {
        this.mEnable = bool;
        AppMethodBeat.o(102226);
        return;
      }
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(102227);
      paramParcel.writeString(this.mAppId);
      if (this.mEnable)
        paramInt = 1;
      int j;
      for (int i = paramInt; ; j = paramInt)
      {
        paramParcel.writeByte(i);
        AppMethodBeat.o(102227);
        return;
        paramInt = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager
 * JD-Core Version:    0.6.2
 */