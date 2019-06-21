package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.e.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "errType", "errCode", "resultCallback"})
final class e$a$a
  implements e.c
{
  e$a$a(e.b paramb, String paramString)
  {
  }

  public final int cr(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134657);
    ab.i(e.access$getTAG$cp(), "GetHDHeadImg errType=%d  errCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    e.b localb = this.hBO;
    if (localb != null)
    {
      o.acd();
      String str1 = d.C(this.hBP, false);
      String str2 = str1;
      if (str1 == null)
        str2 = "";
      localb.AQ(str2);
    }
    AppMethodBeat.o(134657);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.e.a.a
 * JD-Core Version:    0.6.2
 */