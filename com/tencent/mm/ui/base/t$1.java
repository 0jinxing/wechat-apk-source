package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class t$1
  implements ap.a
{
  t$1(t paramt)
  {
  }

  public final boolean BI()
  {
    boolean bool = true;
    AppMethodBeat.i(106870);
    if (t.a(this.yxW) == -1L)
    {
      this.yxW.show();
      AppMethodBeat.o(106870);
    }
    while (true)
    {
      return bool;
      t.b(this.yxW);
      if (t.c(this.yxW) >= 0)
      {
        this.yxW.show();
        AppMethodBeat.o(106870);
      }
      else
      {
        this.yxW.cancel();
        bool = false;
        AppMethodBeat.o(106870);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.t.1
 * JD-Core Version:    0.6.2
 */