package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.record.b.e;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.ab;

final class AppAttachDownloadUI$8
  implements View.OnClickListener
{
  AppAttachDownloadUI$8(AppAttachDownloadUI paramAppAttachDownloadUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30271);
    AppAttachDownloadUI.a(this.yGh, 8);
    AppAttachDownloadUI.l(this.yGh).setVisibility(0);
    AppAttachDownloadUI.m(this.yGh).setVisibility(8);
    ab.i("MicroMsg.AppAttachDownloadUI", "summerapp roundProgressBar downloadAppAttachScene[%s]", new Object[] { AppAttachDownloadUI.a(this.yGh) });
    if (AppAttachDownloadUI.a(this.yGh) != null)
    {
      AppAttachDownloadUI.a(this.yGh).a(this.yGh);
      g.Rg().c(AppAttachDownloadUI.a(this.yGh));
      AppMethodBeat.o(30271);
    }
    while (true)
    {
      return;
      paramView = AppAttachDownloadUI.n(this.yGh);
      if ((paramView != null) && (paramView.field_status != 199L))
      {
        ab.i("MicroMsg.AppAttachDownloadUI", "summerapp roundProgressBar onClick but scene is null and set status[%d] paused", new Object[] { Long.valueOf(paramView.field_status) });
        paramView.field_status = 102L;
        am.aUq().a(paramView, new String[0]);
      }
      AppMethodBeat.o(30271);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI.8
 * JD-Core Version:    0.6.2
 */