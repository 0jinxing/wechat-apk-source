package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class AppPanel$3
  implements Runnable
{
  AppPanel$3(AppPanel paramAppPanel)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27743);
    ab.e("MicroMsg.AppPanel", "initAppGrid ANR!");
    h.pYm.k(999L, 2L, 1L);
    AppMethodBeat.o(27743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppPanel.3
 * JD-Core Version:    0.6.2
 */