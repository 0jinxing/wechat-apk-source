package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.bwa;
import com.tencent.mm.sdk.platformtools.ab;

final class m$2
  implements com.tencent.mm.ipcinvoker.wx_extension.b.a
{
  m$2(m paramm, com.tencent.mm.pluginsdk.wallet.b.a parama)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(131363);
    ab.i("MicroMsg.JsApiSecureTunnel", "onGYNetEnd errType :" + paramInt1 + " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramb.fsH.fsP == null))
    {
      ab.e("MicroMsg.JsApiSecureTunnel", "secureTunnel cgi failed");
      this.hRR.BD(paramString);
      AppMethodBeat.o(131363);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiSecureTunnel", "secureTunnel cgi success");
      paramString = ((bwa)paramb.fsH.fsP).wWP;
      this.hRR.onSuccess(paramString);
      AppMethodBeat.o(131363);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.m.2
 * JD-Core Version:    0.6.2
 */