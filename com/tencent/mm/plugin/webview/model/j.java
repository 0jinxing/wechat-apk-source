package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.azi;
import com.tencent.mm.protocal.protobuf.azj;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  String appId;
  private f eIc;
  final b ehh;
  String hep;

  public j(String paramString1, String paramString2)
  {
    AppMethodBeat.i(6592);
    this.appId = paramString1;
    this.hep = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new azi();
    ((b.a)localObject).fsK = new azj();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_downloadcdninfo";
    ((b.a)localObject).fsI = 1035;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (azi)this.ehh.fsG.fsP;
    ((azi)localObject).csB = paramString1;
    ((azi)localObject).wDu = paramString2;
    ab.i("MicroMsg.NetSceneDownloadCdnInfo", "download cdn info, appid : %s, mediaId : %s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(6592);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6594);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6594);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6593);
    ab.i("MicroMsg.NetSceneDownloadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6593);
  }

  public final int getType()
  {
    return 1035;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.j
 * JD-Core Version:    0.6.2
 */