package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.avx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class c$1
  implements b.a
{
  c$1(c paramc, a.a parama, String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(6279);
    ab.i("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.mUf.a("fail", null);
      AppMethodBeat.o(6279);
    }
    while (true)
    {
      return;
      paramb = (avx)paramb.fsH.fsP;
      if ((paramb == null) || (paramb.wzH == null))
      {
        this.mUf.a("fail", null);
        AppMethodBeat.o(6279);
      }
      else
      {
        paramInt1 = paramb.wzH.cyE;
        paramString = paramb.wzH.cyF;
        ab.i("MicroMsg.JsApiAuthorize", "jsErrcode = %d", new Object[] { Integer.valueOf(paramInt1) });
        if (paramInt1 == -12000)
        {
          al.d(new c.1.1(this, paramb.wlE, paramb.ncH, paramb.vDm));
          AppMethodBeat.o(6279);
        }
        else if (paramInt1 == 0)
        {
          this.mUf.a("", null);
          AppMethodBeat.o(6279);
        }
        else
        {
          ab.e("MicroMsg.JsApiAuthorize", "ERROR = %s", new Object[] { paramString });
          this.mUf.a("fail", null);
          AppMethodBeat.o(6279);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.c.1
 * JD-Core Version:    0.6.2
 */