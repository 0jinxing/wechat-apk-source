package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.chatting.d.a;

final class d$6
  implements ap.a
{
  d$6(d paramd, boolean paramBoolean)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(30410);
    if (!this.yHe)
    {
      ab.i("MicroMsg.AutoPlay", "speaker off");
      this.yHc.mfP = false;
      d locald = this.yHc;
      if (locald.mfO.isPlaying())
      {
        ab.d("MicroMsg.AutoPlay", "deal sensor event, play next");
        locald.mfO.bm(false);
        locald.qn(false);
      }
    }
    while (true)
    {
      AppMethodBeat.o(30410);
      return false;
      ab.i("MicroMsg.AutoPlay", "speaker true");
      this.yHc.dBC();
      if (this.yHc.context != null)
        this.yHc.yGR = t.a(this.yHc.cgL.yTx.getActivity(), this.yHc.context.getString(2131299993), 2000L);
      this.yHc.mfP = true;
      this.yHc.dBA();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.d.6
 * JD-Core Version:    0.6.2
 */