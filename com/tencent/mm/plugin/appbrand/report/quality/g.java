package com.tencent.mm.plugin.appbrand.report.quality;

import a.f.b.u.b;
import a.l;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cb;
import com.tencent.mm.g.b.a.cb.a;
import com.tencent.mm.g.b.a.cf;
import com.tencent.mm.g.b.a.cf.a;
import com.tencent.mm.g.b.a.ch;
import com.tencent.mm.g.b.a.ch.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/report/quality/AppStartupPerformanceReportUtil;", "", "()V", "createContactReportStruct", "Lcom/tencent/mm/autogen/mmdata/rpt/WeAppQualitySystemContactCGIStruct;", "session", "Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySession;", "createLaunchReportStruct", "Lcom/tencent/mm/autogen/mmdata/rpt/WeAppQualitySystemLaunchCGIStruct;", "createRuntimeSession", "Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySessionRuntime;", "generateInstanceId", "", "uin", "", "getNetworkType", "qualityOpen", "", "runtime", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "onResume", "", "qualityOpenBeforeLaunch", "parcel", "Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;", "qualityOpenBeforeNavigate", "from", "Lcom/tencent/mm/plugin/appbrand/AppBrandComponentWxaShared;", "nilAs", "as", "Lkotlin/Function0;", "setParcel", "Lcom/tencent/mm/autogen/mmdata/rpt/WeAppQualityOpenStruct;", "plugin-appbrand-integration_release"})
public final class g
{
  public static final g iCO;

  static
  {
    AppMethodBeat.i(134958);
    iCO = new g();
    AppMethodBeat.o(134958);
  }

  public static final cf a(QualitySession paramQualitySession)
  {
    AppMethodBeat.i(134951);
    a.f.b.j.p(paramQualitySession, "session");
    cf localcf = new cf();
    localcf.ha(paramQualitySession.appId);
    localcf.gZ(paramQualitySession.igT);
    localcf.a(cf.a.hf(paramQualitySession.iCZ));
    localcf.dZ(paramQualitySession.apptype);
    localcf.eb(paramQualitySession.scene);
    localcf.dY(paramQualitySession.iDa);
    AppMethodBeat.o(134951);
    return localcf;
  }

