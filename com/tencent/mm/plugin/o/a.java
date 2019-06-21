package com.tencent.mm.plugin.o;

import android.content.Context;
import android.graphics.Typeface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.pluginsdk.wallet.b.a;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.protocal.protobuf.biv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.ui.e;
import java.util.Map;

public final class a
  implements com.tencent.mm.pluginsdk.wallet.b
{
  public final void a(Map<String, Object> paramMap, String paramString1, String paramString2, int paramInt, b.a parama)
  {
    AppMethodBeat.i(55856);
    ab.i("MicroMsg.WxPaySevice", "start jsapi securetunnel");
    paramMap = new o(paramMap, paramString1, paramString2, paramInt, parama);
    g.RQ();
    g.RO().eJo.a(paramMap, 0);
    AppMethodBeat.o(55856);
  }

  public final biv bQO()
  {
    AppMethodBeat.i(55857);
    biv localbiv = k.bQO();
    AppMethodBeat.o(55857);
    return localbiv;
  }

  public final void eA(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55858);
    ab.i("MicroMsg.WxPaySevice", "reportLocation %s %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    k.Hp(paramInt1);
    if (k.cPy() != null)
      h.pYm.e(17162, new Object[] { Integer.valueOf(paramInt2), k.cPy().vCI, k.cPy().vCH, k.cPy().vCJ });
    AppMethodBeat.o(55858);
  }

  public final Typeface ex(Context paramContext)
  {
    AppMethodBeat.i(55855);
    paramContext = e.ex(paramContext);
    AppMethodBeat.o(55855);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.o.a
 * JD-Core Version:    0.6.2
 */