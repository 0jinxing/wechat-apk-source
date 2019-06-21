package com.tencent.mm.plugin.multitalk.ui.widget;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$b
  implements Runnable
{
  f.a oJi;

  public f$b(f paramf, f.a parama)
  {
    this.oJi = parama;
  }

  public final void run()
  {
    AppMethodBeat.i(54202);
    this.oJi.oJh.setVisibility(8);
    AppMethodBeat.o(54202);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.widget.f.b
 * JD-Core Version:    0.6.2
 */