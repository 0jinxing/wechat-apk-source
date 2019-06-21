package com.tencent.mm.plugin.appbrand.report;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.bo;

final class l$b extends h
{
  private long iAE;

  private l$b(l paraml)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(114401);
    super.enter();
    this.iAE = bo.anU();
    AppMethodBeat.o(114401);
  }

  public final void exit()
  {
    AppMethodBeat.i(114402);
    super.exit();
    this.iAD.iAx = (bo.anU() - this.iAE);
    AppMethodBeat.o(114402);
  }

  public final String getName()
  {
    AppMethodBeat.i(114399);
    String str = this.iAD.mName + "|Foreground";
    AppMethodBeat.o(114399);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(114400);
    if (1 == paramMessage.what)
    {
      this.iAD.b(this.iAD.iAA);
      AppMethodBeat.o(114400);
    }
    while (true)
    {
      return bool;
      bool = super.k(paramMessage);
      AppMethodBeat.o(114400);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.l.b
 * JD-Core Version:    0.6.2
 */