package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsMsgUI$8$1
  implements Runnable
{
  SnsMsgUI$8$1(SnsMsgUI.8 param8)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39072);
    synchronized (SnsMsgUI.e(this.rud.rub))
    {
      ab.v("MicroMsg.SnsMsgUI", "comment notify");
      SnsMsgUI.o(this.rud.rub);
      SnsMsgUI.e(this.rud.rub).a(null, null);
      AppMethodBeat.o(39072);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.8.1
 * JD-Core Version:    0.6.2
 */