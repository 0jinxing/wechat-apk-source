package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$1
  implements Runnable
{
  n$1(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29506);
    if (this.ykF.ykE != null)
      this.ykF.ykE.run();
    AppMethodBeat.o(29506);
  }

  public final String toString()
  {
    AppMethodBeat.i(29507);
    String str = super.toString() + "|onInitDelay";
    AppMethodBeat.o(29507);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.n.1
 * JD-Core Version:    0.6.2
 */