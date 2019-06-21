package com.tencent.mm.plugin.address.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.wv;
import com.tencent.mm.protocal.protobuf.ww;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;

  public a(int paramInt)
  {
    AppMethodBeat.i(16722);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new wv();
    ((b.a)localObject).fsK = new ww();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
    ((b.a)localObject).fsI = 1194;
    this.ehh = ((b.a)localObject).acD();
    localObject = (wv)this.ehh.fsG.fsP;
    ((wv)localObject).wcQ = "invoice_info";
    ((wv)localObject).wcR = paramInt;
    ((wv)localObject).cvd = 2;
    AppMethodBeat.o(16722);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16724);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16724);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16723);
    ab.d("MicroMsg.NetSceneDeleteUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      ab.i("MicroMsg.NetSceneDeleteUserAutoFillInfo", "");
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16723);
  }

  public final int getType()
  {
    return 1194;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.a
 * JD-Core Version:    0.6.2
 */