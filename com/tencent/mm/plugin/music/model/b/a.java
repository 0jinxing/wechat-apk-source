package com.tencent.mm.plugin.music.model.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.rl;
import com.tencent.mm.protocal.protobuf.rm;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private f ehi;
  private b fAT;
  public rl oMF;

  public a(int paramInt, com.tencent.mm.plugin.music.model.e.a parama)
  {
    AppMethodBeat.i(104962);
    b.a locala = new b.a();
    locala.fsI = 940;
    locala.uri = "/cgi-bin/micromsg-bin/checkmusic";
    locala.fsJ = new rl();
    locala.fsK = new rm();
    this.fAT = locala.acD();
    this.oMF = ((rl)this.fAT.fsG.fsP);
    this.oMF.Scene = paramInt;
    this.oMF.fKh = parama.field_appId;
    this.oMF.vYH = parama.field_songAlbumUrl;
    this.oMF.vYI = parama.field_songHAlbumUrl;
    this.oMF.vYK = parama.field_songWifiUrl;
    this.oMF.vYL = parama.field_songWapLinkUrl;
    this.oMF.vYJ = parama.field_songWebUrl;
    this.oMF.Title = parama.field_songName;
    this.oMF.fJU = parama.field_musicId;
    AppMethodBeat.o(104962);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(104963);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(104963);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(104964);
    ab.i("MicroMsg.Music.NetSceneCheckMusic", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(104964);
  }

  public final int getType()
  {
    return 940;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.b.a
 * JD-Core Version:    0.6.2
 */