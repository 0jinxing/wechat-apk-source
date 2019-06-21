package com.tencent.mm.plugin.appbrand.task;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.report.model.f.a;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import junit.framework.Assert;

public class AppBrandRemoteTaskController extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandRemoteTaskController> CREATOR;
  private static long iEM;
  public static boolean iEP;
  public i gOD = null;
  public f gPx = null;
  public String gQX;
  public long iEJ;
  public AppBrandRemoteTaskController.a iEK = AppBrandRemoteTaskController.a.iES;
  int iEL;
  private g iEN = g.iFh;
  String iEO;
  public int igj;
  public String mAppId;
  private long mTimestamp;

  static
  {
    AppMethodBeat.i(132841);
    iEP = false;
    CREATOR = new AppBrandRemoteTaskController.3();
    AppMethodBeat.o(132841);
  }

  private void aLV()
  {
    AppMethodBeat.i(132835);
    j localj;
    Object localObject;
    if (this.gQX.endsWith(".AppBrandEmbedUI"))
    {
      localj = h.a(new h.a()
      {
        public final boolean a(j paramAnonymousj)
        {
          AppMethodBeat.i(132823);
          boolean bool;
          if (((paramAnonymousj instanceof a)) && (((a)paramAnonymousj).iEd == AppBrandRemoteTaskController.a(AppBrandRemoteTaskController.this)))
          {
            bool = true;
            AppMethodBeat.o(132823);
          }
          while (true)
          {
            return bool;
            bool = false;
            AppMethodBeat.o(132823);
          }
        }
      });
      localObject = localj;
      if (localj == null)
        localObject = new a(this.iEJ);
      ((j)localObject).a(this.mAppId, this.igj, this);
      h.b((j)localObject);
      AppMethodBeat.o(132835);
    }
    while (true)
    {
      return;
      localj = h.DR(this.gQX);
      localObject = localj;
      if (localj != null)
        break;
      AppMethodBeat.o(132835);
    }
  }

  private void aLW()
  {
    AppMethodBeat.i(132836);
    if (h.cN(this.mAppId, this.gQX) == null)
      AppMethodBeat.o(132836);
    while (true)
    {
      return;
      h.DI(this.mAppId);
      AppMethodBeat.o(132836);
    }
  }

  public final void DL(String paramString)
  {
    AppMethodBeat.i(132831);
    this.iEK = AppBrandRemoteTaskController.a.iFb;
    this.mAppId = paramString;
    AppBrandMainProcessService.a(this);
    AppMethodBeat.o(132831);
  }

  final void DM(String paramString)
  {
    AppMethodBeat.i(132832);
    this.iEK = AppBrandRemoteTaskController.a.iEV;
    this.mAppId = paramString;
    aLW();
    aCb();
    AppMethodBeat.o(132832);
  }

  public final void a(String paramString, int paramInt, g paramg)
  {
    AppMethodBeat.i(132830);
    this.iEK = AppBrandRemoteTaskController.a.iET;
    this.mAppId = paramString;
    this.igj = paramInt;
    this.iEN = paramg;
    this.iEO = com.tencent.mm.plugin.appbrand.report.quality.a.DG(paramString).igT;
    AppBrandMainProcessService.a(this);
    AppMethodBeat.o(132830);
  }

  final boolean aLU()
  {
    AppMethodBeat.i(132833);
    this.iEK = AppBrandRemoteTaskController.a.iEZ;
    boolean bool = aCb();
    AppMethodBeat.o(132833);
    return bool;
  }

  public final void asP()
  {
    AppMethodBeat.i(132834);
    switch (AppBrandRemoteTaskController.4.iER[this.iEK.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(132834);
      while (true)
      {
        return;
        aLV();
        try
        {
          long l;
          if (iEM == 0L)
          {
            l = System.currentTimeMillis();
            iEM = l;
          }
          try
          {
            SharedPreferences.Editor localEditor = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "pref_appbrand_process", 4).edit();
            localEditor.putLong("on_wxa_process_connected_time", l);
            localEditor.commit();
            ab.v("MicroMsg.AppBrandReporter", "update timestamp(%s)", new Object[] { Long.valueOf(l) });
            this.mTimestamp = iEM;
            aCb();
            AppMethodBeat.o(132834);
          }
          catch (Throwable localThrowable)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.AppBrandReporter", localThrowable, "updateTimestamp(%d)", new Object[] { Long.valueOf(l) });
          }
        }
        finally
        {
          AppMethodBeat.o(132834);
        }
        aLV();
        AppMethodBeat.o(132834);
        continue;
        aLW();
        AppMethodBeat.o(132834);
        continue;
        h.pN(this.iEL);
        AppMethodBeat.o(132834);
        continue;
        h.DN(this.mAppId);
        AppMethodBeat.o(132834);
        continue;
        h.a(this.iEN, true);
        AppMethodBeat.o(132834);
      }
      Object localObject2 = com.tencent.mm.plugin.appbrand.report.model.f.iBe;
      String str = this.mAppId;
      localObject2 = (f.a)((com.tencent.mm.plugin.appbrand.report.model.f)localObject2).iBf.get(str);
      if (localObject2 != null)
        ((f.a)localObject2).iBh = bo.anU();
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(132837);
    switch (AppBrandRemoteTaskController.4.iER[this.iEK.ordinal()])
    {
    case 4:
    case 5:
    case 6:
    case 7:
    default:
    case 3:
    case 8:
    case 9:
    case 10:
    }
    while (true)
    {
      AppMethodBeat.o(132837);
      while (true)
      {
        return;
        this.gPx.finish();
        AppMethodBeat.o(132837);
        continue;
        switch (this.iEL)
        {
        default:
        case 0:
        case 1:
        }
        while (true)
        {
          AppMethodBeat.o(132837);
          break;
          b.pj(ah.getProcessName());
          this.gOD.finish();
          Process.killProcess(Process.myPid());
          AppMethodBeat.o(132837);
          break;
          this.gOD.a(new AppBrandRemoteTaskController.2(this));
        }
        Assert.assertTrue("AppBrand Test Assert", false);
        AppMethodBeat.o(132837);
      }
      this.gPx.onNetworkChange();
    }
  }

  public final void g(Parcel paramParcel)
  {
    Object localObject1 = null;
    AppMethodBeat.i(132839);
    this.mAppId = paramParcel.readString();
    this.igj = paramParcel.readInt();
    this.gQX = paramParcel.readString();
    this.iEJ = paramParcel.readLong();
    int i = paramParcel.readInt();
    if (i == -1)
    {
      localObject2 = null;
      this.iEK = ((AppBrandRemoteTaskController.a)localObject2);
      this.iEL = paramParcel.readInt();
      this.mTimestamp = paramParcel.readLong();
      i = paramParcel.readInt();
      if (i != -1)
        break label119;
    }
    label119: for (Object localObject2 = localObject1; ; localObject2 = g.values()[i])
    {
      this.iEN = ((g)localObject2);
      this.iEO = paramParcel.readString();
      AppMethodBeat.o(132839);
      return;
      localObject2 = AppBrandRemoteTaskController.a.values()[i];
      break;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(132838);
    paramParcel.writeString(this.mAppId);
    paramParcel.writeInt(this.igj);
    paramParcel.writeString(this.gQX);
    paramParcel.writeLong(this.iEJ);
    if (this.iEK == null)
    {
      paramInt = -1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.iEL);
      paramParcel.writeLong(this.mTimestamp);
      if (this.iEN != null)
        break label110;
    }
    label110: for (paramInt = i; ; paramInt = this.iEN.ordinal())
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.iEO);
      AppMethodBeat.o(132838);
      return;
      paramInt = this.iEK.ordinal();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController
 * JD-Core Version:    0.6.2
 */