package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.a;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.protocal.protobuf.cqv;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class r extends s
  implements i
{
  private l hjR;
  private n hku;

  public final void M(int paramInt, String paramString)
  {
    AppMethodBeat.i(129949);
    String str = paramString;
    if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString))
      str = "{}";
    this.hku.hjU.L(paramInt, str);
    AppMethodBeat.o(129949);
  }

  public final int a(com.tencent.mm.plugin.appbrand.h.i parami, int paramInt)
  {
    return paramInt;
  }

  public final com.tencent.mm.plugin.appbrand.h.i aua()
  {
    AppMethodBeat.i(129947);
    this.hku = new n();
    n localn = this.hku;
    AppMethodBeat.o(129947);
    return localn;
  }

  public final void aud()
  {
  }

  public final boolean aui()
  {
    return false;
  }

  public final String ayX()
  {
    AppMethodBeat.i(129953);
    Object localObject = xW();
    String str = getRuntime().getAppConfig().hfg;
    localObject = String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", new Object[] { ((JSONObject)localObject).toString(), str });
    AppMethodBeat.o(129953);
    return localObject;
  }

  public final void dw(boolean paramBoolean)
  {
    AppMethodBeat.i(129952);
    super.dw(paramBoolean);
    this.hku.hjW.bringToFront();
    AppMethodBeat.o(129952);
  }

  public final void h(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(129948);
    String str = paramString2;
    if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString2))
      str = "{}";
    ab.d("MicroMsg.RemoteDebugService", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramString1, Integer.valueOf(str.length()), Integer.valueOf(paramInt) });
    this.hku.hjS = paramString1;
    n localn = this.hku;
    if (paramInt == 0);
    for (paramString2 = "undefined"; ; paramString2 = String.valueOf(paramInt))
    {
      localn.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\" , %s, %s, %s)", new Object[] { paramString1, str, paramString2, com.tencent.mm.plugin.appbrand.jsapi.bo.QB() }), null);
      AppMethodBeat.o(129948);
      return;
    }
  }

  public final void m(com.tencent.mm.plugin.appbrand.i parami)
  {
    AppMethodBeat.i(129951);
    super.m(parami);
    aCd();
    if (t.hkA != null)
    {
      this.hjR = t.hkA;
      t.hkA = null;
    }
    while (true)
    {
      this.hjR.a(this, getRuntime().atI().extInfo);
      this.hku.a(this.hjR);
      AppMethodBeat.o(129951);
      return;
      this.hjR = new l();
    }
  }

  public final void wO()
  {
    AppMethodBeat.i(129950);
    atZ();
    AppMethodBeat.o(129950);
  }

  public final void xd(String paramString)
  {
  }

  public final void zH(String paramString)
  {
    AppMethodBeat.i(129954);
    ab.d("MicroMsg.RemoteDebugService", "RemoteDebugInfo");
    cqv localcqv = new cqv();
    localcqv.xoH = getRuntime().atJ().getCurrentPage().getCurrentPageView().hashCode();
    localcqv.xoG = paramString;
    paramString = t.a(localcqv, this.hjR, "domEvent");
    this.hku.a(paramString);
    AppMethodBeat.o(129954);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.r
 * JD-Core Version:    0.6.2
 */