package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.freewifi.d.i;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements f
{
  b$2(b paramb, String paramString1, String paramString2, String paramString3, String paramString4)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20932);
    ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.protocol31GetPortalApInfo.callback, desc=net request [GetPortalApInfo] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.myt.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.myt.intent)), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    Object localObject;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localObject = k.byo();
      ((k.a)localObject).cuH = this.myt.cuH;
      ((k.a)localObject).kBq = com.tencent.mm.plugin.freewifi.m.V(this.myt.intent);
      ((k.a)localObject).muf = k.b.muA.muQ;
      ((k.a)localObject).mug = k.b.muA.name;
      ((k.a)localObject).cIb = this.myt.cIb;
      ((k.a)localObject).result = paramInt2;
      ((k.a)localObject).ehr = paramString;
      ((k.a)localObject).byq().b(this.myt.intent, false).byp();
      paramm = (i)paramm;
      paramString = paramm.bzn();
      if (com.tencent.mm.plugin.freewifi.m.isEmpty(paramString))
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.protocol31GetPortalApInfo, desc=authUrl is empty, so it fails to connect wifi. ", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.myt.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.myt.intent)) });
        this.myt.MN(this.myt.activity.getString(2131300048));
        paramString = k.byo();
        paramString.cuH = this.myt.cuH;
        paramString.kBq = com.tencent.mm.plugin.freewifi.m.V(this.myt.intent);
        paramString.muf = k.b.muB.muQ;
        paramString.mug = k.b.muB.name;
        paramString.cIb = this.myt.cIb;
        paramString.mue = com.tencent.mm.plugin.freewifi.m.X(this.myt.intent);
        paramString.result = -1;
        paramString.ehr = "31 auth url is empty.";
        paramString.byq().b(this.myt.intent, true).byp();
        AppMethodBeat.o(20932);
      }
    }
    while (true)
    {
      return;
      paramm = com.tencent.mm.plugin.freewifi.m.Mw(paramm.bzo());
      localObject = com.tencent.mm.plugin.freewifi.m.Mw(this.myu);
      String str = com.tencent.mm.plugin.freewifi.m.Mw(this.myv);
      StringBuilder localStringBuilder = new StringBuilder(paramString);
      if (paramString.indexOf("?") != -1)
        localStringBuilder.append("&extend=").append(paramm);
      while (true)
      {
        localStringBuilder.append("&openId=").append((String)localObject).append("&tid=").append(str).append("&timestamp=").append(com.tencent.mm.plugin.freewifi.m.Mw(this.myw)).append("&sign=").append(com.tencent.mm.plugin.freewifi.m.Mw(this.myx));
        ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.protocol31GetPortalApInfo, desc=it gets authentication url. http url=%s ", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.myt.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.myt.intent)), localStringBuilder.toString() });
        this.myt.intent.putExtra("free_wifi_portal_ap_info_authurl_with_params", localStringBuilder.toString());
        this.myt.intent.setClass(this.myt.activity, FreeWifiFrontPageUI.class);
        this.myt.activity.startActivity(this.myt.intent);
        this.myt.activity.finish();
        this.myt.activity.overridePendingTransition(2131034265, 2131034262);
        paramString = k.byo();
        paramString.cuH = this.myt.cuH;
        paramString.kBq = com.tencent.mm.plugin.freewifi.m.V(this.myt.intent);
        paramString.muf = k.b.muB.muQ;
        paramString.mug = k.b.muB.name;
        paramString.cIb = this.myt.cIb;
        paramString.mue = com.tencent.mm.plugin.freewifi.m.X(this.myt.intent);
        paramString.result = 0;
        paramString.ehr = "";
        paramString.byq().b(this.myt.intent, true).byp();
        AppMethodBeat.o(20932);
        break;
        localStringBuilder.append("?extend=").append(paramm);
      }
      paramm = k.byo();
      paramm.cuH = this.myt.cuH;
      paramm.kBq = com.tencent.mm.plugin.freewifi.m.V(this.myt.intent);
      paramm.muf = k.b.muA.muQ;
      paramm.mug = k.b.muA.name;
      paramm.cIb = this.myt.cIb;
      paramm.mue = com.tencent.mm.plugin.freewifi.m.X(this.myt.intent);
      paramm.result = paramInt2;
      paramm.ehr = paramString;
      paramm.byq().b(this.myt.intent, true).byp();
      if ((com.tencent.mm.plugin.freewifi.m.eh(paramInt1, paramInt2)) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(paramString)))
      {
        this.myt.MN(paramString + "(" + com.tencent.mm.plugin.freewifi.m.a(com.tencent.mm.plugin.freewifi.m.X(this.myt.intent), k.b.muA, paramInt2) + ")");
        AppMethodBeat.o(20932);
      }
      else if (com.tencent.mm.plugin.freewifi.m.isEmpty(paramString))
      {
        this.myt.MN(this.myt.activity.getString(2131300048));
        AppMethodBeat.o(20932);
      }
      else
      {
        this.myt.MN(paramString);
        AppMethodBeat.o(20932);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.b.2
 * JD-Core Version:    0.6.2
 */