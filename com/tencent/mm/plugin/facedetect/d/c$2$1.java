package com.tencent.mm.plugin.facedetect.d;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2$1
  implements Runnable
{
  c$2$1(c.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(298);
    if (this.lVq.lVp.bta() != null)
      this.lVq.lVp.bta().startAnimation(c.d(this.lVq.lVp));
    AppMethodBeat.o(298);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.c.2.1
 * JD-Core Version:    0.6.2
 */