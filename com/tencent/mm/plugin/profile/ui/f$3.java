package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.p;
import java.util.TimerTask;

final class f$3 extends TimerTask
{
  f$3(p paramp, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23511);
    if (this.oop != null)
    {
      this.oop.dismiss();
      this.mrz.sendEmptyMessage(0);
    }
    AppMethodBeat.o(23511);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.f.3
 * JD-Core Version:    0.6.2
 */