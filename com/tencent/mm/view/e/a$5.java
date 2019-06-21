package com.tencent.mm.view.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.view.SmileyPanelViewPager;

public final class a$5
  implements Runnable
{
  public a$5(a parama, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63027);
    if ((a.c(this.AdQ) == null) || (a.d(this.AdQ) == null) || (a.d(this.AdQ).atl(this.kUJ) == null))
      AppMethodBeat.o(63027);
    while (true)
    {
      return;
      a.a(this.AdQ, a.d(this.AdQ).atl(this.kUJ).jis);
      a.c(this.AdQ).setCurrentItem(a.e(this.AdQ));
      a.d(this.AdQ).Aer = 0;
      AppMethodBeat.o(63027);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.e.a.5
 * JD-Core Version:    0.6.2
 */