package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.avv;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2
  implements b.a
{
  c$2(c paramc, a.a parama, int paramInt)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(6280);
    ab.i("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.mUf.a("fail", null);
      AppMethodBeat.o(6280);
    }
    while (true)
    {
      return;
      if (this.hmP == 2)
      {
        ab.d("MicroMsg.JsApiAuthorize", "press reject button");
        this.mUf.a("fail", null);
        AppMethodBeat.o(6280);
      }
      else
      {
        paramString = (avv)paramb.fsH.fsP;
        if ((paramString == null) || (paramString.wzH == null))
        {
          this.mUf.a("fail", null);
          AppMethodBeat.o(6280);
        }
        else
        {
          paramInt1 = paramString.wzH.cyE;
          paramString = paramString.wzH.cyF;
          ab.i("MicroMsg.JsApiAuthorize", "jsErrcode = %d", new Object[] { Integer.valueOf(paramInt1) });
          if (paramInt1 == 0)
          {
            this.mUf.a("", null);
            AppMethodBeat.o(6280);
          }
          else
          {
            ab.e("MicroMsg.JsApiAuthorize", "ERROR = %s", new Object[] { paramString });
            this.mUf.a("fail", null);
            AppMethodBeat.o(6280);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.c.2
 * JD-Core Version:    0.6.2
 */