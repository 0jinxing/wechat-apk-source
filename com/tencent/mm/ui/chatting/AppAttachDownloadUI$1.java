package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;

final class AppAttachDownloadUI$1
  implements MenuItem.OnMenuItemClickListener
{
  AppAttachDownloadUI$1(AppAttachDownloadUI paramAppAttachDownloadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30264);
    if (AppAttachDownloadUI.a(this.yGh) != null)
      aw.Rg().c(AppAttachDownloadUI.a(this.yGh));
    this.yGh.finish();
    AppMethodBeat.o(30264);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI.1
 * JD-Core Version:    0.6.2
 */