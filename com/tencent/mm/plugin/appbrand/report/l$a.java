package com.tencent.mm.plugin.appbrand.report;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.bo;

final class l$a extends h
{
  private long iAC;

  private l$a(l paraml)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(114397);
    super.enter();
    this.iAC = bo.anU();
    AppMethodBeat.o(114397);
  }

  public final void exit()
  {
    AppMethodBeat.i(114398);
    super.exit();
    this.iAD.iAw = (bo.anU() - this.iAC);
    AppMethodBeat.o(114398);
  }

  public final String getName()
  {
    AppMethodBeat.i(114395);
    String str = this.iAD.mName + "|Background";
    AppMethodBeat.o(114395);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    AppMethodBeat.i(114396);
    boolean bool;
    if (2 == paramMessage.what)
    {
      this.iAD.b(this.iAD.iAz);
      bool = true;
      AppMethodBeat.o(114396);
    }
    while (true)
    {
      return bool;
      bool = super.k(paramMessage);
      AppMethodBeat.o(114396);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.l.a
 * JD-Core Version:    0.6.2
 */