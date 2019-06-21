package com.tencent.mm.plugin.music.model.b;

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
import com.tencent.mm.protocal.protobuf.aoa;
import com.tencent.mm.protocal.protobuf.aob;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private f ehi;
  private b fAT;
  private aoa oMI;
  public String oMJ;
  public String playUrl;

  public c(String paramString)
  {
    AppMethodBeat.i(104968);
    this.oMJ = "";
    this.playUrl = "";
    b.a locala = new b.a();
    locala.fsI = 769;
    locala.uri = "/cgi-bin/micromsg-bin/getshakemusicurl";
    locala.fsJ = new aoa();
    locala.fsK = new aob();
    this.fAT = locala.acD();
    this.oMI = ((aoa)this.fAT.fsG.fsP);
    this.oMI.wsy = paramString;
    this.playUrl = paramString;
    ab.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "request music url:%s", new Object[] { paramString });
    AppMethodBeat.o(104968);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(104969);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(104969);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(104970);
    ab.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(104970);
    }
    while (true)
    {
      return;
      paramq = (aob)this.fAT.fsH.fsP;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      if (paramq != null)
      {
        this.oMJ = paramq.wsy;
        ab.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "tempPlayUrl:%s", new Object[] { this.oMJ });
        AppMethodBeat.o(104970);
      }
      else
      {
        ab.e("MicroMsg.Music.NetSceneGetShakeMusicUrl", "response is null");
        AppMethodBeat.o(104970);
      }
    }
  }

  public final int getType()
  {
    return 769;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.b.c
 * JD-Core Version:    0.6.2
 */