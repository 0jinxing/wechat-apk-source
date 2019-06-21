package com.tencent.mm.plugin.masssend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.p;
import java.util.TimerTask;

final class a$4 extends TimerTask
{
  a$4(p paramp, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22757);
    if (this.oop != null)
    {
      this.oop.dismiss();
      this.mrz.sendEmptyMessage(0);
    }
    AppMethodBeat.o(22757);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.a.4
 * JD-Core Version:    0.6.2
 */