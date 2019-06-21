package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.g.a.kg;
import com.tencent.mm.g.a.kh;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication.NavigateBackAppTask;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.protocal.protobuf.axo;
import com.tencent.mm.protocal.protobuf.axp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class OpenBusinessViewUtil
{
  public static void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, OpenBusinessViewUtil.a parama)
  {
    AppMethodBeat.i(131050);
    axo localaxo = new axo();
    localaxo.cvd = paramInt;
    localaxo.wBx = paramString1;
    localaxo.wBy = paramString3;
    localaxo.wBz = paramString4;
    localaxo.query = paramString2;
    paramString1 = new b.a();
    paramString1.fsI = 1268;
    paramString1.uri = "/cgi-bin/mmbiz-bin/wxabusiness/launchbizwxaapp";
    paramString1.fsJ = localaxo;
    paramString1.fsK = new axp();
    b.a(paramString1.acD(), new OpenBusinessViewUtil.1(parama));
    AppMethodBeat.o(131050);
  }

  public static void k(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(131054);
    ab.i("MicroMsg.OpenBusinessViewUtil", "navigateBackMiniProgram, businessType:%s, errCode:%d", new Object[] { paramString1, Integer.valueOf(paramInt) });
    l(paramString1, paramInt, paramString2);
    AppMethodBeat.o(131054);
  }

  private static void l(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(131055);
    kh localkh = new kh();
    localkh.cFN.errCode = paramInt;
    localkh.cFN.businessType = paramString1;
    localkh.cFN.cFM = paramString2;
    a.xxA.m(localkh);
    AppMethodBeat.o(131055);
  }

  public static boolean l(o paramo)
  {
    AppMethodBeat.i(131051);
    boolean bool;
    if (paramo != null)
    {
      paramo = paramo.atI().hgF;
      if ((paramo != null) && (paramo.cvp == 5) && (!bo.isNullOrNil(paramo.businessType)))
      {
        bool = true;
        AppMethodBeat.o(131051);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(131051);
    }
  }

  public static void m(o paramo)
  {
    AppMethodBeat.i(131052);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer;
    if (l(paramo))
    {
      localAppBrandLaunchReferrer = paramo.atI().hgF;
      if (localAppBrandLaunchReferrer.hgQ == 2)
      {
        if (!n.xa(paramo.mAppId).gPl)
        {
          ab.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to H5, businessType:%s", new Object[] { localAppBrandLaunchReferrer.businessType });
          p(localAppBrandLaunchReferrer.businessType, null, -3);
        }
        AppMethodBeat.o(131052);
      }
    }
    while (true)
    {
      return;
      if (localAppBrandLaunchReferrer.hgQ == 4)
      {
        if (!n.xa(paramo.mAppId).gPn)
        {
          ab.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to Application, businessType:%s", new Object[] { localAppBrandLaunchReferrer.businessType });
          if ((paramo.atI().hgF != null) && (!bo.isNullOrNil(paramo.atI().hgF.appId)))
            o(paramo.atI().hgF.appId, localAppBrandLaunchReferrer.businessType, -2);
        }
        AppMethodBeat.o(131052);
      }
      else
      {
        if ((localAppBrandLaunchReferrer.hgQ == 1) && (!n.xa(paramo.mAppId).gPm))
        {
          ab.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to MiniProgram, businessType:%s", new Object[] { localAppBrandLaunchReferrer.businessType });
          k(localAppBrandLaunchReferrer.businessType, d.hJy.errCode, null);
        }
        AppMethodBeat.o(131052);
      }
    }
  }

  public static void o(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(131053);
    ab.i("MicroMsg.OpenBusinessViewUtil", "navigateBackApplication, appId:%s, businessType:%s, errCode:%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    AppBrandMainProcessService.a(new JsApiNavigateBackApplication.NavigateBackAppTask(paramString1, bo.bc(null, "{}"), paramString2, paramInt));
    AppMethodBeat.o(131053);
  }

  public static void p(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(131056);
    ab.i("MicroMsg.OpenBusinessViewUtil", "navigateBackH5, businessType:%s, errCode:%d", new Object[] { paramString1, Integer.valueOf(paramInt) });
    if (ah.bqo())
    {
      q(paramString1, paramString2, paramInt);
      AppMethodBeat.o(131056);
    }
    while (true)
    {
      return;
      AppBrandMainProcessService.a(new OpenBusinessViewUtil.NavigateBackH5Task(paramString1, paramString2, paramInt));
      AppMethodBeat.o(131056);
    }
  }

  public static void q(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(131057);
    kg localkg = new kg();
    localkg.cFL.businessType = paramString1;
    localkg.cFL.errCode = paramInt;
    localkg.cFL.cFM = paramString2;
    a.xxA.m(localkg);
    AppMethodBeat.o(131057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil
 * JD-Core Version:    0.6.2
 */