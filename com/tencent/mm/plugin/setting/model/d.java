package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.adm;
import com.tencent.mm.protocal.protobuf.adn;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  private b ehh;
  private f ehi;

  public d(String paramString)
  {
    AppMethodBeat.i(126844);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new adm();
    ((b.a)localObject).fsK = new adn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/generalset";
    ((b.a)localObject).fsI = 177;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (adm)this.ehh.fsG.fsP;
    ((adm)localObject).SetType = 1;
    ((adm)localObject).wlj = paramString;
    AppMethodBeat.o(126844);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(126845);
    ab.d("MicroMsg.NetSceneGeneralSet", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(126845);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126846);
    ab.d("MicroMsg.NetSceneGeneralSet", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(126846);
  }

  public final int getType()
  {
    return 177;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.d
 * JD-Core Version:    0.6.2
 */