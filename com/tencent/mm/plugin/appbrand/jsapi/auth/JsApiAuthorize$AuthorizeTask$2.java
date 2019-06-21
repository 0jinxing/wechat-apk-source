package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.permission.m;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class JsApiAuthorize$AuthorizeTask$2
  implements Runnable
{
  JsApiAuthorize$AuthorizeTask$2(JsApiAuthorize.AuthorizeTask paramAuthorizeTask, LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130834);
    buj localbuj = (buj)this.hCi.get(0);
    i locali = this.hCg.hBR.getRuntime();
    boolean bool = m.a(localbuj.vOF, locali.ye());
    com.tencent.mm.plugin.appbrand.widget.b.h localh = new com.tencent.mm.plugin.appbrand.widget.b.h(locali.asV().getContext(), new JsApiAuthorize.AuthorizeTask.2.1(this));
    localh.Ez(locali.ye().cwz);
    localh.EC(this.hCg.hBY);
    localh.EA(localbuj.Desc);
    localh.ED(this.hCg.hBZ);
    localh.EE(this.hCg.hCa);
    localh.jl(this.hCg.hBX);
    if ("scope.userInfo".equals(localbuj.vOF))
    {
      e.a locala = e.hBN;
      e.a.a(this.hCg.hBR.getContext(), d.qi(this.hCg.hCb), this.hCg.hCc, localbuj.vOF, localh);
      if (!bool)
        break label255;
      if (!TextUtils.isEmpty(m.a(localbuj.vOF, locali)))
        break label242;
      JsApiAuthorize.AuthorizeTask.a(this.hCg, "fail:require permission desc");
      ab.i("MicroMsg.JsApiAuthorize", "error = fail:require permission desc");
      AppMethodBeat.o(130834);
    }
    while (true)
    {
      return;
      localh.EF(localbuj.vOF);
      break;
      label242: localh.EB(m.a(localbuj.vOF, locali));
      label255: ab.i("MicroMsg.JsApiAuthorize", "Confirm dialog scope=%s desc =%s auth_desc=%s ext_desc=%s", new Object[] { localbuj.vOF, localbuj.Desc, localbuj.wze, localbuj.iyZ });
      locali.gNG.b(localh);
      AppMethodBeat.o(130834);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize.AuthorizeTask.2
 * JD-Core Version:    0.6.2
 */