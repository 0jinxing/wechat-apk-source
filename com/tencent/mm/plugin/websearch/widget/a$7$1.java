package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ab;

final class a$7$1
  implements Runnable
{
  a$7$1(a.7 param7)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91398);
    if (this.ucY.ucW.equals(a.m(this.ucY.ucJ)))
    {
      ab.i("FTSSearchWidgetMgr", "tap event timeout id %s", new Object[] { this.ucY.ucW });
      a.b(this.ucY.ucJ, null);
      a.c(this.ucY.ucJ).a(this.ucY.ucW, false, "timeout", this.ucY.hmM);
    }
    AppMethodBeat.o(91398);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.7.1
 * JD-Core Version:    0.6.2
 */