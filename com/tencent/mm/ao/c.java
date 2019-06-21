package com.tencent.mm.ao;

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
import com.tencent.mm.protocal.protobuf.awp;
import com.tencent.mm.protocal.protobuf.awq;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private f ehi;
  private final b fAT;
  public Object tag;

  public c(String paramString)
  {
    AppMethodBeat.i(62294);
    b.a locala = new b.a();
    locala.fsJ = new awp();
    locala.fsK = new awq();
    locala.uri = "/cgi-bin/micromsg-bin/jumpemotiondetail";
    locala.fsI = 666;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fAT = locala.acD();
    ((awp)this.fAT.fsG.fsP).Url = paramString;
    AppMethodBeat.o(62294);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(62295);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(62295);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(62296);
    ab.d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      ab.d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:net end ok");
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(62296);
  }

  public final awq agd()
  {
    return (awq)this.fAT.fsH.fsP;
  }

  public final int getType()
  {
    return 666;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ao.c
 * JD-Core Version:    0.6.2
 */