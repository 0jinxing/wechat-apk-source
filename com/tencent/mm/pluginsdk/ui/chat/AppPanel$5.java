package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.sdk.platformtools.ab;

final class AppPanel$5
  implements Runnable
{
  AppPanel$5(AppPanel paramAppPanel)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27751);
    f.afy();
    ab.i("MicroMsg.AppPanel", "preMakeConnection ret:%d", new Object[] { Integer.valueOf(0) });
    AppPanel.djV();
    AppMethodBeat.o(27751);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppPanel.5
 * JD-Core Version:    0.6.2
 */