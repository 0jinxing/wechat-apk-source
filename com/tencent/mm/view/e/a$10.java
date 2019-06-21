package com.tencent.mm.view.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.view.SmileyPanelViewPager;
import com.tencent.mm.view.a.i;

final class a$10
  implements k.a
{
  a$10(a parama)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(63034);
    paramString = paramm.obj;
    int i;
    if ((paramString instanceof Integer))
    {
      i = ((Integer)paramString).intValue();
      if ((a.d(this.AdQ).dNx()) || (i < 3))
        break label79;
      a.d(this.AdQ).dNy();
      a.h(this.AdQ);
      this.AdQ.dNg();
      AppMethodBeat.o(63034);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label79: if ((a.i(this.AdQ) != null) && (a.c(this.AdQ) != null))
        a.i(this.AdQ).aJ(a.c(this.AdQ).getCurrentItem(), false);
      AppMethodBeat.o(63034);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.e.a.10
 * JD-Core Version:    0.6.2
 */