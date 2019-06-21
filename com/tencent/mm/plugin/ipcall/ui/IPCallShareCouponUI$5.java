package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class IPCallShareCouponUI$5 extends ClickableSpan
{
  IPCallShareCouponUI$5(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22321);
    ((TextView)paramView).setHighlightColor(this.nFI.getResources().getColor(2131690597));
    paramView = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=weixin_phone/notice";
    Object localObject = aa.gw(ah.getContext());
    if (!bo.isNullOrNil((String)localObject))
      paramView = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=weixin_phone/notice" + "&wechat_real_lang=" + (String)localObject;
    localObject = new Intent();
    ((Intent)localObject).putExtra("rawUrl", paramView);
    ((Intent)localObject).putExtra("showShare", false);
    d.b(this.nFI, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
    AppMethodBeat.o(22321);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(22322);
    paramTextPaint.setColor(this.nFI.getResources().getColor(2131690208));
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(22322);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.5
 * JD-Core Version:    0.6.2
 */