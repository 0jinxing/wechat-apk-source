package com.tencent.mm.plugin.appbrand;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.permission.e.a;
import com.tencent.mm.plugin.appbrand.permission.e.b;

final class c$1
  implements e.b
{
  c$1(c paramc, c.a parama, m paramm)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(101709);
    if ((this.gMM.gMJ == null) || (!this.gMM.gMJ.isRunning()))
      AppMethodBeat.o(101709);
    while (true)
    {
      return;
      if (parama.ret != 0)
        break;
      this.gMK.proceed();
      AppMethodBeat.o(101709);
    }
    if (TextUtils.isEmpty(parama.bzH));
    for (parama = "fail:internal error"; ; parama = parama.bzH)
    {
      this.gMK.AH(this.gML.j(parama, null));
      AppMethodBeat.o(101709);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.c.1
 * JD-Core Version:    0.6.2
 */