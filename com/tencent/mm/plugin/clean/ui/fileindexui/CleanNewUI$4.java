package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CleanNewUI$4
  implements View.OnClickListener
{
  CleanNewUI$4(CleanNewUI paramCleanNewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18815);
    ab.i("MicroMsg.CleanNewUI", "qq mgr btn click");
    com.tencent.mm.plugin.report.service.h.pYm.a(714L, 3L, 1L, false);
    if (!CleanNewUI.b(this.kyC))
      if (CleanNewUI.c(this.kyC))
      {
        com.tencent.mm.ui.base.h.d(this.kyC, this.kyC.getString(2131298300, new Object[] { bo.my(CleanNewUI.d(this.kyC)) }), "", this.kyC.getString(2131296887), this.kyC.getString(2131296868), new CleanNewUI.4.1(this), null);
        AppMethodBeat.o(18815);
      }
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?t=w_safe&qqpimenter=shoushen");
      paramView.putExtra("show_bottom", false);
      paramView.putExtra("showShare", false);
      d.b(this.kyC.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
      com.tencent.mm.plugin.report.service.h.pYm.a(714L, 5L, 1L, false);
      AppMethodBeat.o(18815);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.4
 * JD-Core Version:    0.6.2
 */