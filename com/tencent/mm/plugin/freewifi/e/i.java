package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiErrorUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.b;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class i extends e
  implements a
{
  protected String cvO;
  private int mwR;
  protected String mwU;
  protected String mwV;
  protected String mwW;
  private Uri mwX;
  private String mwY;
  protected String sign;

  public i(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    AppMethodBeat.i(20841);
    this.mwR = 0;
    this.mwY = this.intent.getStringExtra("free_wifi_schema_uri");
    this.mwX = Uri.parse(this.mwY);
    this.appId = this.mwX.getQueryParameter("appId");
    this.mwU = this.mwX.getQueryParameter("shopId");
    this.mwV = this.mwX.getQueryParameter("authUrl");
    this.mwW = this.mwX.getQueryParameter("extend");
    this.cvO = this.mwX.getQueryParameter("timestamp");
    this.sign = this.mwX.getQueryParameter("sign");
    ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=Data retrieved. schemaUri=%s, appid=%s, shopId=%s, authUrl=%s, extend=%s, timestamp=%s, sign=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.intent)), this.mwX, this.appId, this.mwU, this.mwV, this.mwW, this.cvO, this.sign });
    AppMethodBeat.o(20841);
  }

  protected final void bzv()
  {
    AppMethodBeat.i(20843);
    j.byZ().byI().post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(20840);
        Object localObject = k.byo();
        ((k.a)localObject).ssid = i.this.ssid;
        ((k.a)localObject).bssid = com.tencent.mm.plugin.freewifi.m.My("MicroMsg.FreeWifi.Protocol33");
        ((k.a)localObject).cuI = com.tencent.mm.plugin.freewifi.m.Mz("MicroMsg.FreeWifi.Protocol33");
        ((k.a)localObject).cuH = i.this.cuH;
        ((k.a)localObject).kBq = com.tencent.mm.plugin.freewifi.m.V(i.this.intent);
        ((k.a)localObject).mue = i.this.mwG;
        ((k.a)localObject).muf = k.b.mut.muQ;
        ((k.a)localObject).mug = k.b.mut.name;
        ((k.a)localObject).cIb = com.tencent.mm.plugin.freewifi.m.Y(i.this.intent);
        ((k.a)localObject).result = 0;
        ((k.a)localObject).byq().byp();
        String str = d.byK();
        localObject = d.byO();
        int i = d.byL();
        ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.getBackPageInfoAfterConnectSuccess, desc=it starts net request [apauth.getBackPageFor33]  for backpage info. fullUrl=%s, nowApMac=%s, nowNetworkSSID=%s, rssi=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.V(i.this.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(i.this.intent)), "", str, localObject, Integer.valueOf(i) });
        new com.tencent.mm.plugin.freewifi.d.f(i.this.ssid, com.tencent.mm.plugin.freewifi.m.My("MicroMsg.FreeWifi.Protocol33"), i.this.appId, i.this.mwU, i.this.mwV, i.this.mwW, i.this.cvO, i.this.sign).c(new com.tencent.mm.ai.f()
        {
          public final void onSceneEnd(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ai.m paramAnonymous2m)
          {
            AppMethodBeat.i(20839);
            ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=FreeWifiConnector.getA8Key.callback, desc=net request [apauth.getBackPageFor33] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(i.this.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(i.this.intent)), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
            Object localObject = k.byo();
            ((k.a)localObject).ssid = i.this.ssid;
            ((k.a)localObject).bssid = com.tencent.mm.plugin.freewifi.m.My("MicroMsg.FreeWifi.Protocol33");
            ((k.a)localObject).cuI = com.tencent.mm.plugin.freewifi.m.Mz("MicroMsg.FreeWifi.Protocol33");
            ((k.a)localObject).cuH = i.this.cuH;
            ((k.a)localObject).kBq = com.tencent.mm.plugin.freewifi.m.V(i.this.intent);
            ((k.a)localObject).mue = com.tencent.mm.plugin.freewifi.m.X(i.this.intent);
            ((k.a)localObject).muf = k.b.muu.muQ;
            ((k.a)localObject).mug = k.b.muu.name;
            ((k.a)localObject).cIb = com.tencent.mm.plugin.freewifi.m.Y(i.this.intent);
            ((k.a)localObject).result = paramAnonymous2Int2;
            ((k.a)localObject).ehr = paramAnonymous2String;
            ((k.a)localObject).byq().byp();
            if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
            {
              paramAnonymous2String = ((com.tencent.mm.plugin.freewifi.d.f)paramAnonymous2m).bzj();
              if (paramAnonymous2String != null)
              {
                ab.i("MicroMsg.FreeWifi.Protocol33", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { paramAnonymous2String.vEn, paramAnonymous2String.jCH, paramAnonymous2String.jBB, Integer.valueOf(paramAnonymous2String.vID), paramAnonymous2String.vIE, paramAnonymous2String.guQ, paramAnonymous2String.vIF });
                FreeWifiFrontPageUI localFreeWifiFrontPageUI = i.this.mwF;
                paramAnonymous2m = FreeWifiFrontPageUI.d.mzl;
                localObject = new FreeWifiFrontPageUI.b();
                ((FreeWifiFrontPageUI.b)localObject).mzh = paramAnonymous2String;
                localFreeWifiFrontPageUI.a(paramAnonymous2m, localObject);
                AppMethodBeat.o(20839);
              }
            }
            while (true)
            {
              return;
              paramAnonymous2m = i.this.mwF;
              paramAnonymous2String = FreeWifiFrontPageUI.d.mzk;
              localObject = new FreeWifiFrontPageUI.a();
              ((FreeWifiFrontPageUI.a)localObject).myI = com.tencent.mm.plugin.freewifi.m.a(i.this.mwG, k.b.muu, 20);
              paramAnonymous2m.a(paramAnonymous2String, localObject);
              AppMethodBeat.o(20839);
              continue;
              if (paramAnonymous2Int2 == -30032)
              {
                paramAnonymous2String = new Intent();
                paramAnonymous2String.putExtra("free_wifi_error_ui_error_msg", i.this.mwF.getString(2131300043));
                paramAnonymous2String.setClass(i.this.mwF, FreeWifiErrorUI.class);
                i.this.mwF.finish();
                i.this.mwF.startActivity(paramAnonymous2String);
                AppMethodBeat.o(20839);
              }
              else
              {
                paramAnonymous2m = i.this.mwF;
                localObject = FreeWifiFrontPageUI.d.mzk;
                paramAnonymous2String = new FreeWifiFrontPageUI.a();
                paramAnonymous2String.myH = 2131300038;
                paramAnonymous2String.myI = com.tencent.mm.plugin.freewifi.m.a(i.this.mwG, k.b.muu, paramAnonymous2Int2);
                paramAnonymous2m.a((FreeWifiFrontPageUI.d)localObject, paramAnonymous2String);
                AppMethodBeat.o(20839);
              }
            }
          }
        });
        AppMethodBeat.o(20840);
      }
    });
    AppMethodBeat.o(20843);
  }

  public final void connect()
  {
    AppMethodBeat.i(20842);
    Object localObject1;
    FreeWifiFrontPageUI.a locala;
    if (com.tencent.mm.plugin.freewifi.m.isEmpty(this.ssid))
    {
      ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=it cannot get ssid, so it fails. ", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.intent)) });
      localObject1 = this.mwF;
      localObject2 = FreeWifiFrontPageUI.d.mzk;
      locala = new FreeWifiFrontPageUI.a();
      locala.myI = com.tencent.mm.plugin.freewifi.m.a(this.mwG, k.b.muJ, 32);
      ((FreeWifiFrontPageUI)localObject1).a((FreeWifiFrontPageUI.d)localObject2, locala);
      AppMethodBeat.o(20842);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.plugin.freewifi.m.isEmpty(this.mwV))
        break;
      ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, desc=authurl is empty, so it fails. ", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.intent)) });
      localObject2 = this.mwF;
      localObject1 = FreeWifiFrontPageUI.d.mzk;
      locala = new FreeWifiFrontPageUI.a();
      locala.myI = com.tencent.mm.plugin.freewifi.m.a(this.mwG, k.b.muJ, 32);
      ((FreeWifiFrontPageUI)localObject2).a((FreeWifiFrontPageUI.d)localObject1, locala);
      AppMethodBeat.o(20842);
    }
    Object localObject2 = new StringBuilder(this.mwV);
    if (this.mwV.indexOf("?") == -1)
      ((StringBuilder)localObject2).append("?extend=").append(this.mwW);
    while (true)
    {
      localObject2 = ((StringBuilder)localObject2).toString();
      j.byZ().byI().post(new i.1(this, (String)localObject2));
      AppMethodBeat.o(20842);
      break;
      ((StringBuilder)localObject2).append("&extend=").append(this.mwW);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.i
 * JD-Core Version:    0.6.2
 */