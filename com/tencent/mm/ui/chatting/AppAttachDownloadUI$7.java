package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.g;
import com.tencent.mm.ai.m;
import com.tencent.mm.ui.widget.progress.RoundProgressBtn;

final class AppAttachDownloadUI$7
  implements g
{
  AppAttachDownloadUI$7(AppAttachDownloadUI paramAppAttachDownloadUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(30270);
    if (paramInt2 == 0);
    for (float f = 0.0F; ; f = paramInt1 * 100.0F / paramInt2)
    {
      if ((paramInt1 < paramInt2) && (AppAttachDownloadUI.k(this.yGh).getVisibility() != 0))
      {
        AppAttachDownloadUI.a(this.yGh, 0);
        AppAttachDownloadUI.l(this.yGh).setVisibility(8);
      }
      AppAttachDownloadUI.k(this.yGh).setProgress((int)f);
      AppMethodBeat.o(30270);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI.7
 * JD-Core Version:    0.6.2
 */