package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.i.c;
import com.tencent.mm.plugin.appbrand.widget.i.d;
import com.tencent.mm.sdk.platformtools.ab;

final class w$9 extends c
{
  w$9(w paramw)
  {
  }

  public final void a(String paramString, d paramd)
  {
    AppMethodBeat.i(132391);
    super.a(paramString, paramd);
    ab.e("IconLoadErrorHandler ", "load icon fail: ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(132391);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.9
 * JD-Core Version:    0.6.2
 */