package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkView.OverScrolledListener;

final class j$5
  implements XWalkView.OverScrolledListener
{
  j$5(j paramj)
  {
  }

  public final void onOverScrolled(boolean paramBoolean)
  {
    AppMethodBeat.i(85292);
    if (paramBoolean)
    {
      j.a(this.ASs, true);
      AppMethodBeat.o(85292);
    }
    while (true)
    {
      return;
      j.a(this.ASs, false);
      AppMethodBeat.o(85292);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.j.5
 * JD-Core Version:    0.6.2
 */