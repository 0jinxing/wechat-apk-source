package com.tencent.mm.plugin.appbrand.page.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends p
{
  private static final int CTRL_INDEX = 633;
  private static final String NAME = "onCustomRightButtonClick";
  private static d ivx;

  static
  {
    AppMethodBeat.i(87378);
    ivx = new d();
    AppMethodBeat.o(87378);
  }

  public static void c(u paramu)
  {
    AppMethodBeat.i(87377);
    ab.i("onCustomRightButtonClickEvent", "onCustomRightButtonClickEvent dispatch");
    ivx.i(paramu.xT()).aCj();
    AppMethodBeat.o(87377);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.b.d
 * JD-Core Version:    0.6.2
 */