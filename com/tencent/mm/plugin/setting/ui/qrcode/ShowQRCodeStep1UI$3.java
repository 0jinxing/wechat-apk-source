package com.tencent.mm.plugin.setting.ui.qrcode;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.ui.FacebookAuthUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class ShowQRCodeStep1UI$3
  implements View.OnClickListener
{
  ShowQRCodeStep1UI$3(ShowQRCodeStep1UI paramShowQRCodeStep1UI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(126933);
    if (ShowQRCodeStep1UI.a(this.qkF) == 3)
    {
      Object localObject = com.tencent.mm.kernel.g.RO().jQ(1);
      paramView = r.Yz();
      int i = bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(66561, null));
      ab.d("MicroMsg.ShowQRCodeStep1UI", "sessionKey[%s], userName[%s], style[%d]", new Object[] { bo.anv(bo.cd((byte[])localObject)), paramView, Integer.valueOf(i) });
      localObject = "http://weixin.qq.com/cgi-bin/rweibourl?sid=" + com.tencent.mm.a.g.x((byte[])localObject) + "&u=" + paramView + "&qr=" + i + "&device=" + com.tencent.mm.protocal.d.eSg + "&version=" + com.tencent.mm.protocal.d.vxo;
      ab.d("MicroMsg.ShowQRCodeStep1UI", "[%s]", new Object[] { localObject });
      paramView = new Intent();
      paramView.putExtra("rawUrl", (String)localObject);
      paramView.putExtra("title", this.qkF.getString(2131302931));
      com.tencent.mm.bp.d.b(this.qkF, "webview", ".ui.tools.WebViewUI", paramView);
      this.qkF.finish();
      AppMethodBeat.o(126933);
    }
    while (true)
    {
      return;
      if (ShowQRCodeStep1UI.a(this.qkF) == 4)
      {
        if (r.Za())
        {
          paramView = new Intent(this.qkF, ShareToQQUI.class);
          paramView.putExtra("show_to", 4);
          this.qkF.startActivity(paramView);
        }
        while (true)
        {
          this.qkF.finish();
          AppMethodBeat.o(126933);
          break;
          ShowQRCodeStep1UI.a(this.qkF, FacebookAuthUI.class);
        }
      }
      if (ShowQRCodeStep1UI.a(this.qkF) == 2)
      {
        paramView = new Intent(this.qkF, ShareToQQUI.class);
        paramView.putExtra("show_to", 2);
        this.qkF.startActivity(paramView);
        this.qkF.finish();
        AppMethodBeat.o(126933);
      }
      else
      {
        paramView = new Intent(this.qkF, ShareToQQUI.class);
        paramView.putExtra("show_to", 1);
        this.qkF.startActivity(paramView);
        this.qkF.finish();
        AppMethodBeat.o(126933);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI.3
 * JD-Core Version:    0.6.2
 */