package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.afv;
import com.tencent.mm.protocal.protobuf.afw;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  public b ehh;
  private f ehi;

  public m(String paramString1, String paramString2, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(6601);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new afv();
    ((b.a)localObject).fsK = new afw();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizjsapiredirecturl";
    ((b.a)localObject).fsI = 1393;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (afv)this.ehh.fsG.fsP;
    ((afv)localObject).wbO = paramString1;
    ((afv)localObject).vOV = paramString2;
    ((afv)localObject).wmY = ((String)paramMap.get("groupId"));
    ((afv)localObject).tyv = ((String)paramMap.get("timestamp"));
    ((afv)localObject).kmt = ((String)paramMap.get("nonceStr"));
    ((afv)localObject).signature = ((String)paramMap.get("signature"));
    ((afv)localObject).wmZ = paramMap.get("params").toString();
    AppMethodBeat.o(6601);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6603);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6603);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6602);
    ab.d("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6602);
  }

  public final afw cXw()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (afw localafw = (afw)this.ehh.fsH.fsP; ; localafw = null)
      return localafw;
  }

  public final int getType()
  {
    return 1393;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.m
 * JD-Core Version:    0.6.2
 */