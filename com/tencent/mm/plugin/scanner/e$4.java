package com.tencent.mm.plugin.scanner;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class e$4
  implements Runnable
{
  e$4(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138456);
    if (!g.RK())
      AppMethodBeat.o(138456);
    while (true)
    {
      return;
      if (bo.isNullOrNil(e.d(this.pYX)))
      {
        ab.e("MicroMsg.scanner.SubCoreScanner", "accPath == null in onAccountPostReset");
        AppMethodBeat.o(138456);
      }
      else
      {
        bo.o(e.d(this.pYX) + "image/scan/img", "scanbook", 604800000L);
        AppMethodBeat.o(138456);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(138457);
    String str = super.toString() + "|onAccountPostReset";
    AppMethodBeat.o(138457);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.e.4
 * JD-Core Version:    0.6.2
 */