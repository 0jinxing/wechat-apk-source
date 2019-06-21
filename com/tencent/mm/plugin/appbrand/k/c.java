package com.tencent.mm.plugin.appbrand.k;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.awc;
import com.tencent.mm.protocal.protobuf.awd;
import com.tencent.mm.protocal.protobuf.cxh;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private f eIc;
  public final com.tencent.mm.ai.b ehh;
  private c.a<c> iod;

  private c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(132312);
    ab.i("MicroMsg.webview.NetSceneJSOperateWxData", "NetSceneJSLogin doScene appId [%s], data [%s], grantScope [%s], versionType [%d], opt [%d], extScene [%d]", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new awc();
    ((b.a)localObject).fsK = new awd();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-operatewxdata";
    ((b.a)localObject).fsI = 1133;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (awc)this.ehh.fsG.fsP;
    ((awc)localObject).fKh = paramString1;
    if (paramString2.getBytes() == null);
    for (paramString1 = new byte[0]; ; paramString1 = paramString2.getBytes())
    {
      ((awc)localObject).jBi = new com.tencent.mm.bt.b(paramString1);
      ((awc)localObject).wzR = paramString3;
      ((awc)localObject).wzF = paramInt1;
      ((awc)localObject).wzE = paramInt2;
      if (paramInt3 > 0)
      {
        ((awc)localObject).wzG = new cxh();
        ((awc)localObject).wzG.scene = paramInt3;
      }
      AppMethodBeat.o(132312);
      return;
    }
  }

  public c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, c.a<c> parama)
  {
    this(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3);
    this.iod = parama;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(132315);
    ab.i("MicroMsg.webview.NetSceneJSOperateWxData", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(132315);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(132314);
    ab.i("MicroMsg.webview.NetSceneJSOperateWxData", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.iod != null)
      this.iod.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(132314);
  }

  public final int getType()
  {
    return 1133;
  }

  public final void pm(int paramInt)
  {
    AppMethodBeat.i(132313);
    awc localawc = (awc)this.ehh.fsG.fsP;
    if (localawc.wzG == null)
      localawc.wzG = new cxh();
    localawc.wzG.xsJ = paramInt;
    AppMethodBeat.o(132313);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k.c
 * JD-Core Version:    0.6.2
 */