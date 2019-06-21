package com.tencent.mm.ui.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.o;

final class c$3
  implements ap.a
{
  c$3(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(29960);
    c localc = this.yrv;
    ab.d("MicroMsg.AppBrandServiceImageBubble", "hide");
    if (localc.vot != null)
      localc.vot.dismiss();
    AppMethodBeat.o(29960);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.c.3
 * JD-Core Version:    0.6.2
 */