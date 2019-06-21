package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Set;

final class n$2
  implements Runnable
{
  n$2(n paramn)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(126664);
    ab.i("MicroMsg.AppBrandUIdRootFrameLayout", "callOnPanelChanged, size %d", new Object[] { Integer.valueOf(n.d(this.jeP).size()) });
    if (n.d(this.jeP).size() <= 0)
      AppMethodBeat.o(126664);
    while (true)
    {
      return;
      n.a[] arrayOfa = new n.a[n.d(this.jeP).size()];
      n.d(this.jeP).toArray(arrayOfa);
      int j = arrayOfa.length;
      while (i < j)
      {
        arrayOfa[i].aEM();
        i++;
      }
      AppMethodBeat.o(126664);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.n.2
 * JD-Core Version:    0.6.2
 */