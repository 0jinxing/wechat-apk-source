package com.tencent.mm.plugin.emojicapture.e;

import a.l;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.b;
import com.tencent.mm.ui.base.t;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$c
  implements Runnable
{
  c$c(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2767);
    c.h(this.lkA).bnP();
    t.makeText(c.f(this.lkA), 2131299055, 0).show();
    this.lkA.resume();
    AppMethodBeat.o(2767);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.e.c.c
 * JD-Core Version:    0.6.2
 */