package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.avz;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class ad$2
  implements b.a
{
  ad$2(ad paramad, a.a parama, int paramInt)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(6335);
    ab.i("MicroMsg.JsApiLogin", "errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.mUf.a("fail", null);
      AppMethodBeat.o(6335);
    }
    while (true)
    {
      return;
      if (this.hmP == 2)
      {
        ab.d("MicroMsg.JsApiLogin", "press reject button");
        this.mUf.a("fail", null);
        AppMethodBeat.o(6335);
      }
      else
      {
        paramb = (avz)paramb.fsH.fsP;
        if ((paramb == null) || (paramb.wzH == null))
        {
          this.mUf.a("fail", null);
          AppMethodBeat.o(6335);
        }
        else
        {
          paramInt1 = paramb.wzH.cyE;
          paramString = paramb.wzH.cyF;
          ab.i("MicroMsg.JsApiLogin", "jsErrcode = %d", new Object[] { Integer.valueOf(paramInt1) });
          if (paramInt1 == 0)
          {
            paramString = paramb.wzO;
            new HashMap().put("code", paramString);
            this.mUf.a("", null);
            ab.d("MicroMsg.JsApiLogin", "resp data code [%s]", new Object[] { paramString });
            AppMethodBeat.o(6335);
          }
          else
          {
            this.mUf.a("fail", null);
            ab.e("MicroMsg.JsApiLogin", "errMsg = %s", new Object[] { paramString });
            AppMethodBeat.o(6335);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ad.2
 * JD-Core Version:    0.6.2
 */