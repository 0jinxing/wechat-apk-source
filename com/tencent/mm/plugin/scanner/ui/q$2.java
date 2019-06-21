package com.tencent.mm.plugin.scanner.ui;

import android.os.Message;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class q$2 extends ak
{
  q$2(q paramq)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(81240);
    if (q.h(this.qfG) != null)
    {
      this.qfG.qet.kj(true);
      q.h(this.qfG).setText(2131302779);
      q.h(this.qfG).setVisibility(0);
    }
    AppMethodBeat.o(81240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.q.2
 * JD-Core Version:    0.6.2
 */