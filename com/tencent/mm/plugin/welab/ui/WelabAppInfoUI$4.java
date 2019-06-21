package com.tencent.mm.plugin.welab.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class WelabAppInfoUI$4
  implements View.OnClickListener
{
  WelabAppInfoUI$4(WelabAppInfoUI paramWelabAppInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(80602);
    try
    {
      g.RN();
      int i = com.tencent.mm.kernel.a.QF();
      paramView = URLEncoder.encode(com.tencent.mm.protocal.d.DEVICE_NAME, "utf-8");
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = URLEncoder.encode(bo.dpA(), "utf-8");
      String str1 = URLEncoder.encode(q.LK(), "utf-8");
      String str2 = URLEncoder.encode(com.tencent.mm.protocal.d.vxi, "utf-8");
      String str3 = URLEncoder.encode(com.tencent.mm.protocal.d.vxj, "utf-8");
      String str4 = URLEncoder.encode(com.tencent.mm.protocal.d.vxk, "utf-8");
      g.RN();
      String str5 = URLEncoder.encode(com.tencent.mm.kernel.a.Rb(), "utf-8");
      localObject1 = URLEncoder.encode(bo.gS(ah.getContext()), "utf-8");
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("&uin=");
      paramView = localStringBuilder.append(i).append("&deviceName=").append(paramView).append("&timeZone=").append((String)localObject2).append("&imei=").append(str1).append("&deviceBrand=").append(str2).append("&deviceModel=").append(str3).append("&ostype=").append(str4).append("&clientSeqID=").append(str5).append("&signature=").append((String)localObject1).append("&scene=");
      if (bo.isNullOrNil(""));
      for (i = 0; ; i = 1)
      {
        paramView = i;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = ((StringBuilder)localObject1).append("https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index").append("&from=");
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = URLEncoder.encode(((StringBuilder)localObject1).append(WelabAppInfoUI.a(this.uMr).field_expId).append("|").append(WelabAppInfoUI.b(this.uMr)).toString()) + "&version=" + com.tencent.mm.protocal.d.vxo + "&lang=" + aa.gw(ah.getContext()) + "&" + bo.nullAsNil("") + paramView;
        paramView = new java/lang/StringBuilder;
        paramView.<init>();
        localObject1 = (String)localObject1 + "#/comment/4134";
        paramView = new android/content/Intent;
        paramView.<init>();
        paramView.putExtra("showShare", false);
        paramView.putExtra("rawUrl", (String)localObject1);
        paramView.putExtra("title", "意见反馈");
        paramView.putExtra("neverGetA8Key", true);
        paramView.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
        paramView.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
        com.tencent.mm.bp.d.b(this.uMr, "webview", ".ui.tools.WebViewUI", paramView);
        AppMethodBeat.o(80602);
        return;
      }
    }
    catch (UnsupportedEncodingException paramView)
    {
      while (true)
      {
        ab.e("WelabAppInfoUI", "[oneliang]UnsupportedEncodingException:%s", new Object[] { paramView.getMessage() });
        AppMethodBeat.o(80602);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.WelabAppInfoUI.4
 * JD-Core Version:    0.6.2
 */