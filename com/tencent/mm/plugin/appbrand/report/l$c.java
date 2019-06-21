package com.tencent.mm.plugin.appbrand.report;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.d;

final class l$c extends h
{
  private l$c(l paraml)
  {
  }

  public final String getName()
  {
    AppMethodBeat.i(114403);
    String str = this.iAD.mName + "|Init";
    AppMethodBeat.o(114403);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(114404);
    if (2 == paramMessage.what)
    {
      this.iAD.b(this.iAD.iAz);
      AppMethodBeat.o(114404);
    }
    while (true)
    {
      return bool;
      if (1 == paramMessage.what)
      {
        this.iAD.b(this.iAD.iAA);
        AppMethodBeat.o(114404);
      }
      else
      {
        bool = super.k(paramMessage);
        AppMethodBeat.o(114404);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.l.c
 * JD-Core Version:    0.6.2
 */