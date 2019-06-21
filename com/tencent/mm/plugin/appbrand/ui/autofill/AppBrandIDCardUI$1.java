package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.jsapi.l.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bwt;
import com.tencent.mm.protocal.protobuf.bwu;
import com.tencent.mm.protocal.protobuf.bzn;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.cnd;
import com.tencent.mm.protocal.protobuf.cne;
import com.tencent.mm.protocal.protobuf.cno;
import com.tencent.mm.protocal.protobuf.gc;
import com.tencent.mm.protocal.protobuf.gd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

final class AppBrandIDCardUI$1
  implements AppBrandIDCardUI.a
{
  AppBrandIDCardUI$1(AppBrandIDCardUI paramAppBrandIDCardUI)
  {
  }

  private void DZ(String paramString)
  {
    AppMethodBeat.i(133228);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrandIDCardUI", "url is null");
      AppMethodBeat.o(133228);
    }
    while (true)
    {
      return;
      ab.v("MicroMsg.AppBrandIDCardUI", "goToWebview url: ".concat(String.valueOf(paramString)));
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramString);
      localIntent.putExtra("forceHideShare", true);
      d.b(this.iKj, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(133228);
    }
  }

  public final void DW(String paramString)
  {
    AppMethodBeat.i(133225);
    ab.i("MicroMsg.AppBrandIDCardUI", "protocalUrl click");
    DZ(paramString);
    AppMethodBeat.o(133225);
  }

  public final void DX(String paramString)
  {
    AppMethodBeat.i(133226);
    ab.i("MicroMsg.AppBrandIDCardUI", "urlJump click");
    DZ(paramString);
    AppMethodBeat.o(133226);
  }

  public final void DY(String paramString)
  {
    AppMethodBeat.i(133227);
    ab.i("MicroMsg.AppBrandIDCardUI", "url2Jump click");
    DZ(paramString);
    AppMethodBeat.o(133227);
  }

  public final void a(gc paramgc)
  {
    AppMethodBeat.i(133231);
    h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(this.iKj), Integer.valueOf(7), AppBrandIDCardUI.g(this.iKj).cxb });
    ab.i("MicroMsg.AppBrandIDCardUI", "sendSms");
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bwt();
    ((b.a)localObject).fsK = new bwu();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/userdata/sendsms";
    ((b.a)localObject).fsI = 1762;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    com.tencent.mm.ai.b localb = ((b.a)localObject).acD();
    localObject = (bwt)localb.fsG.fsP;
    ((bwt)localObject).csB = AppBrandIDCardUI.a(this.iKj);
    ((bwt)localObject).wXf = AppBrandIDCardUI.b(this.iKj);
    ((bwt)localObject).wXg = AppBrandIDCardUI.i(this.iKj);
    ((bwt)localObject).vId = paramgc.vId;
    ((bwt)localObject).pbn = paramgc.pbn;
    ((bwt)localObject).cxb = AppBrandIDCardUI.g(this.iKj).cxb;
    com.tencent.mm.ipcinvoker.wx_extension.b.a(localb, new AppBrandIDCardUI.1.5(this));
    AppMethodBeat.o(133231);
  }

  public final void a(String paramString, gc paramgc)
  {
    AppMethodBeat.i(133232);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrandIDCardUI", "verifyCode is null, err, return");
      AppMethodBeat.o(133232);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandIDCardUI", "verifySms");
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new cnd();
      ((b.a)localObject).fsK = new cne();
      ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/userdata/verifysmscode";
      ((b.a)localObject).fsI = 1721;
      ((b.a)localObject).fsL = 0;
      ((b.a)localObject).fsM = 0;
      com.tencent.mm.ai.b localb = ((b.a)localObject).acD();
      localObject = (cnd)localb.fsG.fsP;
      ((cnd)localObject).csB = AppBrandIDCardUI.a(this.iKj);
      ((cnd)localObject).wXf = AppBrandIDCardUI.b(this.iKj);
      ((cnd)localObject).wXg = AppBrandIDCardUI.i(this.iKj);
      ((cnd)localObject).vId = paramgc.vId;
      ((cnd)localObject).cxb = AppBrandIDCardUI.g(this.iKj).cxb;
      ((cnd)localObject).tCi = paramString;
      ((cnd)localObject).wXi = AppBrandIDCardUI.j(this.iKj);
      ((cnd)localObject).pbn = paramgc.pbn;
      com.tencent.mm.ipcinvoker.wx_extension.b.a(localb, new AppBrandIDCardUI.1.6(this));
      AppMethodBeat.o(133232);
    }
  }

  public final void aME()
  {
    AppMethodBeat.i(133222);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bzn();
    ((b.a)localObject).fsK = new bzo();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/userdata/showauthorizeuserid";
    ((b.a)localObject).fsI = 1774;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    localObject = ((b.a)localObject).acD();
    bzn localbzn = (bzn)((com.tencent.mm.ai.b)localObject).fsG.fsP;
    localbzn.csB = AppBrandIDCardUI.a(this.iKj);
    localbzn.wXf = AppBrandIDCardUI.b(this.iKj);
    localbzn.wYz = AppBrandIDCardUI.c(this.iKj);
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ai.b)localObject, new AppBrandIDCardUI.1.1(this));
    AppMethodBeat.o(133222);
  }

  public final void aMF()
  {
    AppMethodBeat.i(133229);
    ab.i("MicroMsg.AppBrandIDCardUI", "verifyPassword");
    h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(this.iKj), Integer.valueOf(2), AppBrandIDCardUI.g(this.iKj).cxb });
    if (AppBrandIDCardUI.g(this.iKj).wYI == null)
    {
      ab.e("MicroMsg.AppBrandIDCardUI", "showAuthorizeUserIDResp.verify_pay_req is null");
      AppMethodBeat.o(133229);
    }
    while (true)
    {
      return;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("appId", AppBrandIDCardUI.g(this.iKj).wYI.csB);
        localJSONObject.put("timeStamp", AppBrandIDCardUI.g(this.iKj).wYI.cvO);
        localJSONObject.put("nonceStr", AppBrandIDCardUI.g(this.iKj).wYI.wzf);
        localJSONObject.put("package", AppBrandIDCardUI.g(this.iKj).wYI.xkV);
        localJSONObject.put("signType", AppBrandIDCardUI.g(this.iKj).wYI.kmr);
        localJSONObject.put("paySign", AppBrandIDCardUI.g(this.iKj).wYI.wys);
        h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(this.iKj), Integer.valueOf(3), AppBrandIDCardUI.g(this.iKj).cxb });
        a.hTJ.a(this.iKj, localJSONObject, new AppBrandIDCardUI.1.4(this));
        AppMethodBeat.o(133229);
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandIDCardUI", localJSONException, "", new Object[0]);
        AppMethodBeat.o(133229);
      }
    }
  }

  public final void aMG()
  {
    AppMethodBeat.i(133230);
    h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(this.iKj), Integer.valueOf(6), AppBrandIDCardUI.g(this.iKj).cxb });
    AppMethodBeat.o(133230);
  }

  public final bzo aMH()
  {
    AppMethodBeat.i(133233);
    bzo localbzo = AppBrandIDCardUI.g(this.iKj);
    AppMethodBeat.o(133233);
    return localbzo;
  }

  public final gd aMI()
  {
    AppMethodBeat.i(133234);
    gd localgd = AppBrandIDCardUI.k(this.iKj);
    AppMethodBeat.o(133234);
    return localgd;
  }

  public final void back()
  {
    AppMethodBeat.i(133224);
    AppBrandIDCardUI.f(this.iKj);
    AppMethodBeat.o(133224);
  }

  public final void onSwipeBack()
  {
    AppMethodBeat.i(133223);
    this.iKj.onSwipeBack();
    AppMethodBeat.o(133223);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.1
 * JD-Core Version:    0.6.2
 */