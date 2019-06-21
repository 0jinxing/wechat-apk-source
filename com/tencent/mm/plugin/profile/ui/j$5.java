package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.p;
import java.util.TimerTask;

final class j$5 extends TimerTask
{
  j$5(p paramp, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23552);
    if (this.oop != null)
    {
      this.oop.dismiss();
      this.mrz.sendEmptyMessage(0);
    }
    AppMethodBeat.o(23552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.j.5
 * JD-Core Version:    0.6.2
 */