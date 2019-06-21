package com.tencent.mm.plugin.appbrand.b;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a extends g
{
  d$a(d paramd, i parami, com.tencent.mm.plugin.appbrand.i parami1)
  {
    super(parami, parami1);
  }

  final void awB()
  {
    AppMethodBeat.i(86849);
    if (this.gWL.dpQ() == this)
    {
      d.a(this.gWL, this.gWL.gWE);
      this.gWL.nt(1000);
    }
    AppMethodBeat.o(86849);
  }

  public final void enter()
  {
    AppMethodBeat.i(86847);
    super.enter();
    AppMethodBeat.o(86847);
  }

  public final void exit()
  {
    AppMethodBeat.i(86848);
    super.exit();
    AppMethodBeat.o(86848);
  }

  public final String getName()
  {
    AppMethodBeat.i(86845);
    String str = this.gWL.mName + "|Background";
    AppMethodBeat.o(86845);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(86846);
    switch (paramMessage.what)
    {
    default:
      bool = super.k(paramMessage);
      AppMethodBeat.o(86846);
    case 3:
    case 12:
    }
    while (true)
    {
      return bool;
      d.a(this.gWL, this.gWL.gWB);
      AppMethodBeat.o(86846);
      continue;
      super.nu(16);
      AppMethodBeat.o(86846);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.d.a
 * JD-Core Version:    0.6.2
 */