  public static final String a(LaunchParcel paramLaunchParcel)
  {
    AppMethodBeat.i(134955);
    a.f.b.j.p(paramLaunchParcel, "parcel");
    String str = paramLaunchParcel.appId;
    Object localObject = (CharSequence)str;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i != 0)
        str = com.tencent.mm.plugin.appbrand.config.p.zm(paramLaunchParcel.username);
      str = h.bv(str, paramLaunchParcel.har);
      localObject = (CharSequence)str;
      if ((localObject != null) && (((CharSequence)localObject).length() != 0))
        break label148;
      i = 1;
      label77: if (i == 0)
        break label153;
      a.f.b.j.o(com.tencent.mm.kernel.g.RN(), "MMKernel.account()");
      str = pM(com.tencent.mm.kernel.a.QF());
    }
    label148: label153: for (int i = 1; ; i = 0)
    {
      if (str == null)
        a.f.b.j.dWJ();
      localObject = new cb();
      ((cb)localObject).gQ(str);
      ((cb)localObject).dX(i);
      a((cb)localObject, paramLaunchParcel);
      ((cb)localObject).ajK();
      AppMethodBeat.o(134955);
      return str;
      i = 0;
      break;
      i = 0;
      break label77;
    }
  }

  private static void a(cb paramcb, LaunchParcel paramLaunchParcel)
  {
    AppMethodBeat.i(134957);
    paramcb.gR(paramLaunchParcel.appId);
    paramcb.dU(paramLaunchParcel.version);
    paramcb.a(cb.a.hc(paramLaunchParcel.har + 1));
    paramcb.dW(paramLaunchParcel.ijy.scene);
    paramcb.gS(com.tencent.mm.plugin.appbrand.report.j.cW(ah.getContext()));
    paramcb.gT(paramLaunchParcel.username);
    AppMethodBeat.o(134957);
  }

  public static final void a(o paramo, boolean paramBoolean)
  {
    AppMethodBeat.i(134954);
    a.f.b.j.p(paramo, "runtime");
    QualitySessionRuntime localQualitySessionRuntime = a.DG(paramo.getAppId());
    long l;
    if (localQualitySessionRuntime != null)
    {
      cb localcb = new cb();
      localcb.gR(localQualitySessionRuntime.appId);
      localcb.dU(localQualitySessionRuntime.iDa);
      localcb.a(cb.a.hc(localQualitySessionRuntime.iCZ));
      localcb.dV(localQualitySessionRuntime.apptype);
      localcb.dW(paramo.xx().scene);
      localcb.gS(com.tencent.mm.plugin.appbrand.report.j.cW(ah.getContext()));
      localcb.gT(paramo.atI().username);
      localcb.gQ(localQualitySessionRuntime.igT);
      if (paramBoolean)
      {
        l = 0L;
        localcb.dX(l);
        localcb.ajK();
        AppMethodBeat.o(134954);
      }
    }
    while (true)
    {
      return;
      l = 1L;
      break;
      AppMethodBeat.o(134954);
    }
  }

  public static final ch b(QualitySession paramQualitySession)
  {
    AppMethodBeat.i(134952);
    a.f.b.j.p(paramQualitySession, "session");
    ch localch = new ch();
    localch.he(paramQualitySession.appId);
    localch.hd(paramQualitySession.igT);
    localch.a(ch.a.hi(paramQualitySession.iCZ));
    localch.ei(paramQualitySession.apptype);
    localch.ek(paramQualitySession.scene);
    localch.eh(paramQualitySession.iDa);
    AppMethodBeat.o(134952);
    return localch;
  }

  public static final String b(d paramd, LaunchParcel paramLaunchParcel)
  {
    AppMethodBeat.i(134956);
    a.f.b.j.p(paramd, "from");
    a.f.b.j.p(paramLaunchParcel, "parcel");
    u.b localb = new u.b();
    localb.AVD = 0;
    Object localObject1 = com.tencent.mm.plugin.appbrand.a.wI(paramLaunchParcel.appId);
    if (localObject1 != null)
    {
      if ((!((o)localObject1).ate()) || (((o)localObject1).finished()) || (((o)localObject1).asT() != paramLaunchParcel.har))
        break label159;
      localObject1 = a.DG(((o)localObject1).getAppId());
      if (localObject1 == null)
        break label159;
    }
    label159: for (localObject1 = ((QualitySessionRuntime)localObject1).igT; ; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = (String)((a.f.a.a)new g.a(localb, paramd)).invoke();
      paramd = new cb();
      paramd.gQ((String)localObject2);
      paramd.dX(localb.AVD);
      a(paramd, paramLaunchParcel);
      paramd.ajK();
      AppMethodBeat.o(134956);
      return localObject2;
    }
  }

  public static final QualitySessionRuntime c(QualitySession paramQualitySession)
  {
    AppMethodBeat.i(134953);
    a.f.b.j.p(paramQualitySession, "session");
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    paramQualitySession.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramQualitySession = new QualitySessionRuntime(localParcel);
    localParcel.recycle();
    AppMethodBeat.o(134953);
    return paramQualitySession;
  }

  public static final int getNetworkType()
  {
    AppMethodBeat.i(134949);
    String str = c.cV(ah.getContext());
    if (str == null)
      a.f.b.j.dWJ();
    int i;
    if (a.f.b.j.j(str, c.iAf))
    {
      i = 0;
      AppMethodBeat.o(134949);
    }
    while (true)
    {
      return i;
      if (a.f.b.j.j(str, c.iAg))
      {
        i = 1;
        AppMethodBeat.o(134949);
      }
      else if (a.f.b.j.j(str, c.iAh))
      {
        i = 2;
        AppMethodBeat.o(134949);
      }
      else if (a.f.b.j.j(str, c.iAi))
      {
        i = 3;
        AppMethodBeat.o(134949);
      }
      else if (a.f.b.j.j(str, c.iAj))
      {
        i = 4;
        AppMethodBeat.o(134949);
      }
      else if (a.f.b.j.j(str, "offline"))
      {
        i = 5;
        AppMethodBeat.o(134949);
      }
      else
      {
        i = 10000;
        AppMethodBeat.o(134949);
      }
    }
  }

  public static final String pM(int paramInt)
  {
    AppMethodBeat.i(134950);
    String str = com.tencent.mm.a.p.getString(paramInt);
    a.f.b.j.o(str, "UIN.getString(uin)");
    str = a.a.j.a((Iterable)a.a.j.listOf(new String[] { str, String.valueOf(bo.anU()) }), (CharSequence)"_", null, null, 0, null, null, 62);
    AppMethodBeat.o(134950);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.g
 * JD-Core Version:    0.6.2
 */