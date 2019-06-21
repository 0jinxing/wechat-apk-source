package com.tencent.mm.ui.chatting;

import android.media.ToneGenerator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class p$7
  implements Runnable
{
  p$7(p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30629);
    if (p.j(this.yJn) != null)
    {
      p.j(this.yJn).stopTone();
      ab.i("MicroMsg.ChattingFooterEventImpl", "stopTone");
    }
    AppMethodBeat.o(30629);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p.7
 * JD-Core Version:    0.6.2
 */