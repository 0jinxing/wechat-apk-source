package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.record.b.e;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.bo;

final class AppAttachDownloadUI$9
  implements View.OnClickListener
{
  AppAttachDownloadUI$9(AppAttachDownloadUI paramAppAttachDownloadUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30272);
    AppAttachDownloadUI.a(this.yGh, 0);
    AppAttachDownloadUI.l(this.yGh).setVisibility(8);
    if (AppAttachDownloadUI.o(this.yGh))
    {
      paramView = AppAttachDownloadUI.n(this.yGh);
      if (paramView != null)
      {
        paramView.field_status = 101L;
        paramView.field_lastModifyTime = bo.anT();
        am.aUq().a(paramView, new String[0]);
      }
      AppAttachDownloadUI.a(this.yGh, new e(AppAttachDownloadUI.p(this.yGh), AppAttachDownloadUI.q(this.yGh), AppAttachDownloadUI.r(this.yGh)));
      aw.Rg().a(AppAttachDownloadUI.a(this.yGh), 0);
    }
    AppMethodBeat.o(30272);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI.9
 * JD-Core Version:    0.6.2
 */