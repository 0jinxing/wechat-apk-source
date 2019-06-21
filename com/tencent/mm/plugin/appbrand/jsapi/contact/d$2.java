package com.tencent.mm.plugin.appbrand.jsapi.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.protocal.protobuf.aop;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class d$2
  implements b.a
{
  d$2(d paramd, d.a parama, w paramw, AppBrandSysConfigWC paramAppBrandSysConfigWC)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(131001);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramb.fsH.fsP == null))
    {
      ab.e("MicroMsg.JsApiEnterContact", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramb.fsH.fsP });
      if (this.hIv != null)
        this.hIv.a(false, "fail:cgi fail", null);
      AppMethodBeat.o(131001);
    }
    while (true)
    {
      return;
      paramString = (aop)paramb.fsH.fsP;
      ab.i("MicroMsg.JsApiEnterContact", "getsubbusinessinfo success, subBusinessUsername:%s", new Object[] { paramString.wsH });
      al.d(new d.2.1(this, paramString));
      AppMethodBeat.o(131001);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.d.2
 * JD-Core Version:    0.6.2
 */