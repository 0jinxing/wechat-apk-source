package com.tencent.mm.ui.base.sortview;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107303);
    this.yDt.notifyDataSetChanged();
    AppMethodBeat.o(107303);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.b.1
 * JD-Core Version:    0.6.2
 */