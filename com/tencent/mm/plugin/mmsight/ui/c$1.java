package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$1
  implements ap.a
{
  c$1(c paramc)
  {
  }

  public final boolean BI()
  {
    boolean bool = true;
    AppMethodBeat.i(55176);
    c.a(this.oCi);
    if (this.oCi.cFy)
      if (this.oCi.oCf < this.oCi.end)
        AppMethodBeat.o(55176);
    while (true)
    {
      return bool;
      this.oCi.cFy = false;
      ab.i("MicroMsg.ProgressHandlerAnimator", "reach end, currentValue: %s, end: %s, callback: %s", new Object[] { Float.valueOf(this.oCi.oCf), Float.valueOf(this.oCi.end), this.oCi.oCg });
      if (this.oCi.oCg != null)
        this.oCi.oCg.onAnimationEnd();
      AppMethodBeat.o(55176);
      bool = false;
      continue;
      ab.i("MicroMsg.ProgressHandlerAnimator", "isStart is false now");
      AppMethodBeat.o(55176);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.c.1
 * JD-Core Version:    0.6.2
 */