package com.tencent.mm.plugin.ipcall.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class IPCallContactUI$10
  implements Runnable
{
  IPCallContactUI$10(IPCallContactUI paramIPCallContactUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22084);
    if ((IPCallContactUI.d(this.nBH) != null) && (IPCallContactUI.b(this.nBH) != null) && (!IPCallContactUI.d(this.nBH).jLC))
    {
      IPCallContactUI.d(this.nBH).vM(IPCallContactUI.h(this.nBH));
      IPCallContactUI.f(this.nBH).sendEmptyMessage(2);
      IPCallContactUI.b(this.nBH).invalidateViews();
    }
    AppMethodBeat.o(22084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallContactUI.10
 * JD-Core Version:    0.6.2
 */