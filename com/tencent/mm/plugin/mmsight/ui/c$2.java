package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class c$2
  implements Runnable
{
  c$2(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55177);
    c.a(this.oCi);
    if (this.oCi.cFy)
      if (this.oCi.oCf < this.oCi.end)
      {
        this.oCi.fJs.post(this);
        AppMethodBeat.o(55177);
      }
    while (true)
    {
      return;
      this.oCi.cFy = false;
      ab.i("MicroMsg.ProgressHandlerAnimator", "reach end, currentValue: %s, end: %s", new Object[] { Float.valueOf(this.oCi.oCf), Float.valueOf(this.oCi.end) });
      if (this.oCi.oCg != null)
      {
        this.oCi.oCg.onAnimationEnd();
        AppMethodBeat.o(55177);
        continue;
        ab.i("MicroMsg.ProgressHandlerAnimator", "isStart is false now");
      }
      else
      {
        AppMethodBeat.o(55177);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.c.2
 * JD-Core Version:    0.6.2
 */