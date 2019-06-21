package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class w$8
  implements Runnable
{
  w$8(w paramw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29666);
    this.yoa.ynU = true;
    al.af(this.yoa.ynV);
    al.n(this.yoa.ynV, 300L);
    AppMethodBeat.o(29666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.w.8
 * JD-Core Version:    0.6.2
 */