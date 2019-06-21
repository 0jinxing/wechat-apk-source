package com.tencent.mm.plugin.appbrand.b;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$b extends h
{
  d$b(d paramd, i parami)
  {
    super(parami);
  }

  public final String getName()
  {
    AppMethodBeat.i(86850);
    String str = this.gWL.mName + "|BackgroundKeepNoChange";
    AppMethodBeat.o(86850);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    AppMethodBeat.i(86851);
    boolean bool;
    switch (paramMessage.what)
    {
    default:
      bool = super.k(paramMessage);
      AppMethodBeat.o(86851);
    case 3:
    }
    while (true)
    {
      return bool;
      d.a(this.gWL, this.gWL.gWB);
      bool = true;
      AppMethodBeat.o(86851);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.d.b
 * JD-Core Version:    0.6.2
 */