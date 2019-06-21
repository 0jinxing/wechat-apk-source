package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.mm.plugin.appbrand.launching.params.AppBrandWeishiParams;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.f;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import junit.framework.Assert;

public final class an
  implements e
{
  private p eir;
  private boolean hJm = false;

  private void a(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(132014);
    aDw();
    paramContext.getString(2131297061);
    this.eir = h.b(paramContext, paramContext.getString(2131297086), true, paramOnCancelListener);
    AppMethodBeat.o(132014);
  }

  private void aDw()
  {
    AppMethodBeat.i(132015);
    if (this.eir != null)
    {
      this.eir.dismiss();
      this.eir = null;
    }
    AppMethodBeat.o(132015);
  }

  public final void a(Context paramContext, String paramString1, int paramInt, String paramString2, AppBrandStatObject paramAppBrandStatObject, String paramString3, String paramString4)
  {
    AppMethodBeat.i(132011);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    localAppBrandLaunchReferrer.hgQ = 7;
    localAppBrandLaunchReferrer.appId = paramString3;
    localAppBrandLaunchReferrer.hgT = paramString4;
    AppBrandLaunchProxyUI.a(paramContext, paramString1, null, paramString2, paramInt, 0, paramAppBrandStatObject, localAppBrandLaunchReferrer, null);
    AppMethodBeat.o(132011);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(132007);
    AppBrandLaunchProxyUI.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, null, null);
    AppMethodBeat.o(132007);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject, String paramString4)
  {
    AppMethodBeat.i(132008);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    switch (paramAppBrandStatObject.scene)
    {
    default:
    case 1036:
    case 1069:
    case 1055:
    case 1020:
    case 1035:
    case 1043:
    }
    while (true)
    {
      localAppBrandLaunchReferrer.appId = paramString4;
      AppBrandLaunchProxyUI.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, localAppBrandLaunchReferrer, null);
      AppMethodBeat.o(132008);
      return;
      localAppBrandLaunchReferrer.hgQ = 4;
      continue;
      localAppBrandLaunchReferrer.hgQ = 2;
      continue;
      localAppBrandLaunchReferrer.hgQ = 5;
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(132013);
    this.hJm = false;
    a(paramContext, new an.3(this, paramString1, paramString2));
    OpenBusinessViewUtil.a(1, paramString2, paramString3, paramString1, null, new an.4(this, paramString1, paramString2, paramContext, paramInt));
    AppMethodBeat.o(132013);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(132012);
    this.hJm = false;
    a(paramContext, new an.1(this, paramString3));
    OpenBusinessViewUtil.a(2, paramString3, paramString4, paramString2, paramString1, new an.2(this, paramString3, paramString1, paramString2, paramInt2, paramContext, paramInt1));
    AppMethodBeat.o(132012);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, j.b paramb)
  {
    AppMethodBeat.i(132009);
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1036;
    localAppBrandStatObject.cst = (bo.nullAsNil(paramb.appId) + ":" + bo.nullAsNil(q.encode(paramb.url)));
    int i;
    if (paramBoolean)
    {
      i = 2;
      localAppBrandStatObject.cOq = i;
      String str = paramString2;
      if (paramBoolean)
        str = String.format("%s:%s", new Object[] { paramString1, paramString2 });
      localAppBrandStatObject.cOr = str;
      paramString2 = new LaunchParamsOptional();
      if (bo.isNullOrNil(paramb.fiV))
        break label245;
      paramString2.bQh = paramString1;
      paramString2.bQi = paramb.fiV;
    }
    label245: for (localAppBrandStatObject.cst += ":1"; ; localAppBrandStatObject.cst += ":0")
    {
      paramString1 = new AppBrandLaunchReferrer();
      paramString1.hgQ = 4;
      paramString1.appId = paramb.appId;
      AppBrandLaunchProxyUI.a(paramContext, paramb.fiP, paramb.fiQ, paramb.fiO, paramb.fiZ, paramb.fja, localAppBrandStatObject, paramString1, paramString2);
      AppMethodBeat.o(132009);
      return;
      i = 1;
      break;
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, j.b paramb, Bundle paramBundle)
  {
    AppMethodBeat.i(132010);
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    LaunchParamsOptional localLaunchParamsOptional = new LaunchParamsOptional();
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    int j;
    label112: String str;
    if (paramBundle.getBoolean("stat_weishi_from_opensdk", false))
    {
      i = 1;
      if (i == 0)
        break label474;
      localAppBrandStatObject.scene = 1036;
      localAppBrandStatObject.cst = (bo.nullAsNil(paramb.appId) + ":" + bo.nullAsNil(q.encode(paramb.url)));
      if (!paramBoolean)
        break label437;
      j = 2;
      localAppBrandStatObject.cOq = j;
      str = paramString2;
      if (paramBoolean)
        str = String.format("%s:%s", new Object[] { paramString1, paramString2 });
      localAppBrandStatObject.cOr = str;
      ab.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, from opensdk appmsg, scene:%s", new Object[] { Integer.valueOf(localAppBrandStatObject.scene) });
      if (bo.isNullOrNil(paramb.fiV))
        break label443;
      localAppBrandStatObject.cst += ":1";
      label214: localAppBrandLaunchReferrer.appId = paramb.appId;
      localAppBrandLaunchReferrer.hgQ = 4;
      if (!bo.isNullOrNil(paramb.fiV))
      {
        localLaunchParamsOptional.bQh = paramString1;
        localLaunchParamsOptional.bQi = paramb.fiV;
      }
      if ("wxfe02ecfe70800f46".equalsIgnoreCase(paramb.fiQ))
      {
        paramString1 = new AppBrandWeishiParams();
        if (i == 0)
          break label645;
      }
    }
    label645: for (int i = 1; ; i = 0)
    {
      paramString1.ffp = i;
      paramString1.thumbUrl = paramBundle.getString("stat_weishi_thumb_url", null);
      paramString1.ijv = paramBundle.getString("stat_weishi_thumb_path", null);
      paramString1.ijw = paramBundle.getString("stat_weishi_msg_img_path", null);
      paramString1.appId = paramBundle.getString("stat_app_id", null);
      paramString1.appName = paramBundle.getString("stat_weishi_app_name", null);
      paramString1.ijx = paramBundle.getString("stat_weishi_source_username", null);
      localLaunchParamsOptional.bQj = paramString1;
      ab.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, weishi params:%s", new Object[] { paramString1 });
      AppBrandLaunchProxyUI.a(paramContext, paramb.fiP, paramb.fiQ, paramb.fiO, paramb.fiZ, paramb.fja, localAppBrandStatObject, localAppBrandLaunchReferrer, localLaunchParamsOptional);
      AppMethodBeat.o(132010);
      return;
      i = 0;
      break;
      label437: j = 1;
      break label112;
      label443: localAppBrandStatObject.cst += ":0";
      break label214;
      label474: str = paramb.fiU;
      if (paramBoolean)
        localAppBrandStatObject.scene = 1008;
      for (localAppBrandStatObject.cst = (paramString1 + ":" + paramString2 + ":" + str); ; localAppBrandStatObject.cst = (paramString2 + ":" + str))
      {
        localAppBrandStatObject.cOq = f.h(localAppBrandStatObject.scene, paramBundle);
        localAppBrandStatObject.cOr = f.i(localAppBrandStatObject.scene, paramBundle);
        ab.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, from chatting appmsg, scene:%s", new Object[] { Integer.valueOf(localAppBrandStatObject.scene) });
        localAppBrandLaunchReferrer.appId = paramb.appId;
        localAppBrandLaunchReferrer.hgQ = 6;
        break;
        localAppBrandStatObject.scene = 1007;
      }
    }
  }

  public final void b(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2)
  {
    AppMethodBeat.i(132006);
    if (bo.isNullOrNil(paramString3))
      AppMethodBeat.o(132006);
    while (true)
    {
      return;
      if ((bo.isNullOrNil(paramString3)) || (bo.isNullOrNil(paramString2)))
      {
        ab.e("MicroMsg.WeAppLauncher", "targetAppId %s referrerAppId %s, Null Or Nil");
        AppMethodBeat.o(132006);
      }
      else
      {
        AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
        localAppBrandStatObject.scene = 1055;
        localAppBrandStatObject.cst = (q.encode(bo.nullAsNil(paramString1)) + ":" + paramString2 + ":" + paramInt2);
        AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
        localAppBrandLaunchReferrer.appId = paramString2;
        localAppBrandLaunchReferrer.hgQ = 2;
        localAppBrandLaunchReferrer.url = paramString1;
        AppBrandLaunchProxyUI.a(paramContext, null, paramString3, paramString4, paramInt1, -1, localAppBrandStatObject, localAppBrandLaunchReferrer, null);
        Assert.assertTrue(true);
        AppMethodBeat.o(132006);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.an
 * JD-Core Version:    0.6.2
 */