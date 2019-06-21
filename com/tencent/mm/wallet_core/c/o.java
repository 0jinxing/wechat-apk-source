package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bvz;
import com.tencent.mm.protocal.protobuf.bwa;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

public final class o extends m
  implements k
{
  private com.tencent.mm.pluginsdk.wallet.b.a AfA;
  private int Afz;
  private final b ehh;
  private f ehi;

  public o(Map<String, Object> paramMap, String paramString1, String paramString2, int paramInt, com.tencent.mm.pluginsdk.wallet.b.a parama)
  {
    AppMethodBeat.i(49069);
    ab.i("MicroMsg.NetSceneJSAPISecureTunnel", "new pay sercuretunnel netscene url :" + paramString1 + " appid: " + paramString2);
    this.AfA = parama;
    parama = new com.tencent.mm.ai.b.a();
    parama.fsJ = new bvz();
    parama.fsK = new bwa();
    parama.uri = "/cgi-bin/mmpay-bin/securetunnel";
    this.Afz = 2632;
    parama.fsI = this.Afz;
    if (paramMap.containsKey("timeout"))
      parama.azs = ((Integer)paramMap.get("timeout")).intValue();
    this.ehh = parama.acD();
    parama = (bvz)this.ehh.fsG.fsP;
    parama.wWO = ((String)paramMap.get("reqbuf"));
    parama.wap = ((String)paramMap.get("cmd"));
    parama.url = paramString1;
    parama.csB = paramString2;
    parama.scene = paramInt;
    parama.cvd = 0;
    AppMethodBeat.o(49069);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(49071);
    this.ehi = paramf;
    ab.d("MicroMsg.NetSceneJSAPISecureTunnel", "doScene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(49071);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(49070);
    ab.i("MicroMsg.NetSceneJSAPISecureTunnel", "onGYNetEnd, netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (this.AfA != null)
    {
      ab.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback");
      if ((paramInt2 == 0) && (paramInt3 == 0))
        break label121;
      ab.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback fail");
      this.AfA.BD(paramString);
    }
    while (true)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(49070);
      return;
      label121: ab.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback success");
      this.AfA.onSuccess(((bwa)this.ehh.fsH.fsP).wWP);
    }
  }

  public final int getType()
  {
    return this.Afz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.o
 * JD-Core Version:    0.6.2
 */