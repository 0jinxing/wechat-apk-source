package com.tencent.mm.ui.voicesearch;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$4
  implements Runnable
{
  b$4(b paramb, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35330);
    this.cfC.run();
    this.zLA.notifyDataSetChanged();
    AppMethodBeat.o(35330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.b.4
 * JD-Core Version:    0.6.2
 */