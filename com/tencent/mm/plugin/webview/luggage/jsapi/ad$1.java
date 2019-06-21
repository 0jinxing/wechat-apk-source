package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.awb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.LinkedList;

final class ad$1
  implements b.a
{
  ad$1(ad paramad, a.a parama, String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(6334);
    ab.i("MicroMsg.JsApiLogin", "errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.mUf.a("fail", null);
      AppMethodBeat.o(6334);
    }
    while (true)
    {
      return;
      paramb = (awb)paramb.fsH.fsP;
      if ((paramb == null) || (paramb.wzH == null))
      {
        this.mUf.a("fail", null);
        AppMethodBeat.o(6334);
      }
      else
      {
        paramInt1 = paramb.wzH.cyE;
        String str = paramb.wzH.cyF;
        paramString = paramb.wzN;
        ab.i("MicroMsg.JsApiLogin", "NetSceneJSLogin jsErrcode %d", new Object[] { Integer.valueOf(paramInt1) });
        if (paramInt1 == -12000)
        {
          LinkedList localLinkedList = paramb.wlE;
          str = paramb.ncH;
          paramb = paramb.vDm;
          ab.d("MicroMsg.JsApiLogin", "appName %s, appIconUrl %s", new Object[] { str, paramb });
          al.d(new ad.1.1(this, paramString, localLinkedList, str, paramb));
          AppMethodBeat.o(6334);
        }
        else if (paramInt1 == 0)
        {
          paramString = paramb.wzO;
          new HashMap().put("code", paramString);
          ab.d("MicroMsg.JsApiLogin", "resp data code [%s]", new Object[] { paramString });
          this.mUf.a("", null);
          AppMethodBeat.o(6334);
        }
        else
        {
          ab.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin %s", new Object[] { str });
          this.mUf.a("fail", null);
          AppMethodBeat.o(6334);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ad.1
 * JD-Core Version:    0.6.2
 */