package com.tencent.mm.sandbox.updater;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

final class AppUpdaterUI$7
  implements Runnable
{
  AppUpdaterUI$7(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(28822);
    h.a(this.xvL, AppUpdaterUI.e(this.xvL).desc, this.xvL.getString(2131297061), new AppUpdaterUI.7.1(this)).setOnCancelListener(new AppUpdaterUI.7.2(this));
    AppMethodBeat.o(28822);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.7
 * JD-Core Version:    0.6.2
 */