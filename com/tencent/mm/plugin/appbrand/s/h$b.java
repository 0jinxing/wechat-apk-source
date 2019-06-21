package com.tencent.mm.plugin.appbrand.s;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$b extends com.tencent.mm.plugin.appbrand.report.h
{
  private h$b(h paramh)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(73198);
    super.enter();
    h.a(this.iRt);
    AppMethodBeat.o(73198);
  }

  public final String getName()
  {
    AppMethodBeat.i(73200);
    String str = this.iRt.iRr + "|StateIdle";
    AppMethodBeat.o(73200);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(73199);
    if ((1 == paramMessage.what) || (2 == paramMessage.what))
    {
      h.a(this.iRt);
      AppMethodBeat.o(73199);
    }
    while (true)
    {
      return bool;
      bool = super.k(paramMessage);
      AppMethodBeat.o(73199);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.h.b
 * JD-Core Version:    0.6.2
 */