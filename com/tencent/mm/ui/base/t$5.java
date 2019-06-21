package com.tencent.mm.ui.base;

import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class t$5
  implements Runnable
{
  t$5(o paramo, Window paramWindow, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106875);
    al.d(new t.5.1(this));
    AppMethodBeat.o(106875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.t.5
 * JD-Core Version:    0.6.2
 */