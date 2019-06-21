package com.tencent.mm.plugin.webview.stub;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.la;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class WebViewStubService$1$1
  implements Runnable
{
  WebViewStubService$1$1(WebViewStubService.1 param1, int paramInt1, Bundle paramBundle, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7105);
    switch (this.uqC)
    {
    default:
      ab.e("MicroMsg.WebViewStubService", "not support action code:[%d]", new Object[] { Integer.valueOf(this.uqC) });
      AppMethodBeat.o(7105);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 20:
    case 21:
    case 41:
    case 29:
    case 30:
    }
    while (true)
    {
      return;
      WebViewStubService.a(this.uqE.uqB, 2, this.cgJ, this.uqD);
      AppMethodBeat.o(7105);
      continue;
      t.hO(this.uqE.uqB);
      AppMethodBeat.o(7105);
      continue;
      Object localObject1 = new Bundle();
      ((Bundle)localObject1).putInt("stat_scene", 4);
      Object localObject2 = h.JR(this.uqD);
      if (localObject2 != null)
        ((Bundle)localObject1).putString("stat_url", ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject2).getCurrentUrl());
      WebViewStubService.1.a(this.uqE, this.cgJ, (Bundle)localObject1);
      AppMethodBeat.o(7105);
      continue;
      WebViewStubService.a(this.uqE.uqB, 3, this.cgJ, this.uqD);
      AppMethodBeat.o(7105);
      continue;
      int i = this.cgJ.getInt("scene_end_type", 0);
      int j = this.cgJ.getInt("scene_end_listener_hash_code", -1);
      if (j != -1)
        WebViewStubService.a(this.uqE.uqB).add(Integer.valueOf(j));
      ab.i("MicroMsg.WebViewStubService", "add Scene end, type:[%d] hashCode:[%d], set_size:[%d], before_inc_count[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(WebViewStubService.a(this.uqE.uqB).size()), Integer.valueOf(WebViewStubService.b(this.uqE.uqB)) });
      if (i <= 0)
        break;
      WebViewStubService.c(this.uqE.uqB);
      ab.i("MicroMsg.WebViewStubService", "real add Scene end, hashCode:[%d]", new Object[] { Integer.valueOf(j) });
      com.tencent.mm.kernel.g.Rg().a(233, this.uqE.uqB);
      com.tencent.mm.kernel.g.Rg().a(673, this.uqE.uqB);
      com.tencent.mm.kernel.g.Rg().a(666, this.uqE.uqB);
      com.tencent.mm.kernel.g.Rg().a(1254, this.uqE.uqB);
      com.tencent.mm.kernel.g.Rg().a(1373, this.uqE.uqB);
      AppMethodBeat.o(7105);
      continue;
      j = this.cgJ.getInt("scene_end_type", 0);
      i = this.cgJ.getInt("scene_end_listener_hash_code", -1);
      if (i != -1)
        WebViewStubService.a(this.uqE.uqB).remove(Integer.valueOf(i));
      ab.i("MicroMsg.WebViewStubService", "remove Scene end, type:[%d] hashCode:[%d], set_size:[%d], before_dec_count:[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(WebViewStubService.a(this.uqE.uqB).size()), Integer.valueOf(WebViewStubService.b(this.uqE.uqB)) });
      if (j <= 0)
        break;
      WebViewStubService.d(this.uqE.uqB);
      if (WebViewStubService.b(this.uqE.uqB) < 0)
      {
        ab.e("MicroMsg.WebViewStubService", "remove Scene end, type:[%d] hashCode:[%d], set size:[%d], unexpected_count[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(WebViewStubService.a(this.uqE.uqB).size()), Integer.valueOf(WebViewStubService.b(this.uqE.uqB)) });
        WebViewStubService.e(this.uqE.uqB);
      }
      if ((WebViewStubService.b(this.uqE.uqB) > 0) || (WebViewStubService.a(this.uqE.uqB).size() > 0))
        break;
      ab.i("MicroMsg.WebViewStubService", "real remove Scene end, hashCode:[%d]", new Object[] { Integer.valueOf(i) });
      if (!com.tencent.mm.kernel.g.RK())
        break;
      com.tencent.mm.kernel.g.Rg().b(233, this.uqE.uqB);
      com.tencent.mm.kernel.g.Rg().b(673, this.uqE.uqB);
      com.tencent.mm.kernel.g.Rg().b(666, this.uqE.uqB);
      com.tencent.mm.kernel.g.Rg().b(1254, this.uqE.uqB);
      com.tencent.mm.kernel.g.Rg().b(1373, this.uqE.uqB);
      AppMethodBeat.o(7105);
      continue;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("MMActivity.OverrideEnterAnimation", 0);
      ((Intent)localObject1).putExtra("MMActivity.OverrideExitAnimation", 2131034227);
      ((Intent)localObject1).addFlags(268435456);
      com.tencent.mm.plugin.webview.a.a.gkE.r((Intent)localObject1, this.uqE.uqB);
      AppMethodBeat.o(7105);
      continue;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtras(this.cgJ);
      ((Intent)localObject1).addFlags(268435456);
      com.tencent.mm.plugin.webview.a.a.gkE.s((Intent)localObject1, this.uqE.uqB);
      AppMethodBeat.o(7105);
      continue;
      this.cgJ.setClassLoader(getClass().getClassLoader());
      h.JR(this.uqD).uGh = this.cgJ.getBundle("jsapiargs");
      localObject1 = (String)this.cgJ.getCharSequence("bizofstartfrom");
      localObject2 = this.cgJ.getBundle("startwebviewparams");
      if ((localObject1 != null) && (localObject2 != null))
      {
        localObject3 = new la();
        ((la)localObject3).cGS.cGT = ((String)localObject1);
        ((la)localObject3).cGS.params = ((Bundle)localObject2);
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject3);
      }
      WebViewStubService.a(this.uqE.uqB, this.cgJ.getInt("screen_orientation", -1));
      AppMethodBeat.o(7105);
      continue;
      h.JR(this.uqD).dcv().putAll(this.cgJ);
      AppMethodBeat.o(7105);
      continue;
      if (!com.tencent.mm.kernel.g.RK())
        break;
      Object localObject3 = h.JR(this.uqD);
      localObject1 = this.cgJ;
      if (((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject3).uGZ == null)
        break;
      if ((localObject1 == null) || (((Bundle)localObject1).size() <= 0))
        ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject3).a(((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject3).umI, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject3).uGZ, "showKeyboard:fail", null, true, true);
      while (true)
      {
        ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject3).uGZ = null;
        AppMethodBeat.o(7105);
        break;
        localObject2 = new HashMap();
        ((Map)localObject2).put("text", bo.nullAsNil(((Bundle)localObject1).getString("show_kb_input_callback_text")));
        ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject3).a(((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject3).umI, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject3).uGZ, "showKeyboard:ok", (Map)localObject2, true, true);
      }
      localObject1 = this.cgJ.getString("srcUsername");
      z.aeR();
      e.qU((String)localObject1);
      z.aeR();
      e.qV((String)localObject1);
      z.afc();
      if ((!bo.isNullOrNil((String)localObject1)) && (f.rd((String)localObject1)))
        z.afc().a((String)localObject1, null, 0, null);
      AppMethodBeat.o(7105);
      continue;
      localObject1 = this.cgJ.getString("srcUsername");
      z.aeR();
      e.qW((String)localObject1);
      z.afc();
      if ((!bo.isNullOrNil((String)localObject1)) && (f.rd((String)localObject1)))
        z.afc().a((String)localObject1, null);
      AppMethodBeat.o(7105);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubService.1.1
 * JD-Core Version:    0.6.2
 */