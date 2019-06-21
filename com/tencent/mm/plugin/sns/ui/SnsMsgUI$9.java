package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsMsgUI$9
  implements Runnable
{
  SnsMsgUI$9(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39074);
    if (SnsMsgUI.e(this.rub) == null)
      AppMethodBeat.o(39074);
    while (true)
    {
      return;
      synchronized (SnsMsgUI.e(this.rub))
      {
        SnsMsgUI.e(this.rub).a(null, null);
        SnsMsgUI.u(this.rub);
        AppMethodBeat.o(39074);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.9
 * JD-Core Version:    0.6.2
 */