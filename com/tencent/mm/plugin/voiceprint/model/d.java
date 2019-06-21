package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.apz;
import com.tencent.mm.protocal.protobuf.aqa;
import com.tencent.mm.protocal.protobuf.bsx;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  private final b ehh;
  private f ehi;
  String sKW;
  int sKX;
  String sKY;

  public d(int paramInt, String paramString)
  {
    AppMethodBeat.i(26078);
    this.sKW = "";
    this.sKX = 0;
    this.sKY = "";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new apz();
    ((b.a)localObject).fsK = new aqa();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getvoiceprintresource";
    ((b.a)localObject).fsI = 611;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (apz)this.ehh.fsG.fsP;
    ab.i("MicroMsg.NetSceneGetVoicePrintResource", "sceneType %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    ((apz)localObject).wub = paramInt;
    ((apz)localObject).wuc = paramString;
    AppMethodBeat.o(26078);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26079);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(26079);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26080);
    ab.d("MicroMsg.NetSceneGetVoicePrintResource", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (aqa)((b)paramq).fsH.fsP;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26080);
      return;
    }
    if (paramq.wud != null)
    {
      this.sKW = new String(paramq.wud.wVc.getBufferToBytes());
      this.sKX = paramq.wud.wTu;
      ab.d("MicroMsg.NetSceneGetVoicePrintResource", "vertify resid %d mtext %s", new Object[] { Integer.valueOf(this.sKX), this.sKW });
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26080);
      break;
      ab.e("MicroMsg.NetSceneGetVoicePrintResource", "resp ResourceData null ");
    }
  }

  public final int getType()
  {
    return 611;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.d
 * JD-Core Version:    0.6.2
 */