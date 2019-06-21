package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.csh;

final class MallIndexOSUI$4
  implements View.OnClickListener
{
  MallIndexOSUI$4(MallIndexOSUI paramMallIndexOSUI, csh paramcsh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43184);
    h.pYm.e(13867, new Object[] { aa.a(this.onc.xpF), Integer.valueOf(this.omZ.okT) });
    paramView = new Intent();
    paramView.putExtra("rawUrl", aa.a(this.onc.xpF));
    paramView.putExtra("geta8key_username", r.Yz());
    paramView.putExtra("pay_channel", 1);
    d.b(this.omZ, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(43184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexOSUI.4
 * JD-Core Version:    0.6.2
 */