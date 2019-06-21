package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.d.c;
import com.tencent.mm.plugin.freewifi.d.i;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.protocal.protobuf.acq;
import com.tencent.mm.protocal.protobuf.bns;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

final class b$1
  implements f
{
  b$1(b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20931);
    Object localObject1 = k.byo();
    ((k.a)localObject1).cuH = this.myt.cuH;
    ((k.a)localObject1).kBq = com.tencent.mm.plugin.freewifi.m.V(this.myt.intent);
    ((k.a)localObject1).muf = k.b.muo.muQ;
    ((k.a)localObject1).mug = k.b.muo.name;
    ((k.a)localObject1).mue = com.tencent.mm.plugin.freewifi.m.X(this.myt.intent);
    ((k.a)localObject1).cIb = this.myt.cIb;
    ((k.a)localObject1).result = paramInt2;
    ((k.a)localObject1).ehr = paramString;
    Object localObject2 = ((k.a)localObject1).byq();
    localObject1 = this.myt.intent;
    boolean bool;
    if (paramInt2 != 0)
    {
      bool = true;
      ((k)localObject2).b((Intent)localObject1, bool).byp();
      ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo.callback, desc=net request [getApInfo] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.myt.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.myt.intent)), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label2420;
      paramString = this.myt;
      if ((paramm instanceof a))
        break label240;
      paramString.MN(paramString.activity.getString(2131300048));
      AppMethodBeat.o(20931);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label240: localObject1 = (a)paramm;
      paramString.intent.putExtra("ConstantsFreeWifi.FREE_WIFI_SHOULD_BIND_PHONE", ((a)localObject1).bzg());
      Object localObject3 = ((a)localObject1).bzh();
      if (localObject3 != null)
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo.callback(openFrontPageByApInfo/getFrontPage), desc=net request [getapinfo] gets response. frontpageinfo:  appid: %s, nickName: %s, userName: %s, headImgUrl: %s, welcomeMsg: %s, privacyDescriUrl: %s, timestamp=%s, sign=%s, HasMobile=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)), ((acq)localObject3).vEn, ((acq)localObject3).jCH, ((acq)localObject3).jBB, ((acq)localObject3).mZW, ((acq)localObject3).wkr, ((acq)localObject3).wks, ((acq)localObject3).vLo, ((acq)localObject3).vYQ, Integer.valueOf(((acq)localObject3).vAO) });
        paramString.intent.putExtra("free_wifi_appid", ((acq)localObject3).vEn);
        paramString.intent.putExtra("free_wifi_head_img_url", ((acq)localObject3).mZW);
        paramString.intent.putExtra("free_wifi_welcome_msg", ((acq)localObject3).wkr);
        paramString.intent.putExtra("free_wifi_privacy_url", ((acq)localObject3).wks);
        paramString.intent.putExtra("free_wifi_app_nickname", ((acq)localObject3).jCH);
        paramString.intent.putExtra("free_wifi_welcome_sub_title", ((acq)localObject3).wkt);
      }
      if (paramString.cIb != 2)
        paramString.activity.getIntent().putExtra("free_wifi_jump_to_main_ui", true);
      Object localObject4 = ((a)localObject1).bzf();
      if (localObject4 == null)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get qstring from server is null");
        paramString.activity.finish();
        paramm = k.byo();
        paramm.cuH = paramString.cuH;
        paramm.kBq = com.tencent.mm.plugin.freewifi.m.V(paramString.intent);
        paramm.muf = k.b.mup.muQ;
        paramm.mug = k.b.mup.name;
        paramm.mue = com.tencent.mm.plugin.freewifi.m.X(paramString.intent);
        paramm.cIb = paramString.cIb;
        paramm.result = -1;
        paramm.ehr = "qstrInfo is null.";
        paramm.byq().b(paramString.intent, true).byp();
        AppMethodBeat.o(20931);
      }
      else if (com.tencent.mm.plugin.freewifi.m.isEmpty(((bns)localObject4).luG))
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get qstrInfo.ssid from server is empty");
        paramString.activity.finish();
        paramm = k.byo();
        paramm.cuH = paramString.cuH;
        paramm.kBq = com.tencent.mm.plugin.freewifi.m.V(paramString.intent);
        paramm.muf = k.b.mup.muQ;
        paramm.mug = k.b.mup.name;
        paramm.mue = com.tencent.mm.plugin.freewifi.m.X(paramString.intent);
        paramm.cIb = paramString.cIb;
        paramm.result = -1;
        paramm.ehr = "qstrInfo.Ssid is empty.";
        paramm.byq().b(paramString.intent, true).byp();
        AppMethodBeat.o(20931);
      }
      else
      {
        paramString.intent.putExtra("free_wifi_ssid", ((bns)localObject4).luG);
        ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo.callback(openFrontPageByApInfo), desc=net request [getApInfo/getFrontPage] gets response. qstrInfo:  prototype = %d, ssid : %s, pssword : %s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)), Integer.valueOf(((bns)localObject4).wQU), ((bns)localObject4).luG, ((bns)localObject4).wfF });
        paramm = ((a)localObject1).bzi();
        localObject1 = ((a)localObject1).Ge();
        paramString.intent.putExtra("free_wifi_openid", paramm);
        paramString.intent.putExtra("free_wifi_tid", (String)localObject1);
        paramString.intent.putExtra("ConstantsFreeWifi.FREE_WIFI_TIMESTAMP", ((acq)localObject3).vLo);
        paramString.intent.putExtra("ConstantsFreeWifi.FREE_WIFI_SIGN", ((acq)localObject3).vYQ);
        ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo.callback(openFrontPageByApInfo), desc=net request [getApInfo/getFrontPage] gets response. openId=%s, tid=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)), paramm, localObject1 });
        paramString.intent.putExtra("free_wifi_protocol_type", ((bns)localObject4).wQU);
        if (((bns)localObject4).wQU == 10)
        {
          if ((bo.isNullOrNil(((bns)localObject4).luG)) || (bo.isNullOrNil(((bns)localObject4).wfF)))
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "ssid or password is null");
            paramString.activity.finish();
            AppMethodBeat.o(20931);
          }
          else
          {
            paramString.intent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 4);
            paramString.intent.putExtra("free_wifi_auth_type", 2);
            paramString.intent.putExtra("free_wifi_passowrd", ((bns)localObject4).wfF);
            paramString.intent.setClass(paramString.activity, FreeWifiFrontPageUI.class);
            paramString.activity.startActivity(paramString.intent);
            paramString.activity.finish();
            paramString.activity.overridePendingTransition(2131034265, 2131034262);
            AppMethodBeat.o(20931);
          }
        }
        else if (((bns)localObject4).wQU == 11)
        {
          if ((bo.isNullOrNil(((bns)localObject4).luG)) || (bo.isNullOrNil(((bns)localObject4).wfF)))
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "ssid or password is null");
            paramString.activity.finish();
            AppMethodBeat.o(20931);
          }
          else
          {
            paramString.intent.putExtra("free_wifi_auth_type", 2);
            paramString.intent.putExtra("free_wifi_passowrd", ((bns)localObject4).wfF);
            paramString.intent.setClass(paramString.activity, FreewifiActivateWeChatNoAuthStateUI.class);
            paramString.activity.startActivity(paramString.intent);
            paramString.activity.finish();
            paramString.activity.overridePendingTransition(2131034265, 2131034262);
            AppMethodBeat.o(20931);
          }
        }
        else if (((bns)localObject4).wQU == 12)
        {
          paramString.intent.putExtra("free_wifi_auth_type", 1);
          paramString.intent.setClass(paramString.activity, FreeWifiActivateAuthStateUI.class);
          paramString.activity.startActivity(paramString.intent);
          paramString.activity.finish();
          paramString.activity.overridePendingTransition(2131034265, 2131034262);
          AppMethodBeat.o(20931);
        }
        else if (((bns)localObject4).wQU == 31)
        {
          paramString.intent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 31);
          ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo.callback(openFrontPageByApInfo), desc=it goes into protocal 31 handle branch.", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)) });
          localObject2 = paramString.intent.getStringExtra("free_wifi_schema_ticket");
          ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo.callback(openFrontPageByApInfo), desc=it tries to get ticket. ticket=%s.", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)), localObject2 });
          if (bo.isNullOrNil((String)localObject2))
          {
            paramString.activity.finish();
            paramm = k.byo();
            paramm.cuH = paramString.cuH;
            paramm.kBq = com.tencent.mm.plugin.freewifi.m.V(paramString.intent);
            paramm.muf = k.b.mup.muQ;
            paramm.mug = k.b.mup.name;
            paramm.cIb = paramString.cIb;
            paramm.mue = com.tencent.mm.plugin.freewifi.m.X(paramString.intent);
            paramm.result = -1;
            paramm.ehr = "31 ticket is empty.";
            paramm.byq().b(paramString.intent, true).byp();
            AppMethodBeat.o(20931);
          }
          else
          {
            String str1 = ((bns)localObject4).luG;
            localObject4 = ((acq)localObject3).vLo;
            localObject3 = ((acq)localObject3).vYQ;
            if (d.byM() == null)
            {
              ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.protocol31GetPortalApInfo, desc=it tries to get current connected wifi info but return null, so it fails to connect wifi. ", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)) });
              paramString.MN(paramString.activity.getString(2131300048));
              paramm = k.byo();
              paramm.cuH = paramString.cuH;
              paramm.kBq = com.tencent.mm.plugin.freewifi.m.V(paramString.intent);
              paramm.muf = k.b.mup.muQ;
              paramm.mug = k.b.mup.name;
              paramm.cIb = paramString.cIb;
              paramm.mue = com.tencent.mm.plugin.freewifi.m.X(paramString.intent);
              paramm.result = -1;
              paramm.ehr = "wifiInfo is empty.";
              paramm.byq().b(paramString.intent, true).byp();
              AppMethodBeat.o(20931);
            }
            else
            {
              bool = d.MD(str1);
              ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.protocol31GetPortalApInfo, desc=it gets connected wifi info. is_current_connected_ssid_equals_target_ssid=%b", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)), Boolean.valueOf(bool) });
              String str2 = at.gE(ah.getContext());
              String str3 = at.gF(ah.getContext());
              str1 = com.tencent.mm.plugin.freewifi.m.Mz("MicroMsg.FreeWifi.FreeWifiNetCheckUI");
              ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.protocol31GetPortalApInfo desc=it starts net request [GetPortalApInfo]  for portal ap info. apKey=%s, apSsid=%s, apBssid=%s, mobileMac=%s, ticket=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)), paramString.cuH, str2, str3, str1, localObject2 });
              k.a locala = k.byo();
              locala.cuH = paramString.cuH;
              locala.kBq = com.tencent.mm.plugin.freewifi.m.V(paramString.intent);
              locala.muf = k.b.mup.muQ;
              locala.mug = k.b.mup.name;
              locala.cIb = paramString.cIb;
              locala.mue = com.tencent.mm.plugin.freewifi.m.X(paramString.intent);
              locala.result = 0;
              locala.ehr = "";
              locala.byq().b(paramString.intent, true).byp();
              locala = k.byo();
              locala.ssid = paramString.intent.getStringExtra("free_wifi_ssid");
              locala.cuH = paramString.cuH;
              locala.mud = paramString.intent.getStringExtra("free_wifi_appid");
              locala.kBq = com.tencent.mm.plugin.freewifi.m.V(paramString.intent);
              locala.mue = com.tencent.mm.plugin.freewifi.m.X(paramString.intent);
              locala.muf = k.b.muz.muQ;
              locala.mug = k.b.muz.name;
              locala.cIb = com.tencent.mm.plugin.freewifi.m.Y(paramString.intent);
              locala.mue = com.tencent.mm.plugin.freewifi.m.X(paramString.intent);
              locala.byq().b(paramString.intent, false).byp();
              new i(paramString.cuH, str2, str3, str1, (String)localObject2, com.tencent.mm.plugin.freewifi.m.V(paramString.intent)).O(paramString.activity).c(new b.2(paramString, paramm, (String)localObject1, (String)localObject4, (String)localObject3));
              AppMethodBeat.o(20931);
            }
          }
        }
        else if (((bns)localObject4).wQU == 32)
        {
          paramString.intent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 32);
          ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo.callback(openFrontPageByApInfo), desc=it goes into protocal 32 handle branch.", new Object[] { com.tencent.mm.plugin.freewifi.m.V(paramString.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(paramString.intent)) });
          paramString.intent.setClass(paramString.activity, FreeWifiFrontPageUI.class);
          paramString.activity.startActivity(paramString.intent);
          paramString.activity.finish();
          paramString.activity.overridePendingTransition(2131034265, 2131034262);
          AppMethodBeat.o(20931);
        }
        else if (((bns)localObject4).wQU == 1)
        {
          paramString.intent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 1);
          paramString.intent.putExtra("free_wifi_auth_type", 1);
          paramString.intent.setClass(paramString.activity, FreeWifiFrontPageUI.class);
          paramString.activity.startActivity(paramString.intent);
          paramString.activity.finish();
          paramString.activity.overridePendingTransition(2131034265, 2131034262);
          AppMethodBeat.o(20931);
        }
        else
        {
          paramString.activity.finish();
          paramString.MN(paramString.activity.getString(2131300053));
          AppMethodBeat.o(20931);
          continue;
          label2420: if ((com.tencent.mm.plugin.freewifi.m.eh(paramInt1, paramInt2)) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(paramString)))
          {
            this.myt.MN(paramString + "(" + com.tencent.mm.plugin.freewifi.m.a(com.tencent.mm.plugin.freewifi.m.X(this.myt.intent), k.b.muo, paramInt2) + ")");
            AppMethodBeat.o(20931);
          }
          else if (paramInt2 == -30031)
          {
            this.myt.MN(this.myt.activity.getString(2131300052));
            AppMethodBeat.o(20931);
          }
          else
          {
            this.myt.MN(this.myt.activity.getString(2131300048) + "(" + String.format("%02d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.freewifi.m.X(this.myt.intent)) }) + k.b.muo.muQ + Math.abs(paramInt2) + ")");
            AppMethodBeat.o(20931);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.b.1
 * JD-Core Version:    0.6.2
 */